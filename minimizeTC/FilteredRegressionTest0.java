import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
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
        }
    }
}
