package com.example.randoop609.controller;

import com.example.randoop609.domain.User;
import com.example.randoop609.dto.UserDto;
import com.example.randoop609.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/api/user")
    public void register(@RequestBody @Valid UserDto.SignUpForm signUpForm) {

        if (!signUpForm.getPassword().equals(signUpForm.getRePassword())) {
            throw new RuntimeException("비밀번호가 일치하지 않습니다.");
        }

        // User 엔티티 객체 생성
        User user = signUpForm.toEntity();

        // 저장
        userService.saveUser(user);

        /*if (newUser != null) {
            return ResponseEntity.status(201).body("회원가입이 완료되었습니다.");
        } else {
            return ResponseEntity.status(500).body("회원가입에 실패하였습니다.");
        }*/
    }

    public User testController() {
        User newUser = User.builder()
                .build();
        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        if (day % 2 == 0) return null;
        else return newUser;
    }

    @GetMapping("/api/test")
    public User testController2() {
        User newUser = User.builder()
                .build();
        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        if (day % 3 == 0) return null;
        else return newUser;
    }
}
