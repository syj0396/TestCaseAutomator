import javalang
def extract_method_calls(java_code: str, method_name: str):
    # Java 코드 파싱
    tree = javalang.parse.parse(java_code)
    # 특정 메소드 찾기
    method_calls = []
    for path, node in tree.filter(javalang.tree.MethodDeclaration):
        if node.name == method_name:
            # 해당 메소드 내에서 호출된 메소드들 추출
            for path, sub_node in node.filter(javalang.tree.MethodInvocation):
                method_calls.append(sub_node.member)
    return method_calls

# 예시 Java 코드
java_code = """
public class Example {
    public void exampleMethod() {
        anotherMethod();
        yetAnotherMethod();
    }
    public void anotherMethod() {
        // ...
    }
    public void yetAnotherMethod() {
        // ...
    }
}
"""
# 특정 메소드 내에서 호출된 메소드 추출
method_calls = extract_method_calls(java_code, "exampleMethod")
print(method_calls)