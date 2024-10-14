@Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        java.lang.String str6 = putRequest1.getStudentId();
        java.lang.String str7 = putRequest1.getStudentId();
        java.lang.Class<?> wildcardClass8 = putRequest1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
@Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        java.lang.String str6 = putRequest1.getStudentId();
        java.lang.Class<?> wildcardClass7 = putRequest1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
@Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        java.lang.String str8 = putRequest1.getNickname();
        java.lang.Class<?> wildcardClass9 = putRequest1.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
@Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest6 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest6.setUsername("hi!");
        java.lang.String str9 = putRequest6.getNickname();
        java.lang.String str10 = putRequest6.getNickname();
        java.lang.String str11 = putRequest6.getUsername();
        java.lang.String str12 = putRequest6.getStudentId();
        userService0.editUser(putRequest6, (java.lang.Long) 0L);
        com.example.randoop609.domain.User user16 = userService0.getUser((java.lang.Long) 10L);
        com.example.randoop609.dto.UserDto.Response response17 = new com.example.randoop609.dto.UserDto.Response(user16);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(user16);
    }
@Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.domain.User user7 = userService0.getUser((java.lang.Long) 100L);
        com.example.randoop609.domain.User user9 = userService0.getUser((java.lang.Long) 10L);
        user9.setNickname("");
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(user9);
    }
@Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        java.lang.String str6 = putRequest1.getStudentId();
        java.lang.String str7 = putRequest1.getStudentId();
        putRequest1.setNickname("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=null, studentId=null)");
        putRequest1.setNickname("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=hi!, studentId=)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }
@Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        java.lang.String str4 = putRequest1.getNickname();
        java.lang.String str5 = putRequest1.getUsername();
        userService0.editUser(putRequest1, (java.lang.Long) 100L);
        com.example.randoop609.domain.User user9 = userService0.getUser((java.lang.Long) 100L);
        java.lang.String str10 = user9.getStudentId();
        java.lang.String str11 = user9.getPassword();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1234" + "'", str11, "1234");
    }
@Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        java.lang.String str6 = putRequest1.getStudentId();
        java.lang.String str7 = putRequest1.getStudentId();
        putRequest1.setNickname("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=null, studentId=null)");
        java.lang.String str10 = putRequest1.getStudentId();
        putRequest1.setNickname("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=hi!, studentId=)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }
@Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        java.lang.String str4 = putRequest1.getNickname();
        java.lang.String str5 = putRequest1.getStudentId();
        userService0.editUser(putRequest1, (java.lang.Long) 0L);
        com.example.randoop609.domain.User user9 = userService0.getUser((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(user9);
    }
@Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        java.lang.String str6 = putRequest1.getNickname();
        putRequest1.setUsername("test");
        org.junit.Assert.assertNull(str6);
    }
@Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        putRequest1.setStudentId("User.UserBuilder(id=-1, username=null, nickname=null, password=, studentId=null)");
        java.lang.String str10 = putRequest1.getStudentId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=-1, username=null, nickname=null, password=, studentId=null)" + "'", str10, "User.UserBuilder(id=-1, username=null, nickname=null, password=, studentId=null)");
    }
@Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        java.lang.String str6 = putRequest1.getStudentId();
        java.lang.String str7 = putRequest1.getStudentId();
        putRequest1.setNickname("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=null, studentId=null)");
        java.lang.String str10 = putRequest1.getStudentId();
        putRequest1.setUsername("1234");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }
@Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.domain.User user7 = userService0.getUser((java.lang.Long) 100L);
        com.example.randoop609.domain.User user9 = userService0.getUser((java.lang.Long) 0L);
        user9.setPassword("hi!");
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(user9);
    }
@Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.domain.User user7 = userService0.getUser((java.lang.Long) (-1L));
        com.example.randoop609.dto.UserDto.PutRequest putRequest8 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest8.setUsername("hi!");
        java.lang.String str11 = putRequest8.getNickname();
        java.lang.String str12 = putRequest8.getNickname();
        userService0.editUser(putRequest8, (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass15 = userService0.getClass();
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
@Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        java.lang.String str6 = putRequest1.getStudentId();
        java.lang.String str7 = putRequest1.getStudentId();
        putRequest1.setNickname("User.UserBuilder(id=1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), studentId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }
@Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest6 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest6.setUsername("hi!");
        java.lang.String str9 = putRequest6.getNickname();
        java.lang.String str10 = putRequest6.getNickname();
        java.lang.String str11 = putRequest6.getUsername();
        java.lang.String str12 = putRequest6.getStudentId();
        userService0.editUser(putRequest6, (java.lang.Long) 0L);
        com.example.randoop609.domain.User user16 = userService0.getUser((java.lang.Long) 1L);
        user16.setUsername("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), studentId=null)");
        java.lang.String str19 = user16.getUsername();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), studentId=null)" + "'", str19, "User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), studentId=null)");
    }
@Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        java.lang.String str8 = putRequest1.getNickname();
        java.lang.String str9 = putRequest1.getStudentId();
        java.lang.String str10 = putRequest1.getNickname();
        putRequest1.setStudentId("User.UserBuilder(id=1, username=hi!, nickname=hi!, password=, studentId=User.UserBuilder(id=-1, username=, nickname=User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=null, studentId=null), password=hi!, studentId=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)))");
        putRequest1.setNickname("User.UserBuilder(id=1, username=hi!, nickname=hi!, password=hi!, studentId=)");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }
@Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=null, password=, studentId=null)");
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)");
        java.lang.Class<?> wildcardClass10 = putRequest1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
@Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        java.lang.String str4 = putRequest1.getNickname();
        java.lang.String str5 = putRequest1.getUsername();
        userService0.editUser(putRequest1, (java.lang.Long) 100L);
        com.example.randoop609.domain.User user9 = userService0.getUser((java.lang.Long) 10L);
        com.example.randoop609.service.UserService userService10 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest11 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest11.setUsername("hi!");
        userService10.editUser(putRequest11, (java.lang.Long) 1L);
        java.lang.String str16 = putRequest11.getStudentId();
        java.lang.String str17 = putRequest11.getStudentId();
        putRequest11.setNickname("");
        userService0.editUser(putRequest11, (java.lang.Long) 1L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }
@Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.domain.User user2 = userService0.getUser((java.lang.Long) 0L);
        com.example.randoop609.service.UserService userService3 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest4 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest4.setUsername("hi!");
        userService3.editUser(putRequest4, (java.lang.Long) 1L);
        java.lang.String str9 = putRequest4.getNickname();
        java.lang.String str10 = putRequest4.getNickname();
        java.lang.String str11 = putRequest4.getNickname();
        java.lang.String str12 = putRequest4.getNickname();
        putRequest4.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        userService0.editUser(putRequest4, (java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }
@Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        java.lang.String str4 = putRequest1.getNickname();
        java.lang.String str5 = putRequest1.getStudentId();
        userService0.editUser(putRequest1, (java.lang.Long) 0L);
        com.example.randoop609.service.UserService userService8 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest9 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest9.setUsername("hi!");
        userService8.editUser(putRequest9, (java.lang.Long) 1L);
        putRequest9.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        java.lang.String str16 = putRequest9.getNickname();
        java.lang.String str17 = putRequest9.getStudentId();
        java.lang.String str18 = putRequest9.getNickname();
        userService0.editUser(putRequest9, (java.lang.Long) 1L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest21 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest21.setNickname("");
        userService0.editUser(putRequest21, (java.lang.Long) 0L);
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm26 = new com.example.randoop609.dto.UserDto.SignUpForm();
        java.lang.String str27 = signUpForm26.getUsername();
        signUpForm26.setPassword("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=hi!, studentId=)");
        // The following exception was thrown during execution in test generation
        try {
            userService0.saveUser(signUpForm26);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: ???????????? ????????? ??????????.");
        }
@Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.domain.User user7 = userService0.getUser((java.lang.Long) 100L);
        java.lang.String str8 = user7.getPassword();
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1234" + "'", str8, "1234");
    }
@Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.domain.User user7 = userService0.getUser((java.lang.Long) 100L);
        java.lang.String str8 = user7.getStudentId();
        java.lang.String str9 = user7.getNickname();
        user7.setNickname("User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)");
        user7.setStudentId("");
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
    }
@Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        java.lang.String str4 = putRequest1.getNickname();
        java.lang.String str5 = putRequest1.getStudentId();
        userService0.editUser(putRequest1, (java.lang.Long) 0L);
        com.example.randoop609.service.UserService userService8 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest9 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest9.setUsername("hi!");
        userService8.editUser(putRequest9, (java.lang.Long) 1L);
        putRequest9.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        java.lang.String str16 = putRequest9.getNickname();
        java.lang.String str17 = putRequest9.getStudentId();
        java.lang.String str18 = putRequest9.getNickname();
        userService0.editUser(putRequest9, (java.lang.Long) 1L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest21 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest21.setNickname("");
        userService0.editUser(putRequest21, (java.lang.Long) 0L);
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm26 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm26.setNickname("");
        signUpForm26.setNickname("");
        signUpForm26.setUsername("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=hi!, studentId=)");
        signUpForm26.setPassword("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), studentId=null)");
        // The following exception was thrown during execution in test generation
        try {
            userService0.saveUser(signUpForm26);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: ???????????? ????????? ??????????.");
        }
@Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest6 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest6.setUsername("hi!");
        java.lang.String str9 = putRequest6.getNickname();
        java.lang.String str10 = putRequest6.getNickname();
        java.lang.String str11 = putRequest6.getUsername();
        java.lang.String str12 = putRequest6.getStudentId();
        userService0.editUser(putRequest6, (java.lang.Long) 0L);
        com.example.randoop609.domain.User user16 = userService0.getUser((java.lang.Long) 1L);
        user16.setUsername("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), studentId=null)");
        user16.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(user16);
    }
@Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        java.lang.String str8 = putRequest1.getNickname();
        java.lang.String str9 = putRequest1.getUsername();
        putRequest1.setStudentId("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=hi!, studentId=)");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)" + "'", str9, "User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
    }
@Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        java.lang.String str4 = putRequest1.getNickname();
        java.lang.String str5 = putRequest1.getStudentId();
        userService0.editUser(putRequest1, (java.lang.Long) 0L);
        putRequest1.setStudentId("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null), nickname=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }
@Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        java.lang.String str4 = putRequest1.getNickname();
        java.lang.String str5 = putRequest1.getStudentId();
        userService0.editUser(putRequest1, (java.lang.Long) 0L);
        com.example.randoop609.service.UserService userService8 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest9 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest9.setUsername("hi!");
        userService8.editUser(putRequest9, (java.lang.Long) 1L);
        putRequest9.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        java.lang.String str16 = putRequest9.getNickname();
        java.lang.String str17 = putRequest9.getStudentId();
        java.lang.String str18 = putRequest9.getNickname();
        userService0.editUser(putRequest9, (java.lang.Long) 1L);
        com.example.randoop609.service.UserService userService21 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest22 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest22.setUsername("hi!");
        userService21.editUser(putRequest22, (java.lang.Long) 1L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest27 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest27.setNickname("");
        java.lang.String str30 = putRequest27.getUsername();
        userService21.editUser(putRequest27, (java.lang.Long) 10L);
        java.lang.String str33 = putRequest27.getUsername();
        userService0.editUser(putRequest27, (java.lang.Long) (-1L));
        com.example.randoop609.service.UserService userService36 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest37 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest37.setUsername("hi!");
        userService36.editUser(putRequest37, (java.lang.Long) 1L);
        java.lang.String str42 = putRequest37.getStudentId();
        java.lang.String str43 = putRequest37.getStudentId();
        putRequest37.setStudentId("User.UserBuilder(id=-1, username=null, nickname=null, password=, studentId=null)");
        userService0.editUser(putRequest37, (java.lang.Long) (-1L));
        com.example.randoop609.domain.User user49 = userService0.getUser((java.lang.Long) 10L);
        user49.setUsername("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null), studentId=null)");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(user49);
    }
@Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        java.lang.String str6 = putRequest1.getStudentId();
        java.lang.String str7 = putRequest1.getStudentId();
        putRequest1.setStudentId("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=hi!, studentId=), nickname=hi!, password=hi!, studentId=)");
        putRequest1.setStudentId("1234");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }
@Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        putRequest1.setNickname("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null), nickname=hi!, password=null, studentId=null)");
        java.lang.String str10 = putRequest1.getUsername();
        java.lang.String str11 = putRequest1.getStudentId();
        putRequest1.setStudentId("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null), studentId=null)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)" + "'", str10, "User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNull(str11);
    }
@Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.domain.User user7 = userService0.getUser((java.lang.Long) 100L);
        com.example.randoop609.domain.User user9 = userService0.getUser((java.lang.Long) 10L);
        java.lang.String str10 = user9.getUsername();
        java.lang.String str11 = user9.getPassword();
        user9.setPassword("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=, studentId=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1234" + "'", str11, "1234");
    }
@Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.dto.UserDto.PutRequest putRequest6 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest6.setNickname("");
        java.lang.String str9 = putRequest6.getUsername();
        userService0.editUser(putRequest6, (java.lang.Long) 10L);
        com.example.randoop609.dto.UserDto.SignUpForm signUpForm12 = new com.example.randoop609.dto.UserDto.SignUpForm();
        signUpForm12.setUsername("");
        signUpForm12.setStudentId("hi!");
        java.lang.String str17 = signUpForm12.getStudentId();
        signUpForm12.setPassword("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        java.lang.String str20 = signUpForm12.getUsername();
        java.lang.String str21 = signUpForm12.getNickname();
        signUpForm12.setRePassword("");
        // The following exception was thrown during execution in test generation
        try {
            userService0.saveUser(signUpForm12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: ???????????? ????????? ??????????.");
        }
@Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        java.lang.String str8 = putRequest1.getNickname();
        java.lang.String str9 = putRequest1.getStudentId();
        java.lang.String str10 = putRequest1.getNickname();
        putRequest1.setStudentId("User.UserBuilder(id=1, username=hi!, nickname=hi!, password=, studentId=User.UserBuilder(id=-1, username=, nickname=User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=null, studentId=null), password=hi!, studentId=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)))");
        java.lang.String str13 = putRequest1.getStudentId();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User.UserBuilder(id=1, username=hi!, nickname=hi!, password=, studentId=User.UserBuilder(id=-1, username=, nickname=User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=null, studentId=null), password=hi!, studentId=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)))" + "'", str13, "User.UserBuilder(id=1, username=hi!, nickname=hi!, password=, studentId=User.UserBuilder(id=-1, username=, nickname=User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=null, studentId=null), password=hi!, studentId=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)))");
    }
@Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.domain.User user7 = userService0.getUser((java.lang.Long) 100L);
        java.lang.String str8 = user7.getStudentId();
        java.lang.String str9 = user7.getNickname();
        user7.setNickname("User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)");
        java.lang.String str12 = user7.getUsername();
        java.lang.String str13 = user7.getStudentId();
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }
@Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.domain.User user7 = userService0.getUser((java.lang.Long) 100L);
        com.example.randoop609.domain.User user9 = userService0.getUser((java.lang.Long) 0L);
        user9.setUsername("User.UserBuilder(id=1, username=hi!, nickname=hi!, password=, studentId=User.UserBuilder(id=-1, username=, nickname=User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=null, studentId=null), password=hi!, studentId=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)))");
        user9.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(user9);
    }
@Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = null;
        // The following exception was thrown during execution in test generation
        try {
            userService0.editUser(putRequest1, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.randoop609.dto.UserDto$PutRequest.getNickname()\" because \"dto\" is null");
        }
@Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.domain.User user7 = userService0.getUser((java.lang.Long) (-1L));
        user7.setStudentId("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=null, studentId=null)");
        user7.setStudentId("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        org.junit.Assert.assertNotNull(user7);
    }
@Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.domain.User user2 = userService0.getUser((java.lang.Long) 0L);
        user2.setStudentId("User.UserBuilder(id=1, username=User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=null, studentId=null), nickname=, password=hi!, studentId=User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(user2);
    }
@Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        java.lang.String str8 = putRequest1.getNickname();
        java.lang.String str9 = putRequest1.getStudentId();
        java.lang.String str10 = putRequest1.getNickname();
        putRequest1.setStudentId("User.UserBuilder(id=1, username=hi!, nickname=hi!, password=, studentId=User.UserBuilder(id=-1, username=, nickname=User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=null, studentId=null), password=hi!, studentId=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)))");
        putRequest1.setNickname("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=hi!, studentId=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null))");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }
@Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        java.lang.String str8 = putRequest1.getNickname();
        java.lang.String str9 = putRequest1.getUsername();
        putRequest1.setStudentId("User.UserBuilder(id=-1, username=null, nickname=User.UserBuilder(id=1, username=hi!, nickname=hi!, password=hi!, studentId=), password=User.UserBuilder(id=1, username=hi!, nickname=hi!, password=, studentId=), studentId=null)");
        putRequest1.setStudentId("User.UserBuilder(id=1, username=, nickname=hi!, password=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), studentId=null)");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)" + "'", str9, "User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
    }
@Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        java.lang.String str6 = putRequest1.getNickname();
        java.lang.String str7 = putRequest1.getNickname();
        putRequest1.setNickname("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null), studentId=null)");
        putRequest1.setStudentId("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null), nickname=hi!, password=null, studentId=null)");
        java.lang.Class<?> wildcardClass12 = putRequest1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
@Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        java.lang.String str8 = putRequest1.getNickname();
        java.lang.String str9 = putRequest1.getStudentId();
        java.lang.String str10 = putRequest1.getUsername();
        putRequest1.setNickname("User.UserBuilder(id=1, username=hi!, nickname=hi!, password=User.UserBuilder(id=-1, username=null, nickname=null, password=, studentId=null), studentId=)");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)" + "'", str10, "User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
    }
@Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        java.lang.String str4 = putRequest1.getNickname();
        java.lang.String str5 = putRequest1.getStudentId();
        userService0.editUser(putRequest1, (java.lang.Long) 0L);
        com.example.randoop609.domain.User user9 = userService0.getUser((java.lang.Long) (-1L));
        user9.setUsername("User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)");
        java.lang.String str12 = user9.getStudentId();
        user9.setPassword("User.UserBuilder(id=-1, username=null, nickname=null, password=, studentId=null)");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNull(str12);
    }
@Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=null, password=, studentId=null)");
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)");
        putRequest1.setNickname("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=hi!, studentId=)");
        java.lang.String str12 = putRequest1.getUsername();
        putRequest1.setStudentId("User.UserBuilder(id=-1, username=, nickname=User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=null, studentId=null), password=hi!, studentId=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null))");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)" + "'", str12, "User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)");
    }
@Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        java.lang.String str8 = putRequest1.getNickname();
        java.lang.String str9 = putRequest1.getUsername();
        java.lang.String str10 = putRequest1.getUsername();
        putRequest1.setStudentId("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null), studentId=null)");
        java.lang.String str13 = putRequest1.getStudentId();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)" + "'", str9, "User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)" + "'", str10, "User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null), studentId=null)" + "'", str13, "User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null), studentId=null)");
    }
@Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        java.lang.String str6 = putRequest1.getStudentId();
        putRequest1.setStudentId("User.UserBuilder(id=1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), studentId=null)");
        java.lang.String str9 = putRequest1.getUsername();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }
@Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.service.UserService userService6 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest7 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest7.setUsername("hi!");
        userService6.editUser(putRequest7, (java.lang.Long) 1L);
        java.lang.String str12 = putRequest7.getNickname();
        userService0.editUser(putRequest7, (java.lang.Long) 1L);
        com.example.randoop609.domain.User user16 = userService0.getUser((java.lang.Long) (-1L));
        user16.setUsername("User.UserBuilder(id=1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=, password=hi!, studentId=)");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(user16);
    }
@Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.domain.User user7 = userService0.getUser((java.lang.Long) 100L);
        java.lang.String str8 = user7.getStudentId();
        java.lang.String str9 = user7.getNickname();
        user7.setNickname("User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)");
        java.lang.String str12 = user7.getUsername();
        java.lang.Long long13 = user7.getId();
        user7.setPassword("");
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(long13);
    }
@Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        java.lang.String str6 = putRequest1.getStudentId();
        java.lang.String str7 = putRequest1.getStudentId();
        java.lang.String str8 = putRequest1.getStudentId();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }
@Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        com.example.randoop609.domain.User user7 = userService0.getUser((java.lang.Long) 100L);
        java.lang.String str8 = user7.getStudentId();
        java.lang.String str9 = user7.getNickname();
        user7.setNickname("User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)");
        java.lang.String str12 = user7.getUsername();
        user7.setNickname("test");
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNull(str12);
    }
@Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        putRequest1.setNickname("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null), nickname=hi!, password=null, studentId=null)");
        putRequest1.setStudentId("User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null)");
        putRequest1.setStudentId("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=hi!, studentId=)");
        putRequest1.setNickname("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=hi!, studentId=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null))");
        java.lang.String str16 = putRequest1.getNickname();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=hi!, studentId=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null))" + "'", str16, "User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=hi!, studentId=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null))");
    }
@Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.dto.UserDto.PutRequest putRequest1 = new com.example.randoop609.dto.UserDto.PutRequest();
        putRequest1.setUsername("hi!");
        userService0.editUser(putRequest1, (java.lang.Long) 1L);
        putRequest1.setUsername("User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null)");
        putRequest1.setStudentId("User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=, studentId=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null))");
        java.lang.String str10 = putRequest1.getStudentId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=, studentId=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null))" + "'", str10, "User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=, studentId=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null))");
    }