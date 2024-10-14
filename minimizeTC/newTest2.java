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
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.example.randoop609.service.UserService userService0 = new com.example.randoop609.service.UserService();
        com.example.randoop609.domain.User user2 = userService0.getUser((java.lang.Long) 0L);
        user2.setStudentId("User.UserBuilder(id=1, username=User.UserBuilder(id=-1, username=User.UserBuilder(id=-1, username=null, nickname=null, password=null, studentId=null), nickname=hi!, password=null, studentId=null), nickname=, password=hi!, studentId=User.UserBuilder(id=-1, username=null, nickname=hi!, password=null, studentId=null))");
        org.junit.Assert.assertNotNull(user2);
    }