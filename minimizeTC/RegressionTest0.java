import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.Class<?> wildcardClass1 = signUpForm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("");
        java.lang.Class<?> wildcardClass3 = signUpForm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("");
        signUpForm0.setUsername("");
        java.lang.Class<?> wildcardClass5 = signUpForm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.example.randoop609.dto.UserDto userDto0 = new com.example.randoop609.dto.UserDto();
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User user9 = userBuilder8.build();
        java.lang.Class<?> wildcardClass10 = userBuilder8.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "hi!", "", "hi!", "");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getUsername();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setUsername("");
        java.lang.String str9 = user6.getUsername();
        java.lang.String str10 = user6.getNickname();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setUsername("");
        user6.setEmail("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "hi!", "hi!", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "", "");
        user6.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        java.lang.String str4 = signUpForm0.getPassword();
        signUpForm0.setUsername("");
        java.lang.String str7 = signUpForm0.getRePassword();
        java.lang.String str8 = signUpForm0.getStudentId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setUsername("hi!");
        user6.setEmail("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str9 = user6.getUsername();
        user6.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = signUpForm0.getUsername();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        signUpForm0.setPassword("");
        java.lang.String str6 = signUpForm0.getRePassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.studentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User user7 = userBuilder6.build();
        user7.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setRePassword("");
        java.lang.Class<?> wildcardClass5 = signUpForm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str8 = signUpForm0.getUsername();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        java.lang.String str4 = signUpForm0.getPassword();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        signUpForm0.setStudentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.Class<?> wildcardClass9 = signUpForm0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.domain.User user8 = new com.example.randoop609.domain.User((java.lang.Long) 100L, "", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "hi!", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user9 = userService1.saveUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str6 = signUpForm0.getUsername();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setUsername("");
        java.lang.String str9 = user6.getUsername();
        com.example.randoop609.dto.UserDto.Response response10 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str11 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("");
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = signUpForm0.getStudentId();
        java.lang.String str7 = signUpForm0.getPassword();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setPassword("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        user6.setNickname("");
        java.lang.Class<?> wildcardClass13 = user6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        java.lang.String str5 = putRequest2.getUsername();
        putRequest2.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.domain.User user8 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user9 = userService1.saveUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.domain.User user8 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "hi!", "hi!", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "", "");
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user9 = userService1.saveUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)", "hi!", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "");
        user6.setEmail("");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setUsername("hi!");
        user6.setId((java.lang.Long) 1L);
        java.lang.String str13 = user6.getEmail();
        user6.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str2 = authResponse1.getToken();
        java.lang.String str3 = authResponse1.getToken();
        java.lang.String str4 = authResponse1.getToken();
        java.lang.String str5 = authResponse1.getToken();
        java.lang.String str6 = authResponse1.getToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str2, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str3, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str4, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str5, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str6, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setNickname("hi!");
        java.lang.String str7 = putRequest2.getNickname();
        putRequest2.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm2 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm2.setStudentId("hi!");
        signUpForm2.setStudentId("hi!");
        com.example.randoop609.domain.User user7 = signUpForm2.toEntity();
        java.lang.String str8 = user7.getEmail();
        java.lang.String str9 = user7.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user10 = userService1.saveUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setUsername("");
        java.lang.String str9 = user6.getUsername();
        com.example.randoop609.dto.UserDto.Response response10 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str11 = response10.getNickname();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm2 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm2.setUsername("hi!");
        java.lang.String str5 = signUpForm2.getNickname();
        signUpForm2.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str8 = signUpForm2.getRePassword();
        com.example.randoop609.domain.User user9 = signUpForm2.toEntity();
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user10 = userService1.saveUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(user9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setId((java.lang.Long) 10L);
        user6.setUsername("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user3 = userService1.getUser((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setStudentId("");
        putRequest2.setNickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = user5.getEmail();
        java.lang.String str7 = user5.getStudentId();
        com.example.randoop609.dto.UserDto.Response response8 = new com.example.randoop609.dto.UserDto.Response(user5);
        java.lang.Class<?> wildcardClass9 = user5.getClass();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.studentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.username("");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "hi!", "hi!", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "", "");
        java.lang.String str7 = user6.getUsername();
        user6.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        user6.setId((java.lang.Long) 100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        signUpForm0.setUsername("");
        java.lang.String str4 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.studentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.id((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setUsername("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.Class<?> wildcardClass5 = putRequest0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.domain.User user8 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user8.setId((java.lang.Long) 10L);
        java.lang.String str11 = user8.getStudentId();
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user12 = userService1.saveUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        java.lang.String str4 = signUpForm0.getPassword();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        signUpForm0.setStudentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str9 = signUpForm0.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.email("");
        java.lang.String str9 = userBuilder8.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)" + "'", str9, "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setPassword("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setNickname("hi!");
        putRequest2.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("");
        signUpForm0.setStudentId("hi!");
        java.lang.Class<?> wildcardClass5 = signUpForm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "hi!", "", "hi!", "");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getNickname();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        java.lang.String str4 = signUpForm0.getPassword();
        signUpForm0.setUsername("");
        signUpForm0.setStudentId("hi!");
        signUpForm0.setRePassword("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str11 = signUpForm0.getRePassword();
        java.lang.String str12 = signUpForm0.getRePassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str11, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str12, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user3 = userService1.getUser((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.username("");
        java.lang.Class<?> wildcardClass7 = userBuilder2.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("");
        signUpForm0.setUsername("");
        java.lang.String str5 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.username("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User user9 = userBuilder6.build();
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user10 = userService1.saveUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "hi!", "hi!", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "", "");
        java.lang.String str7 = user6.getUsername();
        user6.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.dto.UserDto.Response response10 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str11 = response10.getUsername();
        java.lang.String str12 = response10.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str12, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)", "", "User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)", "User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        user6.setUsername("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.email("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.id((java.lang.Long) 10L);
        java.lang.String str7 = userBuilder4.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)" + "'", str7, "User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.id((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setNickname("hi!");
        putRequest2.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str2 = authResponse1.getToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)" + "'", str2, "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = user5.getEmail();
        java.lang.String str7 = user5.getStudentId();
        com.example.randoop609.dto.UserDto.Response response8 = new com.example.randoop609.dto.UserDto.Response(user5);
        java.lang.Long long9 = response8.getId();
        java.lang.Long long10 = response8.getId();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.password("hi!");
        java.lang.String str9 = userBuilder6.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder6.username("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)" + "'", str9, "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder11);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 10L, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "", "", "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)", "hi!");
        user6.setEmail("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        user6.setPassword("");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.email("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.email("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.id((java.lang.Long) 10L);
        java.lang.String str7 = userBuilder6.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)" + "'", str7, "User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.domain.User user8 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user8.setUsername("");
        java.lang.String str11 = user8.getUsername();
        com.example.randoop609.dto.UserDto.Response response12 = new com.example.randoop609.dto.UserDto.Response(user8);
        user8.setStudentId("");
        user8.setStudentId("");
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user17 = userService1.saveUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user3 = userService1.getUser((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        user1.setNickname("hi!");
        user1.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.dto.UserDto.Response response6 = new com.example.randoop609.dto.UserDto.Response(user1);
        user1.setEmail("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(user1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = user5.getNickname();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setNickname("hi!");
        java.lang.String str5 = putRequest0.getNickname();
        putRequest0.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest0.setUsername("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.Class<?> wildcardClass14 = putRequest0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        signUpForm0.setNickname("");
        signUpForm0.setStudentId("hi!");
        signUpForm0.setPassword("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        signUpForm0.setStudentId("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getStudentId();
        java.lang.String str2 = putRequest0.getNickname();
        putRequest0.setNickname("User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
        putRequest0.setNickname("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setPassword("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setNickname("hi!");
        com.example.randoop609.domain.User user6 = signUpForm0.toEntity();
        java.lang.String str7 = signUpForm0.getRePassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder4.email("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User user11 = userBuilder4.build();
        user11.setEmail("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        java.lang.String str14 = user11.getEmail();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)" + "'", str14, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str7 = signUpForm0.getStudentId();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str10 = signUpForm0.getRePassword();
        java.lang.String str11 = signUpForm0.getRePassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setStudentId("");
        java.lang.String str5 = putRequest0.getUsername();
        putRequest0.setUsername("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        putRequest0.setUsername("hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        user1.setNickname("hi!");
        user1.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str6 = user1.getNickname();
        user1.setEmail("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        user1.setEmail("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        user1.setStudentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str6, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        putRequest0.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User user7 = userBuilder4.build();
        java.lang.String str8 = userBuilder4.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder4.password("User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder4.email("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str8, "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.studentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str7 = userBuilder2.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))" + "'", str7, "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.studentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.studentId("User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setNickname("hi!");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str5 = putRequest0.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)" + "'", str5, "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 100L, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)", "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)", "");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setNickname("hi!");
        putRequest2.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest2.setUsername("");
        java.lang.String str11 = putRequest2.getNickname();
        java.lang.String str12 = putRequest2.getNickname();
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str9 = user6.getStudentId();
        user6.setNickname("hi!");
        user6.setEmail("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        signUpForm0.setNickname("");
        java.lang.String str4 = signUpForm0.getNickname();
        signUpForm0.setStudentId("hi!");
        java.lang.Class<?> wildcardClass7 = signUpForm0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setUsername("");
        java.lang.String str9 = user6.getUsername();
        com.example.randoop609.dto.UserDto.Response response10 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("");
        java.lang.String str13 = user6.getPassword();
        com.example.randoop609.dto.UserDto.Response response14 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setId((java.lang.Long) 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setNickname("hi!");
        putRequest2.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest2.setUsername("");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        java.lang.String str3 = userBuilder0.toString();
        java.lang.String str4 = userBuilder0.toString();
        java.lang.String str5 = userBuilder0.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str3, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str4, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str5, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str6 = signUpForm0.getRePassword();
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        user7.setNickname("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(user7);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setStudentId("");
        putRequest0.setUsername("hi!");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getNickname();
        putRequest0.setUsername("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str4 = putRequest0.getStudentId();
        java.lang.String str5 = putRequest0.getNickname();
        java.lang.String str6 = putRequest0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "hi!", "", "hi!", "");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getStudentId();
        java.lang.String str9 = response7.getStudentId();
        java.lang.String str10 = response7.getStudentId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "hi!", "", "hi!", "");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getStudentId();
        java.lang.String str9 = response7.getUsername();
        java.lang.String str10 = response7.getUsername();
        java.lang.String str11 = response7.getStudentId();
        java.lang.String str12 = response7.getStudentId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 100L, "", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "hi!", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        java.lang.String str7 = user6.getNickname();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)" + "'", str7, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        java.lang.String str3 = userBuilder0.toString();
        java.lang.String str4 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder0.username("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str7 = userBuilder6.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str3, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str4, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)" + "'", str7, "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = signUpForm0.getNickname();
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        java.lang.String str8 = user7.getStudentId();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str3 = putRequest2.getNickname();
        putRequest2.setUsername("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        putRequest2.setStudentId("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        com.example.randoop609.domain.User user10 = userBuilder4.build();
        user10.setPassword("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str13 = user10.getUsername();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str3 = putRequest2.getNickname();
        putRequest2.setUsername("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str6 = putRequest2.getStudentId();
        putRequest2.setNickname("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.email("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str3 = putRequest2.getNickname();
        putRequest2.setNickname("");
        putRequest2.setNickname("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("");
        signUpForm0.setUsername("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "hi!", "hi!", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "", "");
        java.lang.String str7 = user6.getUsername();
        user6.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.dto.UserDto.Response response10 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str11 = response10.getStudentId();
        java.lang.String str12 = response10.getNickname();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str11, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setNickname("hi!");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str7 = putRequest0.getUsername();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.String str2 = signUpForm0.getPassword();
        java.lang.String str3 = signUpForm0.getRePassword();
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.Class<?> wildcardClass5 = signUpForm0.getClass();
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = user5.getEmail();
        java.lang.String str7 = user5.getNickname();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str9 = user6.getStudentId();
        java.lang.String str10 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        signUpForm0.setUsername("hi!");
        signUpForm0.setUsername("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        signUpForm0.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str10 = signUpForm0.getStudentId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setNickname("hi!");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest0.setUsername("");
        java.lang.String str9 = putRequest0.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)" + "'", str9, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str3 = putRequest2.getUsername();
        java.lang.String str4 = putRequest2.getNickname();
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        java.lang.String str5 = signUpForm0.getPassword();
        java.lang.String str6 = signUpForm0.getUsername();
        java.lang.String str7 = signUpForm0.getUsername();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setPassword("hi!");
        java.lang.String str3 = signUpForm0.getUsername();
        java.lang.String str4 = signUpForm0.getNickname();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        java.lang.String str7 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "hi!", "", "hi!", "");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getStudentId();
        java.lang.String str9 = response7.getUsername();
        java.lang.String str10 = response7.getStudentId();
        java.lang.String str11 = response7.getUsername();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm2 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str3 = signUpForm2.getRePassword();
        java.lang.String str4 = signUpForm2.getStudentId();
        signUpForm2.setPassword("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User user7 = signUpForm2.toEntity();
        java.lang.String str8 = user7.getStudentId();
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user9 = userService1.saveUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = signUpForm0.getNickname();
        signUpForm0.setPassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str9 = signUpForm0.getRePassword();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User user7 = userBuilder4.build();
        user7.setStudentId("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setStudentId("");
        java.lang.String str5 = putRequest0.getUsername();
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str8 = putRequest0.getStudentId();
        java.lang.String str9 = putRequest0.getUsername();
        java.lang.String str10 = putRequest0.getUsername();
        java.lang.String str11 = putRequest0.getStudentId();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str11, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        java.lang.String str3 = putRequest0.getUsername();
        java.lang.String str4 = putRequest0.getStudentId();
        putRequest0.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str7 = putRequest0.getUsername();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setUsername("hi!");
        java.lang.String str11 = user6.getStudentId();
        user6.setUsername("hi!");
        user6.setNickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.dto.UserDto.Response response16 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str17 = response16.getStudentId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder4.email("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User user11 = userBuilder4.build();
        user11.setEmail("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        java.lang.String str14 = user11.getUsername();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setNickname("hi!");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest0.setUsername("");
        java.lang.String str9 = putRequest0.getNickname();
        java.lang.String str10 = putRequest0.getNickname();
        java.lang.String str11 = putRequest0.getUsername();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        java.lang.Class<?> wildcardClass5 = userBuilder4.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.studentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str9 = userBuilder6.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=0, username=null, nickname=, email=hi!, password=null, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))" + "'", str9, "User.UserBuilder(id=0, username=null, nickname=, email=hi!, password=null, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.password("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User user5 = userBuilder2.build();
        java.lang.Long long6 = user5.getId();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getNickname();
        putRequest0.setNickname("");
        putRequest0.setNickname("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        java.lang.String str6 = putRequest0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)" + "'", str6, "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder4.email("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        java.lang.String str2 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user3 = signUpForm0.toEntity();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(user3);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user3 = userService1.getUser((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setUsername("hi!");
        java.lang.String str11 = user6.getStudentId();
        user6.setUsername("hi!");
        user6.setNickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.dto.UserDto.Response response16 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setNickname("hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str3 = putRequest0.getStudentId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str3, "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setUsername("hi!");
        java.lang.String str11 = user6.getStudentId();
        user6.setUsername("hi!");
        java.lang.String str14 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.email("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.id((java.lang.Long) 10L);
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder4.nickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.example.randoop609.dto.UserDto.LoginRequest loginRequest0 = new com.example.randoop609.dto.UserDto.LoginRequest();
        java.lang.String str1 = loginRequest0.getUsername();
        java.lang.String str2 = loginRequest0.getUsername();
        java.lang.String str3 = loginRequest0.getUsername();
        java.lang.String str4 = loginRequest0.getPassword();
        java.lang.String str5 = loginRequest0.getPassword();
        java.lang.String str6 = loginRequest0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.email("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User user5 = userBuilder4.build();
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder4.nickname("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(userBuilder7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user3 = userService1.getUser((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        java.lang.String str5 = putRequest2.getUsername();
        putRequest2.setStudentId("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        putRequest2.setUsername("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setUsername("");
        java.lang.String str9 = user6.getUsername();
        user6.setUsername("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        java.lang.String str4 = signUpForm0.getUsername();
        java.lang.String str5 = signUpForm0.getNickname();
        java.lang.String str6 = signUpForm0.getStudentId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        java.lang.String str3 = userBuilder0.toString();
        java.lang.String str4 = userBuilder0.toString();
        com.example.randoop609.domain.User user5 = userBuilder0.build();
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder0.nickname("");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str3, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str4, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(userBuilder7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.password("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str9 = userBuilder8.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)" + "'", str9, "User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder4.email("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User user11 = userBuilder4.build();
        java.lang.String str12 = user11.getEmail();
        user11.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        user11.setStudentId("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str12, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User user7 = userBuilder4.build();
        com.example.randoop609.dto.UserDto.Response response8 = new com.example.randoop609.dto.UserDto.Response(user7);
        java.lang.String str9 = response8.getStudentId();
        java.lang.String str10 = response8.getStudentId();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        signUpForm0.setUsername("");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=null)", "User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)", "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)", "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        user6.setNickname("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)");
        user6.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.studentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.password("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.studentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.nickname("User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        java.lang.Class<?> wildcardClass13 = userBuilder12.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.password("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.email("User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=null)");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        user9.setEmail("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str12 = user9.getEmail();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)" + "'", str12, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setPassword("hi!");
        java.lang.String str3 = signUpForm0.getUsername();
        java.lang.String str4 = signUpForm0.getUsername();
        signUpForm0.setPassword("");
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(user7);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str2 = authResponse1.getToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str2, "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)", "", "User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)", "User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str7 = user6.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)" + "'", str7, "User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder4.username("User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder4.studentId("User.UserBuilder(id=0, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.nickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        java.lang.Class<?> wildcardClass5 = userBuilder0.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.username("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User user7 = userBuilder4.build();
        com.example.randoop609.domain.User user8 = userBuilder4.build();
        user8.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(user8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str9 = user6.getStudentId();
        java.lang.String str10 = user6.getNickname();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setUsername("hi!");
        java.lang.String str11 = user6.getStudentId();
        user6.setUsername("hi!");
        user6.setNickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        user6.setNickname("User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "hi!", "", "hi!", "");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = user6.getPassword();
        user6.setEmail("User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        signUpForm0.setNickname("");
        signUpForm0.setStudentId("hi!");
        signUpForm0.setUsername("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.domain.User user8 = signUpForm0.toEntity();
        com.example.randoop609.dto.UserDto.Response response9 = new com.example.randoop609.dto.UserDto.Response(user8);
        com.example.randoop609.dto.UserDto.Response response10 = new com.example.randoop609.dto.UserDto.Response(user8);
        java.lang.String str11 = user8.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setUsername("");
        java.lang.String str9 = user6.getUsername();
        user6.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        java.lang.String str4 = signUpForm0.getPassword();
        signUpForm0.setUsername("");
        signUpForm0.setStudentId("hi!");
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str11 = signUpForm0.getPassword();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "hi!", "hi!", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "", "");
        java.lang.String str7 = user6.getUsername();
        user6.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str10 = user6.getUsername();
        user6.setId((java.lang.Long) 10L);
        user6.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.example.randoop609.dto.UserDto.LoginRequest loginRequest0 = new com.example.randoop609.dto.UserDto.LoginRequest();
        java.lang.String str1 = loginRequest0.getUsername();
        java.lang.String str2 = loginRequest0.getUsername();
        java.lang.String str3 = loginRequest0.getUsername();
        java.lang.String str4 = loginRequest0.getPassword();
        java.lang.String str5 = loginRequest0.getUsername();
        java.lang.String str6 = loginRequest0.getUsername();
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
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setStudentId("");
        java.lang.String str7 = putRequest2.getUsername();
        putRequest2.setUsername("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        putRequest2.setNickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setUsername("");
        java.lang.String str9 = user6.getUsername();
        com.example.randoop609.dto.UserDto.Response response10 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str11 = response10.getStudentId();
        java.lang.String str12 = response10.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User user9 = userBuilder6.build();
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder6.username("User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userBuilder11);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setStudentId("");
        putRequest0.setNickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        java.lang.String str7 = putRequest0.getNickname();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)" + "'", str7, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("");
        signUpForm0.setUsername("");
        signUpForm0.setRePassword("");
        java.lang.String str7 = signUpForm0.getStudentId();
        java.lang.String str8 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.Long long2 = user1.getId();
        user1.setId((java.lang.Long) 0L);
        java.lang.String str5 = user1.getNickname();
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setStudentId("");
        java.lang.String str7 = putRequest2.getUsername();
        java.lang.String str8 = putRequest2.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.username("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.username("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.email("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder10.id((java.lang.Long) 10L);
        com.example.randoop609.domain.User user15 = userBuilder10.build();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=0, username=null, nickname=, email=hi!, password=null, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "hi!", "", "hi!", "");
        user6.setStudentId("User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
        java.lang.String str9 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "hi!", "hi!", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "", "");
        java.lang.String str7 = user6.getUsername();
        user6.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str10 = user6.getUsername();
        java.lang.String str11 = user6.getStudentId();
        com.example.randoop609.dto.UserDto.Response response12 = new com.example.randoop609.dto.UserDto.Response(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str11, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setUsername("");
        java.lang.String str9 = user6.getUsername();
        com.example.randoop609.dto.UserDto.Response response10 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str11 = user6.getPassword();
        user6.setUsername("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str9 = user6.getNickname();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.username("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User user7 = userBuilder4.build();
        java.lang.Class<?> wildcardClass8 = userBuilder4.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.String str2 = user1.getStudentId();
        java.lang.String str3 = user1.getNickname();
        user1.setEmail("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        user1.setEmail("User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)", "User.UserBuilder(id=0, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=, studentId=null)", "User.UserBuilder(id=0, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null)");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.Long long2 = user1.getId();
        user1.setEmail("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        user1.setUsername("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str7 = user1.getUsername();
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str7, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        user4.setStudentId("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        java.lang.String str7 = user4.getUsername();
        java.lang.String str8 = user4.getUsername();
        user4.setStudentId("User.UserBuilder(id=0, username=null, nickname=, email=hi!, password=null, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setPassword("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setNickname("hi!");
        com.example.randoop609.domain.User user6 = signUpForm0.toEntity();
        user6.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str9 = user6.getPassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        signUpForm0.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setPassword("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        user6.setNickname("");
        java.lang.String str13 = user6.getUsername();
        com.example.randoop609.dto.UserDto.Response response14 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.Class<?> wildcardClass15 = response14.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.String str2 = signUpForm0.getPassword();
        java.lang.String str3 = signUpForm0.getUsername();
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.domain.User user8 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user8.setId((java.lang.Long) 10L);
        java.lang.String str11 = user8.getStudentId();
        java.lang.String str12 = user8.getPassword();
        java.lang.String str13 = user8.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user14 = userService1.saveUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setPassword("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setNickname("hi!");
        signUpForm0.setPassword("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str9 = user6.getUsername();
        java.lang.String str10 = user6.getEmail();
        java.lang.String str11 = user6.getPassword();
        user6.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        java.lang.String str2 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user3 = signUpForm0.toEntity();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=null)");
        java.lang.String str8 = signUpForm0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str6 = signUpForm0.getStudentId();
        java.lang.String str7 = signUpForm0.getUsername();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        signUpForm0.setRePassword("User.UserBuilder(id=0, username=null, nickname=, email=hi!, password=null, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        signUpForm0.setPassword("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str6, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.username("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.domain.User user9 = userBuilder8.build();
        user9.setId((java.lang.Long) (-1L));
        user9.setId((java.lang.Long) 10L);
        user9.setEmail("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        user6.setUsername("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.email("");
        java.lang.String str7 = userBuilder4.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder4.id((java.lang.Long) 10L);
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder9.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder11.nickname("hi!");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)" + "'", str7, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(userBuilder13);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.domain.User user8 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "hi!", "hi!", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "", "");
        java.lang.String str9 = user8.getUsername();
        user8.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        user8.setId((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user14 = userService1.saveUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.email("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User user5 = userBuilder4.build();
        java.lang.String str6 = user5.getEmail();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str6, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.username("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.username("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder10.username("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.Class<?> wildcardClass15 = userBuilder10.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setNickname("hi!");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest0.setUsername("");
        putRequest0.setStudentId("hi!");
        java.lang.String str11 = putRequest0.getUsername();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setUsername("hi!");
        user6.setPassword("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setNickname("User.UserBuilder(id=0, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=, studentId=null)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.studentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.username("");
        java.lang.Class<?> wildcardClass11 = userBuilder8.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "hi!", "", "hi!", "");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = user6.getPassword();
        user6.setPassword("User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        java.lang.String str4 = signUpForm0.getPassword();
        signUpForm0.setUsername("");
        java.lang.String str7 = signUpForm0.getUsername();
        signUpForm0.setUsername("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)", "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.example.randoop609.dto.UserDto.LoginRequest loginRequest0 = new com.example.randoop609.dto.UserDto.LoginRequest();
        java.lang.String str1 = loginRequest0.getUsername();
        java.lang.String str2 = loginRequest0.getUsername();
        java.lang.String str3 = loginRequest0.getPassword();
        java.lang.String str4 = loginRequest0.getUsername();
        java.lang.String str5 = loginRequest0.getPassword();
        java.lang.String str6 = loginRequest0.getUsername();
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
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.password("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User user5 = userBuilder2.build();
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder2.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder7.password("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder7.password("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str3 = putRequest0.getUsername();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.password("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "hi!", "", "hi!", "");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getStudentId();
        java.lang.String str9 = response7.getUsername();
        java.lang.String str10 = response7.getUsername();
        java.lang.String str11 = response7.getStudentId();
        java.lang.Class<?> wildcardClass12 = response7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = user5.getEmail();
        java.lang.String str7 = user5.getStudentId();
        com.example.randoop609.dto.UserDto.Response response8 = new com.example.randoop609.dto.UserDto.Response(user5);
        java.lang.String str9 = response8.getNickname();
        java.lang.String str10 = response8.getStudentId();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setRePassword("");
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=null)");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.Long long2 = user1.getId();
        user1.setId((java.lang.Long) 0L);
        java.lang.String str5 = user1.getUsername();
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 10L, "hi!", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        user6.setStudentId("User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
        java.lang.String str9 = user6.getNickname();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)" + "'", str9, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User user9 = userBuilder8.build();
        java.lang.String str10 = userBuilder8.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder8.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder8.password("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str10, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setUsername("hi!");
        java.lang.String str11 = user6.getStudentId();
        user6.setUsername("hi!");
        user6.setNickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.dto.UserDto.Response response16 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setUsername("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setStudentId("");
        java.lang.String str5 = putRequest0.getUsername();
        putRequest0.setUsername("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str8 = putRequest0.getStudentId();
        putRequest0.setStudentId("User.UserBuilder(id=0, username=null, nickname=, email=hi!, password=null, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        putRequest0.setUsername("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        java.lang.String str2 = signUpForm0.getStudentId();
        signUpForm0.setPassword("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = signUpForm0.getPassword();
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        java.lang.String str8 = user7.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)" + "'", str6, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setNickname("hi!");
        java.lang.String str7 = putRequest2.getNickname();
        putRequest2.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest2.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest2.setUsername("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        putRequest2.setStudentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        putRequest2.setNickname("User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getStudentId();
        java.lang.String str2 = putRequest0.getNickname();
        putRequest0.setNickname("User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
        java.lang.String str5 = putRequest0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str7 = signUpForm0.getStudentId();
        signUpForm0.setPassword("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "hi!", "", "", "");
        user6.setEmail("hi!");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getNickname();
        java.lang.String str2 = putRequest0.getNickname();
        java.lang.String str3 = putRequest0.getNickname();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setNickname("hi!");
        java.lang.String str7 = putRequest2.getNickname();
        putRequest2.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest2.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest2.setUsername("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        putRequest2.setStudentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.email("");
        com.example.randoop609.domain.User user9 = userBuilder2.build();
        user9.setUsername("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        user9.setEmail("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        java.lang.Long long10 = user9.getId();
        user9.setUsername("User.UserBuilder(id=0, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        signUpForm0.setNickname("");
        java.lang.String str4 = signUpForm0.getNickname();
        signUpForm0.setStudentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        signUpForm0.setStudentId("");
        signUpForm0.setStudentId("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setNickname("hi!");
        putRequest2.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest2.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm2 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm2.setStudentId("hi!");
        signUpForm2.setStudentId("hi!");
        com.example.randoop609.domain.User user7 = signUpForm2.toEntity();
        java.lang.String str8 = user7.getEmail();
        java.lang.String str9 = user7.getStudentId();
        com.example.randoop609.dto.UserDto.Response response10 = new com.example.randoop609.dto.UserDto.Response(user7);
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user11 = userService1.saveUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.nickname("hi!");
        com.example.randoop609.domain.User user11 = userBuilder6.build();
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user12 = userService1.saveUser(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(user11);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.password("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User user7 = userBuilder4.build();
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user8 = userService1.saveUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.username("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.username("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder12.password("");
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder12.id((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass17 = userBuilder16.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
        org.junit.Assert.assertNotNull(userBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "hi!", "", "hi!", "");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = user6.getPassword();
        java.lang.String str9 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "hi!", "hi!", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "", "");
        java.lang.String str7 = user6.getUsername();
        user6.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str10 = user6.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str10, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)", "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))", "", "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 100L, "", "User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)", "User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setPassword("hi!");
        java.lang.String str3 = signUpForm0.getUsername();
        java.lang.String str4 = signUpForm0.getUsername();
        signUpForm0.setRePassword("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(user7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder8.nickname("User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder12.nickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder14.email("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder18 = userBuilder14.nickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder20 = userBuilder18.id((java.lang.Long) 0L);
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
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        java.lang.String str2 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user3 = signUpForm0.toEntity();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        user4.setStudentId("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(user4);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.password("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.nickname("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.String str2 = signUpForm0.getPassword();
        java.lang.String str3 = signUpForm0.getRePassword();
        java.lang.String str4 = signUpForm0.getPassword();
        signUpForm0.setRePassword("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str7 = signUpForm0.getUsername();
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        signUpForm0.setRePassword("");
        signUpForm0.setStudentId("User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str2 = authResponse1.getToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)" + "'", str2, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setUsername("hi!");
        java.lang.String str11 = user6.getStudentId();
        user6.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str14 = user6.getNickname();
        java.lang.String str15 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str14, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setPassword("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setNickname("hi!");
        com.example.randoop609.domain.User user6 = signUpForm0.toEntity();
        java.lang.String str7 = user6.getStudentId();
        user6.setEmail("User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        java.lang.String str10 = user6.getUsername();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setNickname("hi!");
        java.lang.String str7 = putRequest2.getNickname();
        putRequest2.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str10 = putRequest2.getUsername();
        java.lang.String str11 = putRequest2.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        user9.setNickname("hi!");
        user9.setId((java.lang.Long) 0L);
        java.lang.String str14 = user9.getUsername();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.String str2 = user1.getStudentId();
        user1.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "hi!", "", "hi!", "");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getStudentId();
        java.lang.String str9 = response7.getUsername();
        java.lang.String str10 = response7.getStudentId();
        java.lang.String str11 = response7.getNickname();
        java.lang.String str12 = response7.getUsername();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = signUpForm0.getNickname();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str9 = signUpForm0.getPassword();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        signUpForm0.setPassword("User.UserBuilder(id=0, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=, studentId=null)");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        user9.setEmail("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.dto.UserDto.Response response12 = new com.example.randoop609.dto.UserDto.Response(user9);
        java.lang.String str13 = user9.getEmail();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)" + "'", str13, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.studentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.username("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder6.password("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder12.nickname("User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null)");
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
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setStudentId("");
        putRequest0.setNickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        java.lang.String str7 = putRequest0.getUsername();
        putRequest0.setUsername("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setNickname("hi!");
        java.lang.String str11 = user6.getEmail();
        java.lang.String str12 = user6.getNickname();
        user6.setEmail("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setUsername("");
        java.lang.String str9 = user6.getUsername();
        com.example.randoop609.dto.UserDto.Response response10 = new com.example.randoop609.dto.UserDto.Response(user6);
        user6.setStudentId("");
        user6.setStudentId("");
        com.example.randoop609.dto.UserDto.Response response15 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str16 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.password("hi!");
        java.lang.String str9 = userBuilder6.toString();
        java.lang.String str10 = userBuilder6.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)" + "'", str9, "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)" + "'", str10, "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getNickname();
        putRequest0.setUsername("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        putRequest0.setUsername("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 100L, "", "User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)", "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)", "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.studentId("hi!");
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        java.lang.String str3 = putRequest0.getUsername();
        java.lang.Class<?> wildcardClass4 = putRequest0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.String str2 = signUpForm0.getRePassword();
        signUpForm0.setPassword("hi!");
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        java.lang.String str7 = signUpForm0.getUsername();
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 10L, "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)", "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)", "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)", "User.UserBuilder(id=0, username=null, nickname=, email=hi!, password=null, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))", "hi!");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        java.lang.String str5 = signUpForm0.getPassword();
        signUpForm0.setNickname("hi!");
        java.lang.String str8 = signUpForm0.getUsername();
        java.lang.String str9 = signUpForm0.getRePassword();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.studentId("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        com.example.randoop609.domain.User user10 = userBuilder4.build();
        user10.setPassword("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str13 = user10.getPassword();
        user10.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)" + "'", str13, "User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.id((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        signUpForm0.setStudentId("");
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.studentId("User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.nickname("User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.nickname("");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        java.lang.String str2 = signUpForm0.getStudentId();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        signUpForm0.setStudentId("User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setNickname("hi!");
        java.lang.String str11 = user6.getEmail();
        user6.setPassword("User.UserBuilder(id=0, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=, studentId=null)");
        java.lang.Class<?> wildcardClass14 = user6.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.username("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User user11 = userBuilder8.build();
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder8.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder15 = userBuilder13.username("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userBuilder13);
        org.junit.Assert.assertNotNull(userBuilder15);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.example.randoop609.dto.UserDto.LoginRequest loginRequest0 = new com.example.randoop609.dto.UserDto.LoginRequest();
        java.lang.String str1 = loginRequest0.getUsername();
        java.lang.String str2 = loginRequest0.getUsername();
        java.lang.String str3 = loginRequest0.getUsername();
        java.lang.Class<?> wildcardClass4 = loginRequest0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)", "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)", "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)", "hi!");
        java.lang.String str7 = user6.getNickname();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str7, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setNickname("hi!");
        java.lang.String str5 = putRequest0.getNickname();
        putRequest0.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest0.setUsername("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        putRequest0.setUsername("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest0.setUsername("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str3 = putRequest2.getNickname();
        java.lang.String str4 = putRequest2.getNickname();
        putRequest2.setUsername("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setUsername("");
        java.lang.String str9 = user6.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setNickname("hi!");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest0.setUsername("");
        java.lang.String str9 = putRequest0.getNickname();
        java.lang.String str10 = putRequest0.getNickname();
        java.lang.String str11 = putRequest0.getNickname();
        putRequest0.setUsername("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.email("");
        java.lang.String str7 = userBuilder4.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder4.id((java.lang.Long) 10L);
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder4.username("User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder4.id((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)" + "'", str7, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(userBuilder13);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setNickname("hi!");
        java.lang.String str11 = user6.getEmail();
        java.lang.String str12 = user6.getStudentId();
        java.lang.String str13 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str7 = signUpForm0.getStudentId();
        java.lang.String str8 = signUpForm0.getRePassword();
        java.lang.String str9 = signUpForm0.getPassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.username("User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null)");
        java.lang.String str9 = userBuilder8.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder8.nickname("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)" + "'", str9, "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder11);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getStudentId();
        java.lang.String str2 = putRequest0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.password("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User user5 = userBuilder2.build();
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder2.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder7.password("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder9.username("");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        user9.setId((java.lang.Long) 1L);
        user9.setUsername("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str14 = user9.getUsername();
        user9.setStudentId("");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str14, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.example.randoop609.dto.UserDto.LoginRequest loginRequest0 = new com.example.randoop609.dto.UserDto.LoginRequest();
        java.lang.String str1 = loginRequest0.getUsername();
        java.lang.String str2 = loginRequest0.getUsername();
        java.lang.String str3 = loginRequest0.getPassword();
        java.lang.String str4 = loginRequest0.getPassword();
        java.lang.String str5 = loginRequest0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setUsername("hi!");
        java.lang.String str11 = user6.getStudentId();
        user6.setUsername("hi!");
        user6.setNickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        user6.setId((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = user5.getEmail();
        java.lang.String str7 = user5.getStudentId();
        com.example.randoop609.dto.UserDto.Response response8 = new com.example.randoop609.dto.UserDto.Response(user5);
        java.lang.Long long9 = response8.getId();
        java.lang.String str10 = response8.getUsername();
        java.lang.String str11 = response8.getUsername();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.email("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str5 = userBuilder0.toString();
        com.example.randoop609.domain.User user6 = userBuilder0.build();
        java.lang.String str7 = userBuilder0.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)" + "'", str5, "User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)" + "'", str7, "User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.studentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.nickname("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        java.lang.String str9 = userBuilder6.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null), email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null))" + "'", str9, "User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null), email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null))");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "hi!", "", "hi!", "");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getStudentId();
        java.lang.String str9 = response7.getUsername();
        java.lang.String str10 = response7.getUsername();
        java.lang.String str11 = response7.getUsername();
        java.lang.String str12 = response7.getUsername();
        java.lang.String str13 = response7.getNickname();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str9 = user6.getStudentId();
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.getEmail();
        java.lang.String str12 = user6.getEmail();
        java.lang.String str13 = user6.getNickname();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.String str2 = user1.getStudentId();
        user1.setUsername("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=null)");
        user1.setUsername("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        user1.setStudentId("User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.email("hi!");
        com.example.randoop609.domain.User user7 = userBuilder6.build();
        java.lang.String str8 = user7.getUsername();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = user5.getEmail();
        user5.setEmail("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str9 = user5.getNickname();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        java.lang.String str5 = putRequest2.getUsername();
        java.lang.String str6 = putRequest2.getStudentId();
        putRequest2.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        com.example.randoop609.domain.User user10 = userBuilder4.build();
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder4.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder12.nickname("User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.domain.User user8 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user8.setPassword("hi!");
        user8.setUsername("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)");
        java.lang.String str13 = user8.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user14 = userService1.saveUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)" + "'", str13, "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 10L, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))", "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))", "User.UserBuilder(id=0, username=null, nickname=, email=hi!, password=null, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        user6.setId((java.lang.Long) 1L);
        user6.setEmail("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setStudentId("");
        putRequest2.setNickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.username("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.nickname("User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null), email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        java.lang.String str2 = signUpForm0.getStudentId();
        signUpForm0.setRePassword("hi!");
        java.lang.String str5 = signUpForm0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        signUpForm0.setNickname("");
        java.lang.String str4 = signUpForm0.getPassword();
        signUpForm0.setPassword("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setNickname("hi!");
        java.lang.String str5 = putRequest0.getNickname();
        putRequest0.setUsername("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)");
        putRequest0.setUsername("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 100L, "User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)", "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))", "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null), email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null))", "");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        user4.setStudentId("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        java.lang.String str7 = user4.getPassword();
        java.lang.String str8 = user4.getStudentId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)" + "'", str8, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        java.lang.String str5 = signUpForm0.getNickname();
        signUpForm0.setPassword("User.UserBuilder(id=0, username=null, nickname=, email=hi!, password=null, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.email("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.id((java.lang.Long) 10L);
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.password("User.UserBuilder(id=100, username=null, nickname=, email=null, password=null, studentId=User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str6 = signUpForm0.getRePassword();
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        java.lang.Long long8 = user7.getId();
        java.lang.String str9 = user7.getNickname();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.Long long2 = user1.getId();
        user1.setEmail("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        user1.setUsername("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        user1.setPassword("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=null)");
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=null)", "User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)", "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)", "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        user6.setNickname("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)");
        java.lang.Class<?> wildcardClass9 = user6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setUsername("");
        java.lang.String str9 = user6.getUsername();
        com.example.randoop609.dto.UserDto.Response response10 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str11 = response10.getUsername();
        java.lang.String str12 = response10.getNickname();
        java.lang.String str13 = response10.getUsername();
        java.lang.String str14 = response10.getUsername();
        java.lang.String str15 = response10.getNickname();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        signUpForm0.setNickname("");
        java.lang.String str4 = signUpForm0.getNickname();
        signUpForm0.setRePassword("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        java.lang.String str7 = signUpForm0.getUsername();
        signUpForm0.setNickname("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getPassword();
        java.lang.String str4 = signUpForm0.getRePassword();
        signUpForm0.setPassword("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        java.lang.String str3 = putRequest0.getUsername();
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        putRequest0.setUsername("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        putRequest0.setStudentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.username("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.domain.User user9 = userBuilder8.build();
        user9.setPassword("");
        user9.setEmail("hi!");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)", "");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)", "");
        java.lang.String str7 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)" + "'", str7, "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        java.lang.String str3 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder0.password("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder5.email("hi!");
        java.lang.String str8 = userBuilder5.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str3, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=hi!, password=User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null), studentId=null)" + "'", str8, "User.UserBuilder(id=null, username=null, nickname=, email=hi!, password=User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null), studentId=null)");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str9 = user6.getUsername();
        user6.setPassword("");
        java.lang.String str12 = user6.getStudentId();
        user6.setStudentId("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.studentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.password("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.email("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder8.username("User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder8.studentId("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User user9 = userBuilder8.build();
        user9.setStudentId("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str12 = user9.getNickname();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        signUpForm0.setUsername("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str8 = signUpForm0.getNickname();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setStudentId("");
        java.lang.String str5 = putRequest0.getUsername();
        java.lang.String str6 = putRequest0.getUsername();
        putRequest0.setUsername("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setStudentId("");
        java.lang.String str5 = putRequest0.getUsername();
        putRequest0.setUsername("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setPassword("hi!");
        java.lang.String str3 = signUpForm0.getUsername();
        java.lang.String str4 = signUpForm0.getUsername();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        signUpForm0.setPassword("hi!");
        java.lang.String str9 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.studentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.password("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.studentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.nickname("User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        com.example.randoop609.domain.User user13 = userBuilder10.build();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(user13);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str6 = signUpForm0.getStudentId();
        java.lang.String str7 = signUpForm0.getUsername();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User user10 = signUpForm0.toEntity();
        signUpForm0.setRePassword("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str6, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)", "User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.email("");
        java.lang.String str7 = userBuilder4.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder4.password("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder9.email("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)" + "'", str7, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.nickname("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.email("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str9 = user6.getUsername();
        java.lang.String str10 = user6.getEmail();
        java.lang.String str11 = user6.getEmail();
        user6.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=, email=hi!, password=User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null), studentId=null)", "hi!", "");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        signUpForm0.setRePassword("User.UserBuilder(id=0, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=, studentId=null)");
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder8.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        java.lang.String str2 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user3 = signUpForm0.toEntity();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(user3);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 100L, "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)", "User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)", "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))", "", "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        java.lang.String str3 = userBuilder0.toString();
        java.lang.String str4 = userBuilder0.toString();
        com.example.randoop609.domain.User user5 = userBuilder0.build();
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder0.email("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder7.username("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str3, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str4, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)", "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)", "User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        java.lang.String str2 = signUpForm0.getStudentId();
        signUpForm0.setPassword("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        signUpForm0.setUsername("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.id((java.lang.Long) 100L);
        java.lang.String str9 = userBuilder8.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder8.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder11.email("");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str9, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(userBuilder13);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.domain.User user8 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user8.setPassword("hi!");
        user8.setPassword("User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user13 = userService1.saveUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.String str2 = user1.getStudentId();
        java.lang.String str3 = user1.getNickname();
        user1.setId((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setStudentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=null)");
        signUpForm0.setPassword("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setNickname("hi!");
        java.lang.String str5 = putRequest0.getNickname();
        putRequest0.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest0.setUsername("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        putRequest0.setStudentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str14 = putRequest0.getStudentId();
        java.lang.String str15 = putRequest0.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str14, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str15, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getStudentId();
        java.lang.String str2 = putRequest0.getNickname();
        putRequest0.setStudentId("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.example.randoop609.dto.UserDto.LoginRequest loginRequest0 = new com.example.randoop609.dto.UserDto.LoginRequest();
        java.lang.String str1 = loginRequest0.getUsername();
        java.lang.String str2 = loginRequest0.getUsername();
        java.lang.String str3 = loginRequest0.getPassword();
        java.lang.String str4 = loginRequest0.getPassword();
        java.lang.String str5 = loginRequest0.getPassword();
        java.lang.String str6 = loginRequest0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        user6.setId((java.lang.Long) 1L);
        user6.setId((java.lang.Long) 1L);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str9 = user6.getUsername();
        java.lang.String str10 = user6.getNickname();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str7 = signUpForm0.getStudentId();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str10 = signUpForm0.getRePassword();
        java.lang.String str11 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str11, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.password("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder0.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder0.studentId("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.id((java.lang.Long) 10L);
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.username("User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setUsername("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str5 = putRequest0.getNickname();
        java.lang.String str6 = putRequest0.getStudentId();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        java.lang.String str3 = userBuilder0.toString();
        java.lang.String str4 = userBuilder0.toString();
        com.example.randoop609.domain.User user5 = userBuilder0.build();
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder0.email("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder7.studentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder9.studentId("User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder11.username("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        com.example.randoop609.domain.User.UserBuilder userBuilder15 = userBuilder13.studentId("User.UserBuilder(id=0, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str3, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str4, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(userBuilder13);
        org.junit.Assert.assertNotNull(userBuilder15);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        java.lang.String str5 = user4.getNickname();
        java.lang.String str6 = user4.getEmail();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.email("");
        java.lang.String str7 = userBuilder4.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder4.id((java.lang.Long) 10L);
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder4.email("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder11.nickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder15 = userBuilder13.email("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder17 = userBuilder15.password("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)" + "'", str7, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(userBuilder13);
        org.junit.Assert.assertNotNull(userBuilder15);
        org.junit.Assert.assertNotNull(userBuilder17);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        signUpForm0.setPassword("");
        signUpForm0.setRePassword("User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
        java.lang.String str8 = signUpForm0.getRePassword();
        java.lang.String str9 = signUpForm0.getRePassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)" + "'", str8, "User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)" + "'", str9, "User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.username("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User user7 = userBuilder4.build();
        com.example.randoop609.domain.User user8 = userBuilder4.build();
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder4.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder11.email("User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null), email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(userBuilder13);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder4.email("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User user11 = userBuilder4.build();
        java.lang.String str12 = user11.getEmail();
        user11.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str12, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.studentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.Class<?> wildcardClass9 = userBuilder8.getClass();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "hi!", "", "hi!", "");
        user6.setEmail("");
        user6.setEmail("hi!");
        java.lang.String str11 = user6.getEmail();
        java.lang.String str12 = user6.getEmail();
        java.lang.String str13 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.studentId("User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null), email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        java.lang.String str4 = signUpForm0.getPassword();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.Class<?> wildcardClass7 = signUpForm0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.password("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder0.email("User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null), email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
        java.lang.String str5 = signUpForm0.getNickname();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setUsername("hi!");
        java.lang.String str11 = user6.getStudentId();
        user6.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str14 = user6.getNickname();
        java.lang.String str15 = user6.getNickname();
        java.lang.String str16 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str14, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str15, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = user5.getEmail();
        user5.setUsername("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        user5.setPassword("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = signUpForm0.getNickname();
        java.lang.String str7 = signUpForm0.getStudentId();
        java.lang.String str8 = signUpForm0.getUsername();
        com.example.randoop609.domain.User user9 = signUpForm0.toEntity();
        java.lang.String str10 = signUpForm0.getStudentId();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.username("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder8.id((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        signUpForm0.setUsername("hi!");
        signUpForm0.setUsername("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        signUpForm0.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User user10 = signUpForm0.toEntity();
        java.lang.String str11 = signUpForm0.getPassword();
        signUpForm0.setStudentId("User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.studentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.nickname("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.studentId("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.username("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.String str2 = user1.getStudentId();
        java.lang.String str3 = user1.getNickname();
        user1.setEmail("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        user1.setPassword("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        com.example.randoop609.domain.User user10 = userBuilder4.build();
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder4.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder4.username("User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userBuilder12);
        org.junit.Assert.assertNotNull(userBuilder14);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.studentId("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.id((java.lang.Long) 100L);
        java.lang.String str9 = userBuilder8.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder8.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder11.studentId("User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
        com.example.randoop609.domain.User user14 = userBuilder11.build();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str9, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(userBuilder13);
        org.junit.Assert.assertNotNull(user14);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)", "User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=0, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=, studentId=null)", "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "hi!", "hi!", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "", "");
        java.lang.String str7 = user6.getPassword();
        user6.setUsername("User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))", "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)", "hi!", "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        user6.setId((java.lang.Long) 100L);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        java.lang.String str2 = signUpForm0.getStudentId();
        signUpForm0.setPassword("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = signUpForm0.getPassword();
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        signUpForm0.setNickname("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)" + "'", str6, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(user7);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.username("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.domain.User user9 = userBuilder8.build();
        user9.setId((java.lang.Long) (-1L));
        user9.setId((java.lang.Long) 10L);
        java.lang.String str14 = user9.getStudentId();
        user9.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setNickname("hi!");
        putRequest2.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest2.setUsername("");
        java.lang.String str11 = putRequest2.getNickname();
        java.lang.String str12 = putRequest2.getNickname();
        java.lang.String str13 = putRequest2.getNickname();
        java.lang.String str14 = putRequest2.getNickname();
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder8.password("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        java.lang.String str3 = putRequest0.getUsername();
        java.lang.String str4 = putRequest0.getStudentId();
        putRequest0.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str7 = putRequest0.getStudentId();
        putRequest0.setNickname("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        java.lang.String str10 = putRequest0.getNickname();
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)" + "'", str10, "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("");
        signUpForm0.setUsername("");
        signUpForm0.setRePassword("");
        signUpForm0.setPassword("User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setPassword("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setUsername("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.domain.User user2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user3 = userService1.saveUser(user2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.domain.User.getEmail()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str9 = user6.getUsername();
        java.lang.String str10 = user6.getEmail();
        user6.setUsername("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.domain.User user8 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "", "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)", "", "");
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user9 = userService1.saveUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        java.lang.String str3 = putRequest0.getUsername();
        java.lang.String str4 = putRequest0.getStudentId();
        putRequest0.setNickname("User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
        java.lang.String str7 = putRequest0.getStudentId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder8.nickname("User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder12.nickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder14.email("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder18 = userBuilder14.nickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        java.lang.String str19 = userBuilder18.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User.UserBuilder(id=0, username=hi!, nickname=User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null), email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)" + "'", str19, "User.UserBuilder(id=0, username=hi!, nickname=User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null), email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setNickname("hi!");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest0.setUsername("");
        java.lang.String str9 = putRequest0.getNickname();
        java.lang.String str10 = putRequest0.getStudentId();
        java.lang.String str11 = putRequest0.getNickname();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)" + "'", str10, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        user9.setId((java.lang.Long) 1L);
        user9.setNickname("User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
        user9.setNickname("User.UserBuilder(id=0, username=null, nickname=, email=hi!, password=null, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        java.lang.String str2 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user3 = signUpForm0.toEntity();
        java.lang.String str4 = signUpForm0.getStudentId();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        java.lang.String str4 = signUpForm0.getUsername();
        java.lang.String str5 = signUpForm0.getNickname();
        signUpForm0.setStudentId("");
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("");
        com.example.randoop609.domain.User user3 = signUpForm0.toEntity();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(user3);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder0.password("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder0.id((java.lang.Long) 100L);
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.id((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.String str2 = signUpForm0.getPassword();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setPassword("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str6 = signUpForm0.getRePassword();
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        java.lang.String str8 = signUpForm0.getPassword();
        com.example.randoop609.domain.User user9 = signUpForm0.toEntity();
        com.example.randoop609.domain.User user10 = signUpForm0.toEntity();
        signUpForm0.setPassword("User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        java.lang.String str3 = putRequest0.getUsername();
        java.lang.String str4 = putRequest0.getStudentId();
        putRequest0.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str7 = putRequest0.getStudentId();
        putRequest0.setNickname("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        java.lang.String str10 = putRequest0.getStudentId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "User.UserBuilder(id=0, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=, studentId=null)", "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)", "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)", "User.UserBuilder(id=0, username=hi!, nickname=User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null), email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)", "User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("");
        signUpForm0.setUsername("");
        signUpForm0.setRePassword("");
        signUpForm0.setStudentId("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)", "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)", "User.UserBuilder(id=0, username=hi!, nickname=User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null), email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)", "");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder4.password("User.UserBuilder(id=0, username=null, nickname=, email=hi!, password=null, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        user4.setStudentId("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        java.lang.String str7 = user4.getUsername();
        java.lang.String str8 = user4.getUsername();
        java.lang.String str9 = user4.getUsername();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.studentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.nickname("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder8.username("User.UserBuilder(id=100, username=null, nickname=, email=null, password=null, studentId=User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        signUpForm0.setNickname("");
        signUpForm0.setStudentId("hi!");
        signUpForm0.setUsername("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str8 = signUpForm0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setUsername("");
        java.lang.String str9 = user6.getUsername();
        user6.setEmail("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        user6.setPassword("User.UserBuilder(id=100, username=null, nickname=, email=null, password=null, studentId=User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null))");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setNickname("hi!");
        user6.setUsername("hi!");
        user6.setStudentId("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        user6.setEmail("");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str3 = putRequest2.getNickname();
        putRequest2.setUsername("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str6 = putRequest2.getStudentId();
        putRequest2.setNickname("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        putRequest2.setStudentId("");
        java.lang.String str11 = putRequest2.getStudentId();
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setPassword("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setNickname("hi!");
        com.example.randoop609.domain.User user6 = signUpForm0.toEntity();
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getStudentId();
        java.lang.String str9 = response7.getNickname();
        java.lang.Long long10 = response7.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("");
        signUpForm0.setUsername("");
        signUpForm0.setRePassword("");
        signUpForm0.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str9 = signUpForm0.getRePassword();
        java.lang.String str10 = signUpForm0.getRePassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null)");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        putRequest2.setNickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        putRequest2.setUsername("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        java.lang.String str9 = putRequest2.getUsername();
        java.lang.String str10 = putRequest2.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)" + "'", str9, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)" + "'", str10, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str9 = user6.getStudentId();
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.getEmail();
        user6.setId((java.lang.Long) 0L);
        user6.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null), email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null))");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.username("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User user7 = userBuilder4.build();
        com.example.randoop609.domain.User user8 = userBuilder4.build();
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        user9.setPassword("User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null), email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user9);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str9 = user6.getStudentId();
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.getEmail();
        java.lang.String str12 = user6.getStudentId();
        com.example.randoop609.dto.UserDto.Response response13 = new com.example.randoop609.dto.UserDto.Response(user6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        java.lang.String str3 = userBuilder0.toString();
        java.lang.String str4 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder0.username("");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)" + "'", str3, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)" + "'", str4, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder6);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.email("");
        java.lang.String str7 = userBuilder4.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder4.id((java.lang.Long) 10L);
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder4.email("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder11.nickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder15 = userBuilder13.email("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder17 = userBuilder13.password("User.UserBuilder(id=100, username=null, nickname=, email=null, password=null, studentId=User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null))");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)" + "'", str7, "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(userBuilder13);
        org.junit.Assert.assertNotNull(userBuilder15);
        org.junit.Assert.assertNotNull(userBuilder17);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "", "hi!", "", "hi!", "");
        com.example.randoop609.dto.UserDto.Response response7 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str8 = response7.getStudentId();
        java.lang.String str9 = response7.getUsername();
        java.lang.String str10 = response7.getUsername();
        java.lang.String str11 = response7.getUsername();
        java.lang.String str12 = response7.getNickname();
        java.lang.String str13 = response7.getNickname();
        java.lang.String str14 = response7.getStudentId();
        java.lang.String str15 = response7.getStudentId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("");
        signUpForm0.setStudentId("hi!");
        signUpForm0.setNickname("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        java.lang.String str5 = user4.getPassword();
        java.lang.String str6 = user4.getUsername();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        java.lang.String str3 = putRequest0.getNickname();
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest0.setStudentId("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        putRequest0.setUsername("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        putRequest0.setUsername("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)");
        putRequest0.setNickname("User.UserBuilder(id=0, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=, studentId=null)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = user5.getEmail();
        java.lang.String str7 = user5.getStudentId();
        com.example.randoop609.dto.UserDto.Response response8 = new com.example.randoop609.dto.UserDto.Response(user5);
        java.lang.String str9 = user5.getUsername();
        java.lang.Long long10 = user5.getId();
        java.lang.String str11 = user5.getPassword();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder4.id((java.lang.Long) 1L);
        java.lang.String str11 = userBuilder10.toString();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str11, "User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getUsername();
        putRequest0.setUsername("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str4 = putRequest0.getStudentId();
        putRequest0.setStudentId("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        putRequest0.setNickname("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        signUpForm0.setUsername("hi!");
        signUpForm0.setUsername("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        signUpForm0.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User user10 = signUpForm0.toEntity();
        signUpForm0.setPassword("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setStudentId("");
        java.lang.String str7 = putRequest2.getUsername();
        putRequest2.setStudentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str10 = putRequest2.getStudentId();
        java.lang.String str11 = putRequest2.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str10, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str1 = signUpForm0.getRePassword();
        signUpForm0.setNickname("");
        signUpForm0.setStudentId("hi!");
        signUpForm0.setPassword("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        signUpForm0.setNickname("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        signUpForm0.setStudentId("User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
        signUpForm0.setRePassword("User.UserBuilder(id=0, username=null, nickname=, email=hi!, password=null, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        java.lang.String str10 = signUpForm0.getPassword();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = signUpForm0.getNickname();
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        com.example.randoop609.domain.User user8 = signUpForm0.toEntity();
        user8.setUsername("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(user8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setNickname("hi!");
        java.lang.String str11 = user6.getEmail();
        user6.setPassword("User.UserBuilder(id=0, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=, studentId=null)");
        user6.setEmail("User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        user6.setStudentId("User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("");
        signUpForm0.setUsername("");
        signUpForm0.setRePassword("");
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getNickname();
        putRequest0.setUsername("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str4 = putRequest0.getStudentId();
        putRequest0.setNickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.String str2 = signUpForm0.getPassword();
        java.lang.String str3 = signUpForm0.getRePassword();
        java.lang.String str4 = signUpForm0.getPassword();
        java.lang.String str5 = signUpForm0.getRePassword();
        java.lang.String str6 = signUpForm0.getStudentId();
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        java.lang.String str3 = putRequest0.getUsername();
        putRequest0.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str6 = putRequest0.getUsername();
        java.lang.String str7 = putRequest0.getNickname();
        java.lang.String str8 = putRequest0.getStudentId();
        putRequest0.setStudentId("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str11 = putRequest0.getStudentId();
        putRequest0.setNickname("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str7, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)" + "'", str11, "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.username("");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.email("");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.username("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder2.id((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        java.lang.String str3 = putRequest0.getUsername();
        putRequest0.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        putRequest0.setNickname("");
        java.lang.String str8 = putRequest0.getStudentId();
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.domain.User user8 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "hi!", "hi!", "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)", "", "");
        com.example.randoop609.dto.UserDto.Response response9 = new com.example.randoop609.dto.UserDto.Response(user8);
        // The following exception was thrown during execution in test generation
        try {
            com.example.randoop609.domain.User user10 = userService1.saveUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.id((java.lang.Long) (-1L));
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.studentId("User.UserBuilder(id=null, username=null, nickname=, email=hi!, password=User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null), studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setUsername("");
        user6.setEmail("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        user6.setEmail("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        java.lang.String str13 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        java.lang.String str3 = userBuilder0.toString();
        java.lang.String str4 = userBuilder0.toString();
        com.example.randoop609.domain.User user5 = userBuilder0.build();
        com.example.randoop609.domain.User.UserBuilder userBuilder7 = userBuilder0.email("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder9 = userBuilder7.studentId("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder11 = userBuilder9.username("User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder13 = userBuilder11.studentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str3, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)" + "'", str4, "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(userBuilder7);
        org.junit.Assert.assertNotNull(userBuilder9);
        org.junit.Assert.assertNotNull(userBuilder11);
        org.junit.Assert.assertNotNull(userBuilder13);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        user9.setEmail("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        user9.setEmail("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str14 = user9.getPassword();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)", "", "User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        user6.setNickname("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        user6.setId((java.lang.Long) 10L);
        user6.setNickname("");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setRePassword("");
        signUpForm0.setUsername("");
        java.lang.String str5 = signUpForm0.getRePassword();
        java.lang.String str6 = signUpForm0.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("hi!");
        java.lang.String str2 = authResponse1.getToken();
        java.lang.String str3 = authResponse1.getToken();
        java.lang.String str4 = authResponse1.getToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str2 = authResponse1.getToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)" + "'", str2, "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.email("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder6.studentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder6.username("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder6.nickname("");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(userBuilder12);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.studentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.username("User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.password("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        com.example.randoop609.domain.User user10 = userBuilder4.build();
        user10.setUsername("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setUsername("hi!");
        user6.setNickname("User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
        user6.setStudentId("");
        user6.setNickname("");
        java.lang.String str17 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setNickname("hi!");
        user6.setNickname("");
        user6.setStudentId("");
        user6.setId((java.lang.Long) 1L);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setStudentId("");
        java.lang.String str7 = putRequest2.getUsername();
        putRequest2.setUsername("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str10 = putRequest2.getStudentId();
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = signUpForm0.getNickname();
        signUpForm0.setPassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str9 = signUpForm0.getNickname();
        signUpForm0.setNickname("");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getNickname();
        putRequest0.setNickname("");
        putRequest0.setStudentId("User.UserBuilder(id=1, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.studentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.password("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder8.email("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder8.username("User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder8.id((java.lang.Long) 1L);
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.username("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User user7 = userBuilder4.build();
        com.example.randoop609.domain.User user8 = userBuilder4.build();
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        user9.setUsername("User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null)");
        com.example.randoop609.dto.UserDto.Response response12 = new com.example.randoop609.dto.UserDto.Response(user9);
        java.lang.Long long13 = response12.getId();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setUsername("hi!");
        user6.setNickname("User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
        user6.setStudentId("");
        user6.setUsername("User.UserBuilder(id=100, username=null, nickname=, email=null, password=null, studentId=User.UserBuilder(id=10, username=null, nickname=, email=, password=, studentId=null))");
        java.lang.String str17 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 1L, "hi!", "User.UserBuilder(id=null, username=null, nickname=, email=hi!, password=User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null), studentId=null)", "User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)", "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        java.lang.String str3 = userBuilder0.toString();
        com.example.randoop609.domain.User.UserBuilder userBuilder5 = userBuilder0.username("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)" + "'", str3, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder5);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        java.lang.String str4 = signUpForm0.getUsername();
        java.lang.String str5 = signUpForm0.getNickname();
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 10L, "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), studentId=null)", "User.UserBuilder(id=null, username=null, nickname=, email=hi!, password=User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null), studentId=null)", "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)", "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)", "");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.String str2 = signUpForm0.getPassword();
        java.lang.String str3 = signUpForm0.getRePassword();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), email=, password=null, studentId=null), nickname=, email=hi!, password=null, studentId=null)");
        signUpForm0.setRePassword("User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        putRequest0.setNickname("hi!");
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest0.setUsername("");
        java.lang.String str9 = putRequest0.getNickname();
        putRequest0.setNickname("User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        putRequest0.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setPassword("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setNickname("hi!");
        java.lang.String str6 = signUpForm0.getUsername();
        signUpForm0.setPassword("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.studentId("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder4.nickname("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder4.email("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User user11 = userBuilder4.build();
        java.lang.String str12 = user11.getNickname();
        user11.setEmail("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(userBuilder8);
        org.junit.Assert.assertNotNull(userBuilder10);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) 0L, "User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)", "User.UserBuilder(id=null, username=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), nickname=, email=null, password=null, studentId=null)", "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)", "User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)", "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str7 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)" + "'", str7, "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setNickname("hi!");
        putRequest2.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        putRequest2.setUsername("");
        putRequest2.setUsername("");
        java.lang.String str13 = putRequest2.getNickname();
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        java.lang.String str3 = putRequest0.getNickname();
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str6 = putRequest0.getUsername();
        java.lang.String str7 = putRequest0.getUsername();
        putRequest0.setUsername("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        java.lang.String str10 = putRequest0.getUsername();
        java.lang.String str11 = putRequest0.getNickname();
        putRequest0.setStudentId("User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)" + "'", str10, "User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setUsername("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        com.example.randoop609.domain.User user4 = signUpForm0.toEntity();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User user7 = signUpForm0.toEntity();
        java.lang.String str8 = signUpForm0.getPassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.Class<?> wildcardClass6 = user5.getClass();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setPassword("hi!");
        java.lang.String str3 = signUpForm0.getNickname();
        signUpForm0.setNickname("hi!");
        com.example.randoop609.domain.User user6 = signUpForm0.toEntity();
        user6.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        user6.setNickname("User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
        user6.setPassword("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.dto.UserDto.Response response13 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str14 = response13.getNickname();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)" + "'", str14, "User.UserBuilder(id=0, username=, nickname=, email=, password=null, studentId=null)");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest2.setStudentId("");
        putRequest2.setStudentId("");
        java.lang.String str7 = putRequest2.getUsername();
        putRequest2.setUsername("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str10 = putRequest2.getStudentId();
        putRequest2.setStudentId("User.UserBuilder(id=0, username=null, nickname=, email=hi!, password=null, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))");
        putRequest2.setStudentId("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder4.username("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User user7 = userBuilder4.build();
        com.example.randoop609.domain.User user8 = userBuilder4.build();
        com.example.randoop609.domain.User user9 = userBuilder4.build();
        user9.setStudentId("hi!");
        com.example.randoop609.dto.UserDto.Response response12 = new com.example.randoop609.dto.UserDto.Response(user9);
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(userBuilder6);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user9);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        java.lang.String str3 = putRequest0.getUsername();
        java.lang.String str4 = putRequest0.getStudentId();
        putRequest0.setNickname("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str7 = putRequest0.getStudentId();
        putRequest0.setNickname("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        java.lang.String str10 = putRequest0.getNickname();
        java.lang.Class<?> wildcardClass11 = putRequest0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)" + "'", str10, "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        signUpForm0.setStudentId("hi!");
        com.example.randoop609.domain.User user5 = signUpForm0.toEntity();
        java.lang.String str6 = signUpForm0.getNickname();
        signUpForm0.setPassword("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str9 = signUpForm0.getNickname();
        java.lang.String str10 = signUpForm0.getPassword();
        java.lang.String str11 = signUpForm0.getStudentId();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)" + "'", str10, "User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        java.lang.String str4 = signUpForm0.getUsername();
        java.lang.String str5 = signUpForm0.getNickname();
        signUpForm0.setStudentId("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.example.randoop609.dto.UserDto.AuthResponse authResponse1 = new com.example.randoop609.dto.UserDto.AuthResponse("User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
        java.lang.String str2 = authResponse1.getToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)" + "'", str2, "User.UserBuilder(id=-1, username=null, nickname=, email=null, password=User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null), studentId=hi!)");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.nickname("");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User user5 = userBuilder4.build();
        java.lang.String str6 = user5.getPassword();
        org.junit.Assert.assertNotNull(userBuilder0);
        org.junit.Assert.assertNotNull(userBuilder2);
        org.junit.Assert.assertNotNull(userBuilder4);
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setId((java.lang.Long) 10L);
        java.lang.String str9 = user6.getStudentId();
        user6.setNickname("hi!");
        user6.setUsername("User.UserBuilder(id=0, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=, studentId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.username("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.username("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder10.username("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder10.email("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder18 = userBuilder16.password("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder20 = userBuilder16.studentId("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
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
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.example.randoop609.domain.User.UserBuilder userBuilder0 = com.example.randoop609.domain.User.builder();
        com.example.randoop609.domain.User.UserBuilder userBuilder2 = userBuilder0.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder4 = userBuilder2.username("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder6 = userBuilder2.password("hi!");
        com.example.randoop609.domain.User.UserBuilder userBuilder8 = userBuilder2.username("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder10 = userBuilder2.username("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        com.example.randoop609.domain.User.UserBuilder userBuilder12 = userBuilder10.id((java.lang.Long) 0L);
        com.example.randoop609.domain.User.UserBuilder userBuilder14 = userBuilder10.username("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder16 = userBuilder10.email("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        com.example.randoop609.domain.User.UserBuilder userBuilder18 = userBuilder10.nickname("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
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
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.String str2 = signUpForm0.getRePassword();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setPassword("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        user6.setNickname("");
        java.lang.String str13 = user6.getUsername();
        com.example.randoop609.dto.UserDto.Response response14 = new com.example.randoop609.dto.UserDto.Response(user6);
        java.lang.String str15 = response14.getStudentId();
        java.lang.String str16 = response14.getUsername();
        java.lang.String str17 = response14.getStudentId();
        java.lang.String str18 = response14.getUsername();
        java.lang.String str19 = response14.getUsername();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "", "hi!", "", "hi!", "hi!");
        user6.setPassword("hi!");
        user6.setNickname("hi!");
        java.lang.String str11 = user6.getEmail();
        user6.setPassword("User.UserBuilder(id=0, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=, studentId=null)");
        user6.setEmail("User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        user6.setEmail("User.UserBuilder(id=null, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        com.example.randoop609.domain.User user1 = signUpForm0.toEntity();
        java.lang.String str2 = signUpForm0.getRePassword();
        java.lang.String str3 = signUpForm0.getUsername();
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str1 = putRequest0.getNickname();
        putRequest0.setUsername("User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str4 = putRequest0.getStudentId();
        putRequest0.setNickname("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str7 = putRequest0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.example.randoop609.domain.User user6 = new com.example.randoop609.domain.User((java.lang.Long) (-1L), "User.UserBuilder(id=null, username=hi!, nickname=null, email=null, password=hi!, studentId=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!))", "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)", "hi!", "User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null)", "User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null)");
        user6.setPassword("User.UserBuilder(id=0, username=hi!, nickname=User.UserBuilder(id=0, username=null, nickname=, email=, password=null, studentId=null), email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.example.randoop609.repository.UserRepository userRepository0 = null;
        com.example.randoop609.service.UserService userService1 = new com.example.randoop609.service.UserService(userRepository0);
        com.example.randoop609.dto.UserDto.PutRequest putRequest2 = new com.example.randoop609.dto.UserDto.PutRequest();
        java.lang.String str3 = putRequest2.getUsername();
        putRequest2.setUsername("User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=hi!)");
        java.lang.String str6 = putRequest2.getStudentId();
        putRequest2.setStudentId("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userService1.editUser(putRequest2, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.repository.UserRepository.findById(Object)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.example.randoop609.dto.UserDto.PutRequest putRequest0 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest0.setStudentId("");
        java.lang.String str3 = putRequest0.getNickname();
        putRequest0.setStudentId("User.UserBuilder(id=null, username=null, nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str6 = putRequest0.getUsername();
        java.lang.String str7 = putRequest0.getUsername();
        putRequest0.setUsername("User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        java.lang.String str10 = putRequest0.getUsername();
        java.lang.String str11 = putRequest0.getUsername();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)" + "'", str10, "User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)" + "'", str11, "User.UserBuilder(id=10, username=null, nickname=null, email=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null), password=hi!, studentId=null)");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm0 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm0.setStudentId("hi!");
        java.lang.String str3 = signUpForm0.getStudentId();
        java.lang.String str4 = signUpForm0.getPassword();
        signUpForm0.setNickname("User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null)");
        signUpForm0.setRePassword("");
        signUpForm0.setNickname("User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        java.lang.String str11 = signUpForm0.getNickname();
        signUpForm0.setUsername("User.UserBuilder(id=null, username=null, nickname=User.UserBuilder(id=null, username=null, nickname=hi!, email=null, password=null, studentId=null), email=null, password=null, studentId=User.UserBuilder(id=null, username=null, nickname=, email=null, password=null, studentId=null))");
        java.lang.String str14 = signUpForm0.getStudentId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)" + "'", str11, "User.UserBuilder(id=null, username=User.UserBuilder(id=100, username=null, nickname=hi!, email=null, password=null, studentId=hi!), nickname=null, email=null, password=hi!, studentId=null)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }
}

