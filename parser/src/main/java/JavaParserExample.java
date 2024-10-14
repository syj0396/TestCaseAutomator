import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class JavaParserExample {

    public static String getSampleValue(String fieldType) {
        switch (fieldType) {
            case "String":
                return "\"sample_value\"";
            case "Long":
                return "1L";
            case "int":
                return "1";
            case "boolean":
                return "true";
            default:
                return "\"default_value\"";
        }
    }

    public static String getSampleUserList(List<String> userFieldTypes) {
        StringBuilder userList = new StringBuilder("List<User> users = Arrays.asList(");

        for (int i = 0; i < 3; i++) {
            userList.append("new User(");
            for (int j = 0; j < userFieldTypes.size(); j++) {
                userList.append(getSampleValue(userFieldTypes.get(j)));
                if (j < userFieldTypes.size() - 1) {
                    userList.append(", ");
                }
            }
            userList.append(")");
            if (i < 2) {
                userList.append(", ");
            }
        }

        userList.append(");");
        return userList.toString();
    }

    public static void main(String[] args) throws IOException {
        String userServiceCode = new String(Files.readAllBytes(Paths.get("D:\\graduation\\parser\\src\\main\\java\\UserService.txt")), StandardCharsets.UTF_8);
        String userClassCode = new String(Files.readAllBytes(Paths.get("D:\\graduation\\parser\\src\\main\\java\\User.txt")), StandardCharsets.UTF_8);

        JavaParser parser = new JavaParser();
        CompilationUnit userServiceCu = parser.parse(userServiceCode).getResult().get();
        CompilationUnit userClassCu = parser.parse(userClassCode).getResult().get();

        List<String> userFieldTypes = new ArrayList<>();
        userClassCu.findAll(ClassOrInterfaceDeclaration.class).forEach(clazz -> {
            if (clazz.getNameAsString().equals("User")) {
                clazz.findAll(FieldDeclaration.class).forEach(field -> {
                    String fieldType = field.getElementType().toString();
                    userFieldTypes.add(fieldType);
                });
            }
        });

        VoidVisitorAdapter<Void> visitor = new VoidVisitorAdapter<Void>() {
            @Override
            public void visit(MethodCallExpr call, Void arg) {
                super.visit(call, arg);

                if (call.getNameAsString().equals("findById")) {
                    MethodCallExpr newUserExpr = new MethodCallExpr("new User");

                    for (String fieldType : userFieldTypes) {
                        newUserExpr.addArgument(getSampleValue(fieldType));
                    }

                    Expression scope = call.getScope().orElse(null);
                    if (scope != null && scope.toString().contains("orElseThrow")) {
                        call.replace(newUserExpr);
                    } else {
                        call.replace(newUserExpr);
                    }
                }

                else if (call.getNameAsString().equals("save")) {
                    MethodCallExpr printCall = new MethodCallExpr("System.out.println")
                            .addArgument("\"Code has been replaced.\"");
                    call.replace(printCall);
                }

                else if (call.getNameAsString().equals("deleteById")) {
                    MethodCallExpr printCall = new MethodCallExpr("System.out.println")
                            .addArgument("\"Delete operation replaced.\"");
                    call.replace(printCall);
                }

                else if (call.getNameAsString().equals("findAll")) {
                    String userList = getSampleUserList(userFieldTypes);
                    MethodCallExpr userListExpr = new MethodCallExpr(userList);
                    call.replace(userListExpr);
                }
            }
        };

        visitor.visit(userServiceCu, null);

        String modifiedCode = userServiceCu.toString();
        String outputPath = "D:\\graduation\\parser\\src\\main\\java\\UserServiceModified.java";

        Files.write(Paths.get(outputPath), modifiedCode.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        System.out.println("Modified Code saved to: " + outputPath);
    }
}