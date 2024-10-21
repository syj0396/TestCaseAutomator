import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.example.randoop609.dto.UserDto.LoginRequest loginRequest0 = new com.example.randoop609.dto.UserDto.LoginRequest();
        java.lang.Class<?> wildcardClass1 = loginRequest0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.example.randoop609.dto.UserDto userDto0 = new com.example.randoop609.dto.UserDto();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setStudentId("hi!");
        user6.setNickname("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        user6.setEmail("");
        java.lang.Class<?> wildcardClass12 = user6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.studentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.Class<?> wildcardClass9 = userBuilder6.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user8 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str9 = user8.getUsername();
        user8.setUsername("");
        java.lang.String str12 = user8.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        java.lang.String str10 = user6.getPassword();
        user6.setEmail("");
        java.lang.String str13 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getNickname();
        java.lang.String str9 = response7.getUsername();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.studentId("hi!");
        java.lang.Class<?> wildcardClass6 = userBuilder5.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user8 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str9 = user8.getUsername();
        user8.setUsername("");
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.nickname("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        java.util.List<com.example.randoop609.domain.User> userList2 = userServiceModified1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        java.lang.String str10 = user6.getPassword();
        user6.setEmail("");
        java.lang.String str13 = user6.getNickname();
        java.lang.String str14 = user6.getNickname();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        java.lang.String str10 = user6.getPassword();
        user6.setEmail("");
        user6.setUsername("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        com.example.randoop609.dto.UserDto.Response response10 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str11 = response10.getUsername();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setPassword("hi!");
        java.lang.String str4 = signUpForm0.getNickname();
        signUpForm0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.studentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str9 = userBuilder6.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))" + "'", str9, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.id((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 10L, "hi!", "", "hi!", "", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        java.lang.String str5 = userBuilder4.toString();
        java.lang.String str6 = userBuilder4.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)" + "'", str5, "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)" + "'", str6, "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        user6.setEmail("");
        java.lang.String str12 = user6.getStudentId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        user6.setEmail("");
        user6.setNickname("");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        java.lang.String str10 = user6.getPassword();
        user6.setEmail("");
        user6.setNickname("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str10 = user6.getStudentId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setEmail("");
        user6.setPassword("");
        java.lang.String str12 = user6.getNickname();
        user6.setEmail("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user13 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        user13.setStudentId("");
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getRePassword();
        java.lang.String str7 = signUpForm0.getStudentId();
        java.lang.String str8 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.studentId("");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        java.lang.Class<?> wildcardClass9 = userBuilder8.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        user6.setStudentId("");
        user6.setPassword("hi!");
        java.lang.String str11 = user6.getPassword();
        user6.setId((java.lang.Long) 0L);
        user6.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "", "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "");
        java.lang.String str7 = user6.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 0L);
        java.lang.String str9 = user8.getNickname();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nanpmuormr" + "'", str9, "nanpmuormr");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setStudentId("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        user6.setStudentId("");
        user6.setPassword("hi!");
        java.lang.String str11 = user6.getPassword();
        user6.setEmail("qbehvmnnrs");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        java.lang.String str10 = user6.getStudentId();
        user6.setUsername("");
        java.lang.String str13 = user6.getUsername();
        user6.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        java.lang.String str16 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setNickname("hi!");
        java.lang.String str9 = putRequest4.getStudentId();
        putRequest4.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setPassword("hi!");
        java.lang.String str4 = signUpForm0.getPassword();
        signUpForm0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.email("");
        com.example.randoop609.domain.User user11 = userBuilder2.build();
        java.lang.String str12 = user11.getNickname();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        signUpForm0.setUsername("hi!");
        signUpForm0.setPassword("hi!");
        signUpForm0.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        signUpForm0.setNickname("nanpmuormr");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.email("");
        com.example.randoop609.domain.User user11 = userBuilder2.build();
        user11.setId((java.lang.Long) 10L);
        user11.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(user11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.email("");
        com.example.randoop609.domain.User user11 = userBuilder2.build();
        user11.setPassword("qbehvmnnrs");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(user11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 0L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest9 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest9, (java.lang.Long) 10L);
        com.example.randoop609.domain.User user18 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str19 = user18.getUsername();
        user18.setEmail("");
        user18.setPassword("");
        java.lang.String str24 = user18.getNickname();
        java.lang.String str25 = user18.getNickname();
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user8 = new com.example.randoop609.domain.User((java.lang.Long) 10L, "hi!", "", "hi!", "", "hi!");
        com.example.randoop609.dto.UserDto.Response response9 = new com.example.randoop609.dto.UserDto.Response(user8);
        java.lang.String str10 = user8.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        user6.setStudentId("");
        user6.setPassword("hi!");
        java.lang.String str11 = user6.getPassword();
        user6.setId((java.lang.Long) 0L);
        user6.setUsername("qbehvmnnrs");
        java.lang.String str16 = user6.getNickname();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)" + "'", str16, "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 10L, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)", "nanpmuormr", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        java.lang.String str2 = signUpForm0.getUsername();
        java.lang.String str3 = signUpForm0.getRePassword();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        user4.setStudentId("qbehvmnnrs");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder10.email("hi!");
        com.example.randoop609.domain.User user15 = userBuilder10.build();
        java.lang.String str16 = userBuilder10.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder18 = userBuilder10.email("");
        com.example.randoop609.domain.User user19 = userBuilder10.build();
        java.lang.String str20 = user19.getStudentId();
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str16, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder18);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setPassword("hi!");
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getPassword();
        java.lang.String str6 = signUpForm0.getPassword();
        java.lang.String str7 = signUpForm0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "qbehvmnnrs", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setNickname("");
        java.lang.String str3 = signUpForm0.getStudentId();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.email("hi!");
        com.example.randoop609.domain.User user11 = userBuilder10.build();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(user11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        com.example.randoop609.domain.User user6 = signUpForm0.toEntity();
        java.lang.String str7 = user6.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder2.nickname("nanpmuormr");
        com.example.randoop609.domain.User user15 = userBuilder14.build();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str2 = authResponse1.getToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str2, "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 0L);
        java.lang.String str9 = user8.getUsername();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hvqlwkauhv" + "'", str9, "hvqlwkauhv");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getRePassword();
        java.lang.String str7 = signUpForm0.getStudentId();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        java.lang.String str10 = signUpForm0.getPassword();
        com.example.randoop609.domain.User user11 = signUpForm0.toEntity();
        java.lang.Class<?> wildcardClass12 = user11.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setUsername("hi!");
        java.lang.String str9 = putRequest4.getStudentId();
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder3.studentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder7.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder9.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder9.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder15 = userBuilder9.nickname("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(userBuilder13);
        org.junit.Assert.assertNotNull(userBuilder15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        java.lang.String str2 = signUpForm0.getUsername();
        java.lang.String str3 = signUpForm0.getRePassword();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        user4.setUsername("hvqlwkauhv");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        java.lang.String str2 = signUpForm0.getUsername();
        signUpForm0.setUsername("qbehvmnnrs");
        signUpForm0.setNickname("nanpmuormr");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        user6.setStudentId("");
        user6.setPassword("hi!");
        user6.setPassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        user6.setId((java.lang.Long) 1L);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        user6.setStudentId("");
        user6.setPassword("hi!");
        java.lang.String str11 = user6.getPassword();
        user6.setId((java.lang.Long) 0L);
        user6.setUsername("qbehvmnnrs");
        java.lang.String str16 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str16, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        signUpForm0.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        signUpForm0.setStudentId("nanpmuormr");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setEmail("");
        java.lang.String str10 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        signUpForm0.setUsername("hi!");
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(user4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setNickname("qbehvmnnrs");
        java.lang.String str9 = putRequest4.getUsername();
        java.lang.String str10 = putRequest4.getStudentId();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        user6.setStudentId("");
        user6.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        user6.setStudentId("");
        java.lang.String str9 = user6.getNickname();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hvqlwkauhv", "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "qbehvmnnrs");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        java.lang.String str10 = user6.getStudentId();
        java.lang.String str11 = user6.getEmail();
        user6.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str14 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.studentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.id((java.lang.Long) 0L);
        java.lang.String str11 = userBuilder10.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))" + "'", str11, "User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getPassword();
        signUpForm0.setRePassword("");
        java.lang.String str4 = signUpForm0.getRePassword();
        java.lang.String str5 = signUpForm0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getUsername();
        putRequest0.setUsername("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getNickname();
        user6.setId((java.lang.Long) 100L);
        user6.setId((java.lang.Long) 1L);
        java.lang.String str12 = user6.getStudentId();
        user6.setId((java.lang.Long) 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder3.studentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder7.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder9.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder9.id((java.lang.Long) 10L);
        java.lang.String str14 = userBuilder9.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(userBuilder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))" + "'", str14, "User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "qbehvmnnrs", "qbehvmnnrs", "User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)", "User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder6.email("qbehvmnnrs");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder12.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder14.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(userBuilder16);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getPassword();
        signUpForm0.setRePassword("");
        java.lang.String str4 = signUpForm0.getUsername();
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        user6.setStudentId("");
        user6.setPassword("hi!");
        java.lang.String str11 = user6.getPassword();
        user6.setId((java.lang.Long) 0L);
        user6.setEmail("hi!");
        com.example.randoop609.dto.UserDto.Response response16 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str17 = response16.getStudentId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        com.example.randoop609.domain.User user5 = userServiceModified1.getUser((java.lang.Long) 1L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest6 = null;
        userServiceModified1.editUser(putRequest6, (java.lang.Long) 100L);
        userServiceModified1.deleteUser((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder3.studentId("");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder3.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder3.id((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setPassword("hi!");
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getPassword();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setStudentId("hi!");
        user6.setId((java.lang.Long) 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getPassword();
        signUpForm0.setRePassword("");
        java.lang.String str4 = signUpForm0.getUsername();
        signUpForm0.setPassword("");
        signUpForm0.setRePassword("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setUsername("hi!");
        putRequest4.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.Class<?> wildcardClass11 = putRequest4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)", "User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))", "nanpmuormr", "User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getStudentId();
        java.lang.String str9 = response7.getNickname();
        java.lang.String str10 = response7.getNickname();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        com.example.randoop609.domain.User user6 = userServiceModified1.getUser((java.lang.Long) (-1L));
        com.example.randoop609.repository.UserRepository userRepository7 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified8 = new com.example.randoop609.service.UserServiceModified(userRepository7);
        com.example.randoop609.domain.User user10 = userServiceModified8.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList11 = userServiceModified8.getAllUsers();
        userServiceModified8.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user15 = userServiceModified8.getUser((java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList16 = userServiceModified8.getAllUsers();
        com.example.randoop609.domain.User user18 = userServiceModified8.getUser((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(user18);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList7 = userServiceModified1.getAllUsers();
        com.example.randoop609.domain.User user14 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response15 = new com.example.randoop609.dto.UserDto.Response(user14);
        user14.setStudentId("hi!");
        com.example.randoop609.dto.UserDto.Response response18 = new com.example.randoop609.dto.UserDto.Response(user14);
        user14.setNickname("");
        user14.setId((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setUsername("");
        java.lang.String str10 = user6.getEmail();
        java.lang.String str11 = user6.getStudentId();
        user6.setStudentId("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        signUpForm0.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str5 = signUpForm0.getPassword();
        com.example.randoop609.domain.User user6 = signUpForm0.toEntity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)" + "'", str5, "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        com.example.randoop609.repository.UserRepository userRepository7 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified8 = new com.example.randoop609.service.UserServiceModified(userRepository7);
        com.example.randoop609.domain.User user10 = userServiceModified8.getUser((java.lang.Long) 100L);
        com.example.randoop609.repository.UserRepository userRepository11 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified12 = new com.example.randoop609.service.UserServiceModified(userRepository11);
        userServiceModified12.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest15 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified12.editUser(putRequest15, (java.lang.Long) 0L);
        userServiceModified8.editUser(putRequest15, (java.lang.Long) 10L);
        putRequest15.setNickname("qbehvmnnrs");
        userServiceModified1.editUser(putRequest15, (java.lang.Long) 0L);
        java.lang.String str24 = putRequest15.getNickname();
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "qbehvmnnrs" + "'", str24, "qbehvmnnrs");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setStudentId("hi!");
        putRequest4.setNickname("");
        java.lang.String str11 = putRequest4.getUsername();
        java.lang.String str12 = putRequest4.getUsername();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.password("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder6.password("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList9 = userServiceModified1.getAllUsers();
        com.example.randoop609.domain.User user11 = userServiceModified1.getUser((java.lang.Long) 100L);
        user11.setNickname("");
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        signUpForm0.setStudentId("");
        signUpForm0.setRePassword("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        signUpForm0.setStudentId("hvqlwkauhv");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        user6.setEmail("");
        user6.setId((java.lang.Long) 100L);
        java.lang.String str14 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.example.randoop609.dto.UserDto.LoginRequest loginRequest0 = new com.example.randoop609.dto.UserDto.LoginRequest();
        java.lang.String str1 = loginRequest0.getUsername();
        java.lang.String str2 = loginRequest0.getUsername();
        java.lang.Class<?> wildcardClass3 = loginRequest0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        signUpForm0.setUsername("hi!");
        signUpForm0.setPassword("hi!");
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        java.lang.String str2 = signUpForm0.getUsername();
        signUpForm0.setUsername("qbehvmnnrs");
        signUpForm0.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setStudentId("hi!");
        putRequest4.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        putRequest4.setStudentId("User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        putRequest4.setUsername("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder3.studentId("");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder3.studentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder0.studentId("qbehvmnnrs");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 0L);
        user8.setStudentId("hi!");
        java.lang.String str11 = user8.getStudentId();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.example.randoop609.dto.UserDto.LoginRequest loginRequest0 = new com.example.randoop609.dto.UserDto.LoginRequest();
        java.lang.String str1 = loginRequest0.getPassword();
        java.lang.String str2 = loginRequest0.getUsername();
        java.lang.String str3 = loginRequest0.getUsername();
        java.lang.String str4 = loginRequest0.getPassword();
        java.lang.String str5 = loginRequest0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str6 = signUpForm0.getNickname();
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        java.lang.String str8 = signUpForm0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.nickname("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getPassword();
        signUpForm0.setRePassword("");
        java.lang.String str4 = signUpForm0.getUsername();
        signUpForm0.setPassword("");
        signUpForm0.setUsername("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setEmail("");
        user6.setPassword("");
        java.lang.String str12 = user6.getNickname();
        java.lang.String str13 = user6.getNickname();
        java.lang.String str14 = user6.getEmail();
        java.lang.String str15 = user6.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getNickname();
        java.lang.String str8 = user6.getUsername();
        java.lang.String str9 = user6.getUsername();
        java.lang.String str10 = user6.getStudentId();
        user6.setEmail("User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getPassword();
        signUpForm0.setRePassword("");
        java.lang.String str4 = signUpForm0.getUsername();
        signUpForm0.setPassword("");
        signUpForm0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        java.lang.String str2 = signUpForm0.getUsername();
        java.lang.String str3 = signUpForm0.getRePassword();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        java.lang.String str5 = signUpForm0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User user13 = userBuilder2.build();
        java.lang.Long long14 = user13.getId();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        java.lang.String str2 = signUpForm0.getUsername();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setRePassword("User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str6 = signUpForm0.getNickname();
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        java.lang.String str8 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        java.lang.String str2 = signUpForm0.getUsername();
        java.lang.String str3 = signUpForm0.getRePassword();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        java.lang.Long long5 = user4.getId();
        user4.setUsername("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        user4.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 0L);
        user8.setUsername("qbehvmnnrs");
        user8.setEmail("User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))", "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)", "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        signUpForm0.setUsername("");
        signUpForm0.setUsername("hvqlwkauhv");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        com.example.randoop609.repository.UserRepository userRepository4 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified5 = new com.example.randoop609.service.UserServiceModified(userRepository4);
        userServiceModified5.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest8 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified5.editUser(putRequest8, (java.lang.Long) 0L);
        userServiceModified1.editUser(putRequest8, (java.lang.Long) 10L);
        putRequest8.setNickname("hi!");
        java.lang.String str15 = putRequest8.getStudentId();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        java.lang.String str9 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder2.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder2.nickname("User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str9, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(userBuilder13);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str3 = signUpForm0.getPassword();
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getRePassword();
        java.lang.String str6 = signUpForm0.getStudentId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str5, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.email("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder10.username("hvqlwkauhv");
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder10.password("");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(userBuilder16);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getRePassword();
        java.lang.String str7 = signUpForm0.getStudentId();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        java.lang.String str10 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getPassword();
        signUpForm0.setRePassword("");
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        user4.setStudentId("");
        java.lang.String str7 = user4.getEmail();
        java.lang.String str8 = user4.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getNickname();
        java.lang.String str8 = user6.getUsername();
        java.lang.String str9 = user6.getUsername();
        java.lang.String str10 = user6.getStudentId();
        user6.setNickname("User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 0L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest9 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest9, (java.lang.Long) 10L);
        com.example.randoop609.domain.User user13 = userServiceModified1.getUser((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user13);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)", "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        java.lang.String str9 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder2.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user12 = userBuilder2.build();
        user12.setStudentId("nanpmuormr");
        java.lang.String str15 = user12.getUsername();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str9, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder2.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder2.nickname("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(userBuilder16);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str6 = signUpForm0.getNickname();
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(user7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setPassword("hi!");
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getPassword();
        java.lang.String str6 = signUpForm0.getPassword();
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(user7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str6 = signUpForm0.getRePassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        user7.setStudentId("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.Class<?> wildcardClass10 = user7.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        com.example.randoop609.dto.UserDto.Response response10 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str11 = response10.getNickname();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getPassword();
        signUpForm0.setRePassword("");
        java.lang.String str4 = signUpForm0.getUsername();
        java.lang.String str5 = signUpForm0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.lang.String str4 = user3.getStudentId();
        user3.setId((java.lang.Long) 10L);
        java.lang.String str7 = user3.getPassword();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "qbehvmnnrs" + "'", str4, "qbehvmnnrs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nsuhvpqyfv" + "'", str7, "nsuhvpqyfv");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getUsername();
        java.lang.String str9 = response7.getNickname();
        java.lang.String str10 = response7.getUsername();
        java.lang.String str11 = response7.getNickname();
        java.lang.String str12 = response7.getStudentId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder3.username("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder7.nickname("User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        java.lang.String str8 = user6.getPassword();
        user6.setId((java.lang.Long) (-1L));
        user6.setEmail("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user7 = userServiceModified1.getUser((java.lang.Long) 1L);
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder10.email("hi!");
        com.example.randoop609.domain.User user15 = userBuilder10.build();
        java.lang.String str16 = userBuilder10.toString();
        java.lang.String str17 = userBuilder10.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder19 = userBuilder10.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user20 = userBuilder10.build();
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str16, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str17, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder19);
        org.junit.Assert.assertNotNull(user20);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        com.example.randoop609.domain.User user6 = userServiceModified1.getUser((java.lang.Long) (-1L));
        user6.setNickname("");
        user6.setId((java.lang.Long) 705L);
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setNickname("hi!");
        java.lang.String str9 = putRequest4.getStudentId();
        putRequest4.setStudentId("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList9 = userServiceModified1.getAllUsers();
        com.example.randoop609.domain.User user16 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str17 = user16.getNickname();
        user16.setId((java.lang.Long) 100L);
        user16.setId((java.lang.Long) 1L);
        java.lang.String str22 = user16.getEmail();
        user16.setId((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setNickname("hi!");
        java.lang.String str9 = putRequest4.getStudentId();
        putRequest4.setNickname("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        putRequest4.setNickname("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)", "nanpmuormr", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "qbehvmnnrs", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) (-1L));
        java.lang.String str9 = user8.getNickname();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nanpmuormr" + "'", str9, "nanpmuormr");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getNickname();
        user6.setId((java.lang.Long) 10L);
        java.lang.String str10 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getPassword();
        signUpForm0.setRePassword("");
        java.lang.String str4 = signUpForm0.getRePassword();
        java.lang.String str5 = signUpForm0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str3 = signUpForm0.getRePassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str3, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("hvqlwkauhv");
        java.lang.String str2 = authResponse1.getToken();
        java.lang.String str3 = authResponse1.getToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hvqlwkauhv" + "'", str2, "hvqlwkauhv");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hvqlwkauhv" + "'", str3, "hvqlwkauhv");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getUsername();
        putRequest0.setNickname("nanpmuormr");
        putRequest0.setNickname("qbehvmnnrs");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 100L, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "hvqlwkauhv", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        user6.setNickname("hi!");
        user6.setEmail("hi!");
        java.lang.String str14 = user6.getStudentId();
        user6.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setUsername("");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str12 = user6.getPassword();
        user6.setId((java.lang.Long) 100L);
        java.lang.String str15 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str3 = signUpForm0.getPassword();
        java.lang.String str4 = signUpForm0.getRePassword();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str4, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        java.lang.String str4 = signUpForm0.getRePassword();
        signUpForm0.setRePassword("nanpmuormr");
        java.lang.Class<?> wildcardClass7 = signUpForm0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        com.example.randoop609.repository.UserRepository userRepository4 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified5 = new com.example.randoop609.service.UserServiceModified(userRepository4);
        userServiceModified5.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest8 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified5.editUser(putRequest8, (java.lang.Long) 0L);
        userServiceModified1.editUser(putRequest8, (java.lang.Long) 10L);
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        userServiceModified1.deleteUser((java.lang.Long) 705L);
        org.junit.Assert.assertNotNull(user3);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        java.lang.String str2 = authResponse1.getToken();
        java.lang.String str3 = authResponse1.getToken();
        java.lang.String str4 = authResponse1.getToken();
        java.lang.String str5 = authResponse1.getToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str2, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str3, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str4, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str5, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder2.id((java.lang.Long) 10L);
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder14.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder18 = userBuilder16.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(userBuilder16);
        org.junit.Assert.assertNotNull(userBuilder18);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setUsername("hi!");
        putRequest4.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str11 = putRequest4.getStudentId();
        java.lang.String str12 = putRequest4.getStudentId();
        java.lang.String str13 = putRequest4.getNickname();
        putRequest4.setNickname("");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str11, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str12, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.studentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.email("hvqlwkauhv");
        java.lang.String str9 = userBuilder2.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hvqlwkauhv, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null))" + "'", str9, "User.UserBuilder(id=null, username=, nickname=null, email=hvqlwkauhv, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null))");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setUsername("");
        java.lang.String str10 = user6.getEmail();
        com.example.randoop609.dto.UserDto.Response response11 = new com.example.randoop609.dto.UserDto.Response(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        com.example.randoop609.repository.UserRepository userRepository7 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified8 = new com.example.randoop609.service.UserServiceModified(userRepository7);
        com.example.randoop609.domain.User user10 = userServiceModified8.getUser((java.lang.Long) 100L);
        com.example.randoop609.repository.UserRepository userRepository11 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified12 = new com.example.randoop609.service.UserServiceModified(userRepository11);
        userServiceModified12.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest15 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified12.editUser(putRequest15, (java.lang.Long) 0L);
        userServiceModified8.editUser(putRequest15, (java.lang.Long) 10L);
        putRequest15.setNickname("qbehvmnnrs");
        userServiceModified1.editUser(putRequest15, (java.lang.Long) 0L);
        putRequest15.setUsername("hi!");
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        java.lang.String str8 = user6.getPassword();
        user6.setId((java.lang.Long) 100L);
        java.lang.String str11 = user6.getEmail();
        java.lang.String str12 = user6.getUsername();
        user6.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setUsername("");
        putRequest0.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.Class<?> wildcardClass2 = authResponse1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.example.randoop609.dto.UserDto.LoginRequest loginRequest0 = new com.example.randoop609.dto.UserDto.LoginRequest();
        java.lang.String str1 = loginRequest0.getPassword();
        java.lang.String str2 = loginRequest0.getPassword();
        java.lang.String str3 = loginRequest0.getPassword();
        java.lang.String str4 = loginRequest0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        signUpForm0.setUsername("");
        java.lang.String str4 = signUpForm0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setNickname("qbehvmnnrs");
        putRequest4.setUsername("User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.studentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.username("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        java.lang.String str10 = user6.getStudentId();
        user6.setUsername("");
        user6.setStudentId("nanpmuormr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setUsername("");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str12 = user6.getPassword();
        user6.setId((java.lang.Long) 100L);
        java.lang.String str15 = user6.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getNickname();
        user6.setId((java.lang.Long) 100L);
        user6.setId((java.lang.Long) 1L);
        java.lang.String str12 = user6.getStudentId();
        user6.setUsername("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str15 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)" + "'", str15, "User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        java.lang.String str9 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder2.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user12 = userBuilder2.build();
        user12.setStudentId("nanpmuormr");
        java.lang.String str15 = user12.getNickname();
        user12.setEmail("User.UserBuilder(id=null, username=, nickname=null, email=hvqlwkauhv, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str9, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("nanpmuormr");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setPassword("hi!");
        java.lang.String str4 = signUpForm0.getNickname();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str7 = signUpForm0.getPassword();
        java.lang.String str8 = signUpForm0.getStudentId();
        java.lang.String str9 = signUpForm0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        java.lang.String str8 = user6.getPassword();
        user6.setId((java.lang.Long) 100L);
        java.lang.String str11 = user6.getEmail();
        user6.setEmail("nanpmuormr");
        java.lang.String str14 = user6.getNickname();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str6 = signUpForm0.getNickname();
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        signUpForm0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(user7);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setEmail("");
        user6.setStudentId("User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setNickname("qbehvmnnrs");
        java.lang.String str9 = putRequest4.getUsername();
        java.lang.String str10 = putRequest4.getUsername();
        java.lang.String str11 = putRequest4.getStudentId();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 705L, "nsuhvpqyfv", "", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)", "");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setEmail("");
        user6.setPassword("");
        java.lang.String str12 = user6.getNickname();
        java.lang.String str13 = user6.getNickname();
        user6.setId((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass16 = user6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setPassword("hi!");
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getRePassword();
        signUpForm0.setNickname("nsuhvpqyfv");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder2.nickname("nanpmuormr");
        com.example.randoop609.domain.User user15 = userBuilder2.build();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        java.lang.String str7 = putRequest4.getUsername();
        putRequest4.setStudentId("qbehvmnnrs");
        putRequest4.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList7 = userServiceModified1.getAllUsers();
        com.example.randoop609.domain.User user9 = userServiceModified1.getUser((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user11 = userServiceModified1.getUser((java.lang.Long) 705L);
        java.util.List<com.example.randoop609.domain.User> userList12 = userServiceModified1.getAllUsers();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setStudentId("hi!");
        putRequest4.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str11 = putRequest4.getUsername();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)" + "'", str11, "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        java.lang.String str4 = signUpForm0.getRePassword();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.password("hi!");
        java.lang.String str11 = userBuilder10.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=hi!, studentId=null)" + "'", str11, "User.UserBuilder(id=null, username=, nickname=null, email=, password=hi!, studentId=null)");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        signUpForm0.setUsername("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        java.lang.String str7 = putRequest4.getUsername();
        java.lang.String str8 = putRequest4.getUsername();
        putRequest4.setUsername("hi!");
        putRequest4.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "", "", "User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)", "hvqlwkauhv");
        java.lang.String str7 = user6.getUsername();
        user6.setUsername("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder3.studentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder7.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder9.studentId("User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        com.example.randoop609.domain.User user12 = userBuilder11.build();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(user12);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        user6.setStudentId("");
        user6.setNickname("");
        java.lang.String str11 = user6.getUsername();
        java.lang.String str12 = user6.getNickname();
        user6.setPassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        com.example.randoop609.repository.UserRepository userRepository5 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified6 = new com.example.randoop609.service.UserServiceModified(userRepository5);
        userServiceModified6.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest9 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified6.editUser(putRequest9, (java.lang.Long) 0L);
        putRequest9.setUsername("hi!");
        putRequest9.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        putRequest9.setUsername("hi!");
        userServiceModified1.editUser(putRequest9, (java.lang.Long) 100L);
        java.lang.String str20 = putRequest9.getStudentId();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str20, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getNickname();
        java.lang.String str8 = user6.getUsername();
        java.lang.String str9 = user6.getUsername();
        java.lang.Class<?> wildcardClass10 = user6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        com.example.randoop609.domain.User user5 = userServiceModified1.getUser((java.lang.Long) 1L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest6 = null;
        userServiceModified1.editUser(putRequest6, (java.lang.Long) 100L);
        userServiceModified1.deleteUser((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        java.lang.String str9 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder2.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user12 = userBuilder2.build();
        user12.setStudentId("nanpmuormr");
        user12.setEmail("User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str9, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(user12);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getUsername();
        java.lang.String str2 = putRequest0.getNickname();
        java.lang.String str3 = putRequest0.getNickname();
        java.lang.String str4 = putRequest0.getUsername();
        java.lang.String str5 = putRequest0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getUsername();
        java.lang.String str9 = response7.getStudentId();
        java.lang.String str10 = response7.getStudentId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setPassword("hi!");
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getPassword();
        java.lang.String str6 = signUpForm0.getPassword();
        signUpForm0.setPassword("");
        java.lang.String str9 = signUpForm0.getPassword();
        java.lang.String str10 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getUsername();
        putRequest0.setNickname("nanpmuormr");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getRePassword();
        java.lang.String str7 = signUpForm0.getStudentId();
        signUpForm0.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User user10 = signUpForm0.toEntity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.email("");
        com.example.randoop609.domain.User user11 = userBuilder2.build();
        user11.setStudentId("User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(user11);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        java.lang.String str4 = signUpForm0.getUsername();
        java.lang.String str5 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setPassword("hi!");
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getPassword();
        com.example.randoop609.domain.User user6 = signUpForm0.toEntity();
        java.lang.String str7 = signUpForm0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)", "nsuhvpqyfv", "nsuhvpqyfv", "hi!", "qbehvmnnrs");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "", "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getUsername();
        java.lang.String str9 = response7.getStudentId();
        java.lang.String str10 = response7.getUsername();
        java.lang.String str11 = response7.getStudentId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setRePassword("qbehvmnnrs");
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getStudentId();
        signUpForm0.setRePassword("User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        java.lang.String str4 = signUpForm0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        user6.setStudentId("");
        user6.setPassword("hi!");
        java.lang.String str11 = user6.getPassword();
        user6.setId((java.lang.Long) 0L);
        user6.setEmail("hi!");
        com.example.randoop609.dto.UserDto.Response response16 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str17 = response16.getUsername();
        java.lang.String str18 = response16.getUsername();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)" + "'", str17, "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)" + "'", str18, "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder2.id((java.lang.Long) 10L);
        com.example.randoop609.domain.User user15 = userBuilder14.build();
        com.example.randoop609.domain.User.UserBuilder userBuilder17 = userBuilder14.id((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(userBuilder17);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getPassword();
        signUpForm0.setNickname("nsuhvpqyfv");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.example.randoop609.dto.UserDto.LoginRequest loginRequest0 = new com.example.randoop609.dto.UserDto.LoginRequest();
        java.lang.String str1 = loginRequest0.getUsername();
        java.lang.String str2 = loginRequest0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.id((java.lang.Long) 10L);
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.id((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder3.studentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder7.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder9.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder9.nickname("hi!");
        java.lang.String str14 = userBuilder13.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(userBuilder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User.UserBuilder(id=100, username=, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))" + "'", str14, "User.UserBuilder(id=100, username=, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder12.password("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User user15 = userBuilder14.build();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        java.lang.String str2 = signUpForm0.getUsername();
        java.lang.String str3 = signUpForm0.getRePassword();
        java.lang.String str4 = signUpForm0.getNickname();
        signUpForm0.setPassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str7 = signUpForm0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getPassword();
        signUpForm0.setRePassword("");
        java.lang.String str4 = signUpForm0.getRePassword();
        java.lang.String str5 = signUpForm0.getRePassword();
        com.example.randoop609.domain.User user6 = signUpForm0.toEntity();
        java.lang.Long long7 = user6.getId();
        java.lang.Long long8 = user6.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getPassword();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        java.lang.String str4 = signUpForm0.getRePassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.studentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.email("hvqlwkauhv");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.nickname("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.password("");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getStudentId();
        java.lang.String str9 = response7.getUsername();
        java.lang.String str10 = response7.getUsername();
        java.lang.String str11 = response7.getNickname();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder6.email("qbehvmnnrs");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder12.nickname("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder12.email("User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(userBuilder16);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 0L);
        com.example.randoop609.repository.UserRepository userRepository9 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified10 = new com.example.randoop609.service.UserServiceModified(userRepository9);
        userServiceModified10.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest13 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified10.editUser(putRequest13, (java.lang.Long) 0L);
        putRequest13.setUsername("hi!");
        putRequest13.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str20 = putRequest13.getStudentId();
        java.lang.String str21 = putRequest13.getStudentId();
        java.lang.String str22 = putRequest13.getNickname();
        putRequest13.setNickname("User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        java.lang.String str25 = putRequest13.getNickname();
        userServiceModified1.editUser(putRequest13, (java.lang.Long) (-1L));
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str20, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str21, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))" + "'", str25, "User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.email("");
        com.example.randoop609.domain.User user11 = userBuilder10.build();
        java.lang.String str12 = userBuilder10.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder10.studentId("");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)" + "'", str12, "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder14);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getNickname();
        java.lang.String str8 = user6.getUsername();
        user6.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        user6.setStudentId("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setStudentId("hi!");
        putRequest4.setStudentId("qbehvmnnrs");
        java.lang.String str11 = putRequest4.getStudentId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "qbehvmnnrs" + "'", str11, "qbehvmnnrs");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getRePassword();
        signUpForm0.setNickname("");
        java.lang.String str9 = signUpForm0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 10L, "hi!", "", "hi!", "", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getUsername();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 100L);
        com.example.randoop609.domain.User user15 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str16 = user15.getUsername();
        user15.setEmail("");
        user15.setPassword("");
        java.lang.String str21 = user15.getNickname();
        user15.setEmail("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 100L);
        com.example.randoop609.domain.User user10 = userServiceModified1.getUser((java.lang.Long) 705L);
        java.lang.String str11 = user10.getUsername();
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hvqlwkauhv" + "'", str11, "hvqlwkauhv");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        user6.setStudentId("");
        user6.setNickname("");
        java.lang.String str11 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "", "hi!", "hvqlwkauhv");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getUsername();
        java.lang.String str9 = response7.getStudentId();
        java.lang.String str10 = response7.getUsername();
        java.lang.String str11 = response7.getNickname();
        java.lang.String str12 = response7.getUsername();
        java.lang.String str13 = response7.getNickname();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setUsername("");
        user6.setId((java.lang.Long) 10L);
        user6.setNickname("nanpmuormr");
        com.example.randoop609.dto.UserDto.Response response14 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str15 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setPassword("hi!");
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getNickname();
        java.lang.String str6 = signUpForm0.getPassword();
        java.lang.String str7 = signUpForm0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder3.studentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder7.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder9.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str12 = userBuilder9.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))" + "'", str12, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getStudentId();
        java.lang.String str9 = response7.getUsername();
        java.lang.String str10 = response7.getUsername();
        java.lang.String str11 = response7.getUsername();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder3.studentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder7.studentId("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        java.lang.String str7 = putRequest4.getUsername();
        java.lang.String str8 = putRequest4.getUsername();
        java.lang.String str9 = putRequest4.getStudentId();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        java.lang.String str2 = signUpForm0.getUsername();
        java.lang.String str3 = signUpForm0.getRePassword();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        java.lang.Long long5 = user4.getId();
        user4.setUsername("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        user4.setNickname("qbehvmnnrs");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder3.studentId("");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder3.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder3.id((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        java.lang.String str8 = user6.getPassword();
        user6.setId((java.lang.Long) 100L);
        java.lang.String str11 = user6.getEmail();
        user6.setEmail("nanpmuormr");
        user6.setStudentId("nsuhvpqyfv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.studentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder8.nickname("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder8.email("nanpmuormr");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        user6.setEmail("");
        user6.setId((java.lang.Long) 100L);
        java.lang.String str14 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        java.lang.String str4 = signUpForm0.getUsername();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.example.randoop609.dto.UserDto.LoginRequest loginRequest0 = new com.example.randoop609.dto.UserDto.LoginRequest();
        java.lang.String str1 = loginRequest0.getPassword();
        java.lang.String str2 = loginRequest0.getUsername();
        java.lang.String str3 = loginRequest0.getUsername();
        java.lang.String str4 = loginRequest0.getPassword();
        java.lang.String str5 = loginRequest0.getPassword();
        java.lang.String str6 = loginRequest0.getPassword();
        java.lang.String str7 = loginRequest0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        com.example.randoop609.repository.UserRepository userRepository5 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified6 = new com.example.randoop609.service.UserServiceModified(userRepository5);
        userServiceModified6.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest9 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified6.editUser(putRequest9, (java.lang.Long) 0L);
        putRequest9.setUsername("hi!");
        putRequest9.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        putRequest9.setUsername("hi!");
        userServiceModified1.editUser(putRequest9, (java.lang.Long) 100L);
        com.example.randoop609.domain.User user26 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response27 = new com.example.randoop609.dto.UserDto.Response(user26);
        user26.setStudentId("hi!");
        java.lang.String str30 = user26.getStudentId();
        user26.setUsername("");
        java.lang.String str33 = user26.getUsername();
        user26.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        user26.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user26);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        signUpForm0.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=hvqlwkauhv, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null))");
        java.lang.String str8 = signUpForm0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setEmail("");
        user6.setPassword("");
        java.lang.String str12 = user6.getNickname();
        java.lang.String str13 = user6.getNickname();
        java.lang.String str14 = user6.getEmail();
        user6.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=hvqlwkauhv, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null))");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        com.example.randoop609.domain.User user10 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response11 = new com.example.randoop609.dto.UserDto.Response(user10);
        user10.setStudentId("hi!");
        java.lang.String str14 = user10.getStudentId();
        user10.setUsername("");
        java.lang.String str17 = user10.getUsername();
        user10.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        java.lang.String str20 = user10.getEmail();
        user10.setEmail("");
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList9 = userServiceModified1.getAllUsers();
        com.example.randoop609.domain.User user11 = userServiceModified1.getUser((java.lang.Long) 100L);
        user11.setStudentId("nsuhvpqyfv");
        user11.setUsername("User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user11);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("qbehvmnnrs");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder2.id((java.lang.Long) 10L);
        com.example.randoop609.domain.User user15 = userBuilder14.build();
        user15.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder3.studentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder7.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder9.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User user12 = userBuilder9.build();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(user12);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getRePassword();
        signUpForm0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str6 = signUpForm0.getNickname();
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str10 = signUpForm0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getPassword();
        signUpForm0.setRePassword("");
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        java.lang.String str7 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) (-1L));
        java.lang.String str9 = user8.getUsername();
        user8.setUsername("nanpmuormr");
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hvqlwkauhv" + "'", str9, "hvqlwkauhv");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.repository.UserRepository userRepository7 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified8 = new com.example.randoop609.service.UserServiceModified(userRepository7);
        userServiceModified8.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest11 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified8.editUser(putRequest11, (java.lang.Long) 0L);
        putRequest11.setNickname("hi!");
        userServiceModified1.editUser(putRequest11, (java.lang.Long) (-1L));
        java.lang.String str18 = putRequest11.getNickname();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        signUpForm0.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str5 = signUpForm0.getPassword();
        signUpForm0.setNickname("");
        java.lang.String str8 = signUpForm0.getNickname();
        signUpForm0.setRePassword("User.UserBuilder(id=100, username=, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)" + "'", str5, "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        java.lang.String str4 = signUpForm0.getRePassword();
        signUpForm0.setRePassword("nanpmuormr");
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(user7);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder2.id((java.lang.Long) 10L);
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder14.studentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(userBuilder16);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder5.id((java.lang.Long) 1L);
        java.lang.String str8 = userBuilder7.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder7.email("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder7.email("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder7.username("User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str8, "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.example.randoop609.domain.User user0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.dto.UserDto.Response response1 = new com.example.randoop609.dto.UserDto.Response(user0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.domain.User.getId()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        signUpForm0.setStudentId("");
        signUpForm0.setUsername("");
        signUpForm0.setNickname("nsuhvpqyfv");
        java.lang.String str12 = signUpForm0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        java.lang.String str4 = signUpForm0.getUsername();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=, nickname=null, email=hvqlwkauhv, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null))");
        java.lang.String str7 = signUpForm0.getUsername();
        java.lang.String str8 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hvqlwkauhv, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null))" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hvqlwkauhv, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null))");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getUsername();
        java.lang.String str9 = response7.getNickname();
        java.lang.String str10 = response7.getNickname();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setUsername("");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str12 = user6.getStudentId();
        user6.setEmail("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user5 = userServiceModified1.getUser((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user12 = new com.example.randoop609.domain.User((java.lang.Long) 10L, "hi!", "", "hi!", "", "hi!");
        java.lang.String str13 = user12.getPassword();
        user12.setNickname("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str3 = signUpForm0.getPassword();
        java.lang.String str4 = signUpForm0.getRePassword();
        java.lang.String str5 = signUpForm0.getRePassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str4, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str5, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setStudentId("hi!");
        putRequest4.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        putRequest4.setStudentId("User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        putRequest4.setUsername("qbehvmnnrs");
        putRequest4.setUsername("qbehvmnnrs");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass9 = user8.getClass();
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 10L, "hi!", "", "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setEmail("hvqlwkauhv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        signUpForm0.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str5 = signUpForm0.getPassword();
        signUpForm0.setNickname("");
        java.lang.String str8 = signUpForm0.getNickname();
        java.lang.String str9 = signUpForm0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)" + "'", str5, "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)" + "'", str9, "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        user6.setStudentId("");
        user6.setPassword("hi!");
        java.lang.String str11 = user6.getPassword();
        user6.setId((java.lang.Long) 0L);
        user6.setUsername("qbehvmnnrs");
        user6.setNickname("hvqlwkauhv");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        java.lang.String str7 = putRequest4.getUsername();
        java.lang.String str8 = putRequest4.getUsername();
        putRequest4.setNickname("User.UserBuilder(id=null, username=, nickname=null, email=, password=hi!, studentId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user5 = userServiceModified1.getUser((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user7 = userServiceModified1.getUser((java.lang.Long) 10L);
        userServiceModified1.deleteUser((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user7);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        user6.setStudentId("");
        user6.setPassword("hi!");
        java.lang.String str11 = user6.getPassword();
        user6.setId((java.lang.Long) 0L);
        user6.setPassword("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        user6.setEmail("");
        user6.setId((java.lang.Long) 100L);
        user6.setPassword("nanpmuormr");
        java.lang.String str16 = user6.getStudentId();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder2.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder2.id((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(userBuilder16);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setPassword("hi!");
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getNickname();
        com.example.randoop609.domain.User user6 = signUpForm0.toEntity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getUsername();
        java.lang.String str9 = response7.getStudentId();
        java.lang.String str10 = response7.getNickname();
        java.lang.String str11 = response7.getStudentId();
        java.lang.String str12 = response7.getStudentId();
        java.lang.String str13 = response7.getStudentId();
        java.lang.String str14 = response7.getStudentId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getNickname();
        user6.setId((java.lang.Long) 100L);
        user6.setId((java.lang.Long) 1L);
        java.lang.String str12 = user6.getEmail();
        user6.setId((java.lang.Long) 100L);
        user6.setId((java.lang.Long) 100L);
        java.lang.String str17 = user6.getNickname();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        com.example.randoop609.domain.User user6 = userServiceModified1.getUser((java.lang.Long) 0L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user8);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        com.example.randoop609.repository.UserRepository userRepository5 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified6 = new com.example.randoop609.service.UserServiceModified(userRepository5);
        userServiceModified6.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest9 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified6.editUser(putRequest9, (java.lang.Long) 0L);
        putRequest9.setUsername("hi!");
        putRequest9.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        putRequest9.setUsername("hi!");
        userServiceModified1.editUser(putRequest9, (java.lang.Long) 100L);
        putRequest9.setStudentId("hvqlwkauhv");
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        signUpForm0.setNickname("hi!");
        java.lang.String str8 = signUpForm0.getRePassword();
        signUpForm0.setStudentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setUsername("");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str12 = user6.getPassword();
        user6.setEmail("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder12.password("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User user15 = userBuilder12.build();
        com.example.randoop609.dto.UserDto.Response response16 = new com.example.randoop609.dto.UserDto.Response(user15);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.example.randoop609.dto.UserDto.LoginRequest loginRequest0 = new com.example.randoop609.dto.UserDto.LoginRequest();
        java.lang.String str1 = loginRequest0.getPassword();
        java.lang.String str2 = loginRequest0.getPassword();
        java.lang.String str3 = loginRequest0.getUsername();
        java.lang.String str4 = loginRequest0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getRePassword();
        signUpForm0.setNickname("");
        java.lang.String str9 = signUpForm0.getUsername();
        java.lang.String str10 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder2.id((java.lang.Long) (-1L));
        java.lang.String str15 = userBuilder14.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User.UserBuilder(id=-1, username=, nickname=, email=hi!, password=, studentId=null)" + "'", str15, "User.UserBuilder(id=-1, username=, nickname=, email=hi!, password=, studentId=null)");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setRePassword("qbehvmnnrs");
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        userServiceModified1.deleteUser((java.lang.Long) 100L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest6 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest6.setUsername("nanpmuormr");
        java.lang.String str9 = putRequest6.getNickname();
        userServiceModified1.editUser(putRequest6, (java.lang.Long) 1L);
        putRequest6.setNickname("User.UserBuilder(id=null, username=, nickname=null, email=hvqlwkauhv, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        signUpForm0.setNickname("hi!");
        java.lang.String str8 = signUpForm0.getRePassword();
        java.lang.String str9 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str3 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setPassword("hi!");
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getPassword();
        com.example.randoop609.domain.User user6 = signUpForm0.toEntity();
        java.lang.String str7 = signUpForm0.getNickname();
        signUpForm0.setRePassword("qbehvmnnrs");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setUsername("");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str12 = user6.getStudentId();
        java.lang.String str13 = user6.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        java.lang.String str4 = signUpForm0.getUsername();
        signUpForm0.setNickname("qbehvmnnrs");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setUsername("");
        java.lang.String str10 = user6.getEmail();
        user6.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getUsername();
        java.lang.String str9 = response7.getStudentId();
        java.lang.String str10 = response7.getNickname();
        java.lang.String str11 = response7.getUsername();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        java.util.List<com.example.randoop609.domain.User> userList6 = userServiceModified1.getAllUsers();
        java.util.List<com.example.randoop609.domain.User> userList7 = userServiceModified1.getAllUsers();
        com.example.randoop609.dto.UserDto.PutRequest putRequest8 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest8.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        userServiceModified1.editUser(putRequest8, (java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getRePassword();
        java.lang.String str7 = signUpForm0.getStudentId();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        signUpForm0.setPassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        signUpForm0.setStudentId("");
        signUpForm0.setUsername("");
        java.lang.String str10 = signUpForm0.getRePassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        java.lang.String str10 = user6.getPassword();
        user6.setEmail("");
        java.lang.String str13 = user6.getNickname();
        user6.setId((java.lang.Long) 0L);
        java.lang.String str16 = user6.getUsername();
        java.lang.String str17 = user6.getNickname();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder6.email("qbehvmnnrs");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder12.username("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder12.studentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder18 = userBuilder16.password("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str19 = userBuilder16.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(userBuilder16);
        org.junit.Assert.assertNotNull(userBuilder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null), nickname=null, email=qbehvmnnrs, password=User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))" + "'", str19, "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null), nickname=null, email=qbehvmnnrs, password=User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        java.lang.String str2 = signUpForm0.getUsername();
        java.lang.String str3 = signUpForm0.getRePassword();
        java.lang.String str4 = signUpForm0.getRePassword();
        signUpForm0.setRePassword("hi!");
        signUpForm0.setStudentId("");
        signUpForm0.setNickname("User.UserBuilder(id=100, username=, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList9 = userServiceModified1.getAllUsers();
        com.example.randoop609.domain.User user11 = userServiceModified1.getUser((java.lang.Long) 100L);
        user11.setEmail("User.UserBuilder(id=-1, username=, nickname=, email=hi!, password=, studentId=null)");
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user11);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = user7.getPassword();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.example.randoop609.dto.UserDto.LoginRequest loginRequest0 = new com.example.randoop609.dto.UserDto.LoginRequest();
        java.lang.String str1 = loginRequest0.getPassword();
        java.lang.String str2 = loginRequest0.getUsername();
        java.lang.String str3 = loginRequest0.getPassword();
        java.lang.String str4 = loginRequest0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.password("nsuhvpqyfv");
        java.lang.Class<?> wildcardClass11 = userBuilder10.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setPassword("hi!");
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getPassword();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        signUpForm0.setNickname("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        signUpForm0.setStudentId("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setNickname("qbehvmnnrs");
        java.lang.String str9 = putRequest4.getUsername();
        java.lang.String str10 = putRequest4.getUsername();
        java.lang.String str11 = putRequest4.getUsername();
        java.lang.String str12 = putRequest4.getUsername();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList7 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 100L);
        com.example.randoop609.repository.UserRepository userRepository10 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified11 = new com.example.randoop609.service.UserServiceModified(userRepository10);
        userServiceModified11.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest14 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified11.editUser(putRequest14, (java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList17 = userServiceModified11.getAllUsers();
        com.example.randoop609.repository.UserRepository userRepository18 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified19 = new com.example.randoop609.service.UserServiceModified(userRepository18);
        com.example.randoop609.domain.User user21 = userServiceModified19.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList22 = userServiceModified19.getAllUsers();
        userServiceModified19.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user26 = userServiceModified19.getUser((java.lang.Long) 0L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest27 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified19.editUser(putRequest27, (java.lang.Long) 10L);
        userServiceModified11.editUser(putRequest27, (java.lang.Long) 0L);
        putRequest27.setStudentId("");
        putRequest27.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=, password=hi!, studentId=null)");
        userServiceModified1.editUser(putRequest27, (java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(user26);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str6 = signUpForm0.getNickname();
        java.lang.String str7 = signUpForm0.getRePassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        java.lang.String str11 = userBuilder2.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=null, username=, nickname=, email=hi!, password=null, studentId=null)" + "'", str11, "User.UserBuilder(id=null, username=, nickname=, email=hi!, password=null, studentId=null)");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str3 = signUpForm0.getPassword();
        signUpForm0.setPassword("nanpmuormr");
        signUpForm0.setNickname("hvqlwkauhv");
        java.lang.String str8 = signUpForm0.getRePassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        java.lang.String str2 = signUpForm0.getUsername();
        signUpForm0.setRePassword("qbehvmnnrs");
        signUpForm0.setPassword("User.UserBuilder(id=100, username=, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getRePassword();
        java.lang.String str7 = signUpForm0.getStudentId();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        java.lang.String str10 = signUpForm0.getPassword();
        java.lang.String str11 = signUpForm0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str11, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user7 = userServiceModified1.getUser((java.lang.Long) 1L);
        com.example.randoop609.repository.UserRepository userRepository8 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified9 = new com.example.randoop609.service.UserServiceModified(userRepository8);
        userServiceModified9.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest12 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified9.editUser(putRequest12, (java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList15 = userServiceModified9.getAllUsers();
        com.example.randoop609.repository.UserRepository userRepository16 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified17 = new com.example.randoop609.service.UserServiceModified(userRepository16);
        com.example.randoop609.domain.User user19 = userServiceModified17.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList20 = userServiceModified17.getAllUsers();
        userServiceModified17.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user24 = userServiceModified17.getUser((java.lang.Long) 0L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest25 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified17.editUser(putRequest25, (java.lang.Long) 10L);
        userServiceModified9.editUser(putRequest25, (java.lang.Long) 0L);
        java.lang.String str30 = putRequest25.getStudentId();
        userServiceModified1.editUser(putRequest25, (java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder12.password("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str15 = userBuilder14.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User.UserBuilder(id=null, username=, nickname=, email=hi!, password=User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null), studentId=null)" + "'", str15, "User.UserBuilder(id=null, username=, nickname=, email=hi!, password=User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null), studentId=null)");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.studentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder8.password("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder12.username("nanpmuormr");
        java.lang.String str15 = userBuilder14.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User.UserBuilder(id=0, username=nanpmuormr, nickname=null, email=hi!, password=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)), studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))" + "'", str15, "User.UserBuilder(id=0, username=nanpmuormr, nickname=null, email=hi!, password=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)), studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getNickname();
        user6.setId((java.lang.Long) 100L);
        java.lang.String str10 = user6.getEmail();
        com.example.randoop609.dto.UserDto.Response response11 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str12 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder3.studentId("");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder7.studentId("");
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder9.email("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        user6.setNickname("hi!");
        user6.setEmail("hi!");
        java.lang.String str14 = user6.getStudentId();
        user6.setEmail("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        user6.setPassword("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setRePassword("qbehvmnnrs");
        java.lang.String str4 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User user13 = userBuilder2.build();
        com.example.randoop609.domain.User.UserBuilder userBuilder15 = userBuilder2.username("User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        java.lang.String str16 = userBuilder2.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userBuilder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User.UserBuilder(id=null, username=User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)), nickname=, email=hi!, password=, studentId=null)" + "'", str16, "User.UserBuilder(id=null, username=User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)), nickname=, email=hi!, password=, studentId=null)");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setUsername("hi!");
        putRequest4.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str11 = putRequest4.getStudentId();
        java.lang.String str12 = putRequest4.getStudentId();
        java.lang.String str13 = putRequest4.getNickname();
        putRequest4.setNickname("User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        java.lang.String str16 = putRequest4.getNickname();
        putRequest4.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str11, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str12, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))" + "'", str16, "User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        user6.setStudentId("");
        user6.setPassword("hi!");
        java.lang.String str11 = user6.getPassword();
        user6.setId((java.lang.Long) 0L);
        user6.setUsername("qbehvmnnrs");
        user6.setEmail("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        user6.setPassword("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setUsername("hi!");
        putRequest4.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        putRequest4.setUsername("hi!");
        putRequest4.setStudentId("hi!");
        java.lang.String str15 = putRequest4.getStudentId();
        putRequest4.setUsername("User.UserBuilder(id=null, username=, nickname=, email=hi!, password=User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null), studentId=null)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str7 = user6.getEmail();
        java.lang.String str8 = user6.getNickname();
        java.lang.Class<?> wildcardClass9 = user6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str7, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        java.lang.String str3 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder0.password("User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)" + "'", str3, "User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder5);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setUsername("nanpmuormr");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.password("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.nickname("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        java.lang.String str10 = user6.getStudentId();
        user6.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        java.lang.String str13 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        java.lang.String str8 = user6.getPassword();
        user6.setId((java.lang.Long) (-1L));
        user6.setUsername("User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getPassword();
        signUpForm0.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        java.lang.String str4 = signUpForm0.getRePassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        java.lang.String str4 = signUpForm0.getRePassword();
        signUpForm0.setRePassword("nanpmuormr");
        java.lang.String str7 = signUpForm0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 10L, "hi!", "", "hi!", "", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        com.example.randoop609.repository.UserRepository userRepository4 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified5 = new com.example.randoop609.service.UserServiceModified(userRepository4);
        userServiceModified5.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest8 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified5.editUser(putRequest8, (java.lang.Long) 0L);
        userServiceModified1.editUser(putRequest8, (java.lang.Long) 10L);
        putRequest8.setUsername("User.UserBuilder(id=0, username=nanpmuormr, nickname=null, email=hi!, password=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)), studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        putRequest8.setUsername("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(user3);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList7 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 100L);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        com.example.randoop609.domain.User user6 = signUpForm0.toEntity();
        java.lang.String str7 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setNickname("qbehvmnnrs");
        java.lang.String str9 = putRequest4.getUsername();
        java.lang.String str10 = putRequest4.getUsername();
        java.lang.String str11 = putRequest4.getNickname();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "qbehvmnnrs" + "'", str11, "qbehvmnnrs");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user5 = userServiceModified1.getUser((java.lang.Long) (-1L));
        userServiceModified1.deleteUser((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 10L, "hi!", "", "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setUsername("nanpmuormr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.studentId("User.UserBuilder(id=null, username=, nickname=, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setEmail("");
        user6.setPassword("");
        java.lang.String str12 = user6.getNickname();
        user6.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str15 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        java.lang.String str9 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder2.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user12 = userBuilder2.build();
        com.example.randoop609.dto.UserDto.Response response13 = new com.example.randoop609.dto.UserDto.Response(user12);
        java.lang.Class<?> wildcardClass14 = response13.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str9, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        java.lang.String str2 = signUpForm0.getUsername();
        java.lang.String str3 = signUpForm0.getRePassword();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        java.lang.String str5 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setNickname("qbehvmnnrs");
        putRequest4.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        java.lang.String str11 = putRequest4.getUsername();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))" + "'", str11, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.id((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        java.lang.String str10 = user6.getStudentId();
        com.example.randoop609.dto.UserDto.Response response11 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str12 = response11.getStudentId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 0L);
        java.lang.String str9 = user8.getStudentId();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "qbehvmnnrs" + "'", str9, "qbehvmnnrs");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        signUpForm0.setStudentId("nsuhvpqyfv");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder6.email("qbehvmnnrs");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder12.studentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder12.studentId("nsuhvpqyfv");
        java.lang.String str17 = userBuilder12.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(userBuilder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=qbehvmnnrs, password=null, studentId=nsuhvpqyfv)" + "'", str17, "User.UserBuilder(id=null, username=, nickname=null, email=qbehvmnnrs, password=null, studentId=nsuhvpqyfv)");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.id((java.lang.Long) 10L);
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.nickname("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.email("User.UserBuilder(id=null, username=, nickname=null, email=, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        user6.setNickname("hi!");
        user6.setEmail("hi!");
        java.lang.String str14 = user6.getStudentId();
        user6.setEmail("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        java.lang.String str17 = user6.getNickname();
        java.lang.String str18 = user6.getNickname();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) (-1L));
        java.lang.String str9 = user8.getUsername();
        java.lang.String str10 = user8.getNickname();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hvqlwkauhv" + "'", str9, "hvqlwkauhv");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nanpmuormr" + "'", str10, "nanpmuormr");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        java.lang.String str8 = user6.getPassword();
        user6.setId((java.lang.Long) 100L);
        java.lang.String str11 = user6.getEmail();
        user6.setId((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        com.example.randoop609.dto.UserDto.Response response8 = new com.example.randoop609.dto.UserDto.Response(user7);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        signUpForm0.setPassword("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str5 = signUpForm0.getPassword();
        signUpForm0.setRePassword("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User user8 = signUpForm0.toEntity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)" + "'", str5, "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(user8);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setUsername("");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str12 = user6.getPassword();
        java.lang.String str13 = user6.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder2.nickname("nanpmuormr");
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder14.email("qbehvmnnrs");
        com.example.randoop609.domain.User user17 = userBuilder14.build();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(userBuilder16);
        org.junit.Assert.assertNotNull(user17);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getRePassword();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        signUpForm0.setStudentId("nanpmuormr");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str6 = signUpForm0.getNickname();
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        signUpForm0.setStudentId("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(user7);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        java.lang.String str2 = signUpForm0.getUsername();
        java.lang.String str3 = signUpForm0.getRePassword();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        java.lang.String str5 = user4.getPassword();
        user4.setEmail("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.Long long8 = user4.getId();
        user4.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        java.lang.String str2 = authResponse1.getToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))" + "'", str2, "User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        java.lang.String str10 = user6.getPassword();
        user6.setEmail("");
        java.lang.String str13 = user6.getNickname();
        user6.setId((java.lang.Long) 0L);
        user6.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=hi!, studentId=null)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        com.example.randoop609.dto.UserDto.Response response10 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str11 = user6.getUsername();
        java.lang.String str12 = user6.getStudentId();
        user6.setStudentId("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        com.example.randoop609.domain.User user6 = userServiceModified1.getUser((java.lang.Long) (-1L));
        userServiceModified1.deleteUser((java.lang.Long) 100L);
        com.example.randoop609.domain.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=null, username=User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)), nickname=, email=hi!, password=, studentId=null)");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setPassword("hi!");
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getPassword();
        java.lang.String str6 = signUpForm0.getPassword();
        signUpForm0.setPassword("");
        java.lang.String str9 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList7 = userServiceModified1.getAllUsers();
        com.example.randoop609.domain.User user9 = userServiceModified1.getUser((java.lang.Long) 705L);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user9);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setUsername("hi!");
        putRequest4.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str11 = putRequest4.getUsername();
        putRequest4.setUsername("User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str14 = putRequest4.getUsername();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)" + "'", str14, "User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null)");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str2 = authResponse1.getToken();
        java.lang.String str3 = authResponse1.getToken();
        java.lang.String str4 = authResponse1.getToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str2, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str3, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str4, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setUsername("");
        java.lang.String str3 = putRequest0.getStudentId();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder5.id((java.lang.Long) 1L);
        java.lang.String str8 = userBuilder7.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder7.email("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder7.username("hi!");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str8, "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.password("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.username("User.UserBuilder(id=-1, username=, nickname=, email=hi!, password=, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setUsername("nanpmuormr");
        java.lang.String str3 = putRequest0.getNickname();
        java.lang.String str4 = putRequest0.getUsername();
        java.lang.String str5 = putRequest0.getStudentId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nanpmuormr" + "'", str4, "nanpmuormr");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("");
        java.lang.String str2 = authResponse1.getToken();
        java.lang.String str3 = authResponse1.getToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user5 = userServiceModified1.getUser((java.lang.Long) (-1L));
        java.util.List<com.example.randoop609.domain.User> userList6 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user15 = new com.example.randoop609.domain.User((java.lang.Long) 10L, "", "", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)", "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder3.studentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder3.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder9.username("nsuhvpqyfv");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        java.lang.String str7 = putRequest4.getUsername();
        java.lang.String str8 = putRequest4.getUsername();
        putRequest4.setUsername("hi!");
        putRequest4.setNickname("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 0L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest9 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest9, (java.lang.Long) 10L);
        java.util.List<com.example.randoop609.domain.User> userList12 = userServiceModified1.getAllUsers();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 705L);
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder5.id((java.lang.Long) 1L);
        java.lang.String str8 = userBuilder7.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder7.email("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.id((java.lang.Long) 705L);
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder12.username("User.UserBuilder(id=100, username=, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder12.username("");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str8, "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(userBuilder16);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.username("User.UserBuilder(id=null, username=, nickname=null, email=qbehvmnnrs, password=null, studentId=nsuhvpqyfv)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder8.email("User.UserBuilder(id=0, username=nanpmuormr, nickname=null, email=hi!, password=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)), studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getRePassword();
        java.lang.String str7 = signUpForm0.getStudentId();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        java.lang.String str10 = signUpForm0.getPassword();
        java.lang.String str11 = signUpForm0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setUsername("hi!");
        putRequest4.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str11 = putRequest4.getUsername();
        java.lang.String str12 = putRequest4.getStudentId();
        putRequest4.setNickname("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        putRequest4.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str12, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        com.example.randoop609.domain.User user5 = userServiceModified1.getUser((java.lang.Long) 1L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest6 = null;
        userServiceModified1.editUser(putRequest6, (java.lang.Long) 100L);
        com.example.randoop609.domain.User user15 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        user15.setStudentId("");
        user15.setPassword("hi!");
        java.lang.String str20 = user15.getPassword();
        user15.setId((java.lang.Long) 0L);
        user15.setEmail("hi!");
        com.example.randoop609.dto.UserDto.Response response25 = new com.example.randoop609.dto.UserDto.Response(user15);
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getRePassword();
        signUpForm0.setNickname("");
        java.lang.Class<?> wildcardClass9 = signUpForm0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList7 = userServiceModified1.getAllUsers();
        com.example.randoop609.repository.UserRepository userRepository8 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified9 = new com.example.randoop609.service.UserServiceModified(userRepository8);
        com.example.randoop609.domain.User user11 = userServiceModified9.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList12 = userServiceModified9.getAllUsers();
        userServiceModified9.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user16 = userServiceModified9.getUser((java.lang.Long) 0L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest17 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified9.editUser(putRequest17, (java.lang.Long) 10L);
        userServiceModified1.editUser(putRequest17, (java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList22 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.id((java.lang.Long) 10L);
        com.example.randoop609.domain.User user3 = userBuilder0.build();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(user3);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setUsername("");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str12 = user6.getPassword();
        user6.setId((java.lang.Long) 100L);
        java.lang.String str15 = user6.getNickname();
        java.lang.String str16 = user6.getUsername();
        user6.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        com.example.randoop609.dto.UserDto.Response response19 = new com.example.randoop609.dto.UserDto.Response(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        signUpForm0.setUsername("hi!");
        signUpForm0.setPassword("hi!");
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str8 = signUpForm0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        user6.setNickname("hi!");
        user6.setEmail("hi!");
        java.lang.String str14 = user6.getStudentId();
        user6.setPassword("");
        java.lang.String str17 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=null, username=, nickname=null, email=hvqlwkauhv, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null))");
        java.lang.String str2 = authResponse1.getToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hvqlwkauhv, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null))" + "'", str2, "User.UserBuilder(id=null, username=, nickname=null, email=hvqlwkauhv, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null))");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList7 = userServiceModified1.getAllUsers();
        com.example.randoop609.domain.User user9 = userServiceModified1.getUser((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user16 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str17 = user16.getUsername();
        user16.setUsername("");
        user16.setId((java.lang.Long) 10L);
        java.lang.String str22 = user16.getPassword();
        user16.setId((java.lang.Long) 100L);
        user16.setEmail("");
        // The following exception was thrown during execution in test generation
        try {
            userServiceModified1.saveUser(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: MEMBER_EXISTS");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 10L, "User.UserBuilder(id=null, username=, nickname=null, email=hvqlwkauhv, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null))", "User.UserBuilder(id=null, username=User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)), nickname=, email=hi!, password=, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null), nickname=null, email=qbehvmnnrs, password=User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.password("nsuhvpqyfv");
        java.lang.String str11 = userBuilder10.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=nsuhvpqyfv, studentId=null)" + "'", str11, "User.UserBuilder(id=null, username=, nickname=null, email=, password=nsuhvpqyfv, studentId=null)");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        signUpForm0.setPassword("hi!");
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getPassword();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        java.lang.String str8 = signUpForm0.getRePassword();
        java.lang.String str9 = signUpForm0.getUsername();
        com.example.randoop609.domain.User user10 = signUpForm0.toEntity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        com.example.randoop609.repository.UserRepository userRepository7 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified8 = new com.example.randoop609.service.UserServiceModified(userRepository7);
        com.example.randoop609.domain.User user10 = userServiceModified8.getUser((java.lang.Long) 100L);
        com.example.randoop609.repository.UserRepository userRepository11 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified12 = new com.example.randoop609.service.UserServiceModified(userRepository11);
        userServiceModified12.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest15 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified12.editUser(putRequest15, (java.lang.Long) 0L);
        userServiceModified8.editUser(putRequest15, (java.lang.Long) 10L);
        putRequest15.setNickname("qbehvmnnrs");
        userServiceModified1.editUser(putRequest15, (java.lang.Long) 0L);
        putRequest15.setNickname("User.UserBuilder(id=null, username=, nickname=null, email=, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.studentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.email("hvqlwkauhv");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.password("User.UserBuilder(id=100, username=, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder3.studentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder7.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder9.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder11.username("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(userBuilder13);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setUsername("hi!");
        putRequest4.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str11 = putRequest4.getUsername();
        java.lang.String str12 = putRequest4.getStudentId();
        java.lang.String str13 = putRequest4.getStudentId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str12, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str13, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getPassword();
        signUpForm0.setRePassword("");
        java.lang.String str4 = signUpForm0.getRePassword();
        java.lang.String str5 = signUpForm0.getRePassword();
        com.example.randoop609.domain.User user6 = signUpForm0.toEntity();
        java.lang.String str7 = signUpForm0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=null, username=, nickname=, email=hi!, password=null, studentId=null)", "nsuhvpqyfv", "User.UserBuilder(id=null, username=, nickname=null, email=qbehvmnnrs, password=null, studentId=nsuhvpqyfv)", "User.UserBuilder(id=-1, username=, nickname=, email=hi!, password=, studentId=null)", "User.UserBuilder(id=null, username=, nickname=null, email=, password=hi!, studentId=null)");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getUsername();
        user6.setEmail("");
        user6.setPassword("");
        java.lang.String str12 = user6.getNickname();
        java.lang.String str13 = user6.getNickname();
        user6.setId((java.lang.Long) 10L);
        user6.setUsername("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str20 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("hi!");
        com.example.randoop609.dto.UserDto.Response response10 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str11 = response10.getStudentId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("hi!");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getRePassword();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        signUpForm0.setPassword("User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        signUpForm0.setNickname("");
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList7 = userServiceModified1.getAllUsers();
        java.util.List<com.example.randoop609.domain.User> userList8 = userServiceModified1.getAllUsers();
        java.util.List<com.example.randoop609.domain.User> userList9 = userServiceModified1.getAllUsers();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 0L);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        java.util.List<com.example.randoop609.domain.User> userList11 = userServiceModified1.getAllUsers();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        com.example.randoop609.domain.User user6 = userServiceModified1.getUser((java.lang.Long) (-1L));
        user6.setNickname("");
        user6.setPassword("nsuhvpqyfv");
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder5.id((java.lang.Long) 1L);
        java.lang.String str8 = userBuilder7.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder7.email("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.nickname("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str8, "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList7 = userServiceModified1.getAllUsers();
        com.example.randoop609.repository.UserRepository userRepository8 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified9 = new com.example.randoop609.service.UserServiceModified(userRepository8);
        com.example.randoop609.domain.User user11 = userServiceModified9.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList12 = userServiceModified9.getAllUsers();
        userServiceModified9.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user16 = userServiceModified9.getUser((java.lang.Long) 0L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest17 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified9.editUser(putRequest17, (java.lang.Long) 10L);
        userServiceModified1.editUser(putRequest17, (java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList22 = userServiceModified1.getAllUsers();
        java.util.List<com.example.randoop609.domain.User> userList23 = userServiceModified1.getAllUsers();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.example.randoop609.dto.UserDto.LoginRequest loginRequest0 = new com.example.randoop609.dto.UserDto.LoginRequest();
        java.lang.String str1 = loginRequest0.getPassword();
        java.lang.String str2 = loginRequest0.getPassword();
        java.lang.String str3 = loginRequest0.getPassword();
        java.lang.String str4 = loginRequest0.getUsername();
        java.lang.String str5 = loginRequest0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        java.util.List<com.example.randoop609.domain.User> userList7 = userServiceModified1.getAllUsers();
        com.example.randoop609.domain.User user9 = userServiceModified1.getUser((java.lang.Long) (-1L));
        com.example.randoop609.repository.UserRepository userRepository10 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified11 = new com.example.randoop609.service.UserServiceModified(userRepository10);
        userServiceModified11.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest14 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified11.editUser(putRequest14, (java.lang.Long) 0L);
        putRequest14.setUsername("hi!");
        putRequest14.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str21 = putRequest14.getUsername();
        userServiceModified1.editUser(putRequest14, (java.lang.Long) 100L);
        java.lang.String str24 = putRequest14.getUsername();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.password("");
        com.example.randoop609.domain.User user13 = userBuilder2.build();
        java.lang.String str14 = user13.getEmail();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getStudentId();
        java.lang.String str2 = signUpForm0.getUsername();
        java.lang.String str3 = signUpForm0.getRePassword();
        java.lang.String str4 = signUpForm0.getNickname();
        signUpForm0.setPassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        signUpForm0.setStudentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        java.lang.String str9 = signUpForm0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))" + "'", str9, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getStudentId();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setUsername("hi!");
        putRequest4.setUsername("qbehvmnnrs");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        putRequest4.setNickname("hi!");
        java.lang.String str9 = putRequest4.getNickname();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.domain.User user8 = userServiceModified1.getUser((java.lang.Long) 0L);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user12 = userServiceModified1.getUser((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user12);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "User.UserBuilder(id=null, username=, nickname=null, email=hvqlwkauhv, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null))", "", "User.UserBuilder(id=null, username=, nickname=null, email=, password=nsuhvpqyfv, studentId=null)", "User.UserBuilder(id=null, username=, nickname=, email=hi!, password=User.UserBuilder(id=null, username=null, nickname=null, email=, password=null, studentId=null), studentId=null)", "qbehvmnnrs");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.nickname("hvqlwkauhv");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.studentId("User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder6.email("qbehvmnnrs");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder12.username("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder12.studentId("User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder18 = userBuilder16.studentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))");
        com.example.randoop609.domain.User.UserBuilder userBuilder20 = userBuilder16.password("User.UserBuilder(id=0, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        com.example.randoop609.domain.User user21 = userBuilder16.build();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(userBuilder16);
        org.junit.Assert.assertNotNull(userBuilder18);
        org.junit.Assert.assertNotNull(userBuilder20);
        org.junit.Assert.assertNotNull(user21);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str3 = signUpForm0.getPassword();
        java.lang.String str4 = signUpForm0.getPassword();
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = signUpForm0.getUsername();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        java.lang.String str9 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder2.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder11.username("");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str9, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(userBuilder13);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "", "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)", "");
        user6.setStudentId("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null), nickname=null, email=qbehvmnnrs, password=User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        com.example.randoop609.domain.User user3 = userServiceModified1.getUser((java.lang.Long) 100L);
        java.util.List<com.example.randoop609.domain.User> userList4 = userServiceModified1.getAllUsers();
        userServiceModified1.deleteUser((java.lang.Long) 10L);
        com.example.randoop609.repository.UserRepository userRepository7 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified8 = new com.example.randoop609.service.UserServiceModified(userRepository7);
        userServiceModified8.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest11 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified8.editUser(putRequest11, (java.lang.Long) 0L);
        putRequest11.setNickname("hi!");
        userServiceModified1.editUser(putRequest11, (java.lang.Long) (-1L));
        putRequest11.setUsername("nsuhvpqyfv");
        java.lang.String str20 = putRequest11.getStudentId();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.studentId("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.nickname("hvqlwkauhv");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.nickname("User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.email("");
        com.example.randoop609.domain.User user11 = userBuilder10.build();
        java.lang.String str12 = user11.getUsername();
        java.lang.String str13 = user11.getStudentId();
        user11.setEmail("User.UserBuilder(id=0, username=nanpmuormr, nickname=null, email=hi!, password=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null)), studentId=User.UserBuilder(id=null, username=, nickname=null, email=, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 100L, "User.UserBuilder(id=100, username=, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null))", "User.UserBuilder(id=null, username=, nickname=null, email=qbehvmnnrs, password=null, studentId=nsuhvpqyfv)", "User.UserBuilder(id=null, username=, nickname=null, email=hvqlwkauhv, password=null, studentId=User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null))", "nanpmuormr", "nsuhvpqyfv");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "hi!", "", "hi!", "hi!");
        java.lang.String str7 = user6.getNickname();
        user6.setId((java.lang.Long) 100L);
        java.lang.String str10 = user6.getEmail();
        com.example.randoop609.dto.UserDto.Response response11 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str12 = response11.getUsername();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified1 = new com.example.randoop609.service.UserServiceModified(userRepository0);
        userServiceModified1.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified1.editUser(putRequest4, (java.lang.Long) 0L);
        com.example.randoop609.repository.UserRepository userRepository7 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified8 = new com.example.randoop609.service.UserServiceModified(userRepository7);
        com.example.randoop609.domain.User user10 = userServiceModified8.getUser((java.lang.Long) 100L);
        com.example.randoop609.repository.UserRepository userRepository11 = null;
        com.example.randoop609.service.UserServiceModified userServiceModified12 = new com.example.randoop609.service.UserServiceModified(userRepository11);
        userServiceModified12.deleteUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest15 = new com.example.randoop609.dto.UserDto.PutRequest();
        userServiceModified12.editUser(putRequest15, (java.lang.Long) 0L);
        userServiceModified8.editUser(putRequest15, (java.lang.Long) 10L);
        putRequest15.setNickname("qbehvmnnrs");
        userServiceModified1.editUser(putRequest15, (java.lang.Long) 0L);
        com.example.randoop609.domain.User user25 = userServiceModified1.getUser((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user25);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder2.build();
        java.lang.String str8 = userBuilder2.toString();
        java.lang.String str9 = userBuilder2.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder2.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User user12 = userBuilder2.build();
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder2.id((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)" + "'", str9, "User.UserBuilder(id=null, username=, nickname=null, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(userBuilder14);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        java.lang.String str1 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder3 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder3.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder3.studentId("");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder3.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder9.nickname("");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)" + "'", str1, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder3);
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getUsername();
        java.lang.String str2 = signUpForm0.getStudentId();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getRePassword();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)");
        java.lang.String str9 = signUpForm0.getRePassword();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=User.UserBuilder(id=10, username=null, nickname=hi!, email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=null, studentId=null)), nickname=, email=hi!, password=, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }
}

