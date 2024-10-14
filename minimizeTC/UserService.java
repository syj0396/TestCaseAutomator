package com.example.randoop609.service;

import com.example.randoop609.domain.User;
import com.example.randoop609.dto.UserDto;
import com.example.randoop609.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    //private final UserRepository userRepository;
    //private final PasswordEncoder passwordEncoder;

    @Transactional
    public User getUser(Long userId) {
        //User user = userRepository.findById(userId).orElseThrow();
        User user = User.builder()
                .nickname("test")
                .password("1234")
                .build();
        return user;
    }

    @Transactional
    public void saveUser(UserDto.SignUpForm signUpForm) {
        if (!signUpForm.getPassword().equals(signUpForm.getRePassword())) {
            throw new RuntimeException("비밀번호가 일치하지 않습니다.");
        }
        //signUpForm.setPassword(passwordEncoder.encode(signUpForm.getPassword()));
        //userRepository.save(signUpForm.toEntity());
    }

    @Transactional
    public void editUser(UserDto.PutRequest dto, Long userId) {
        //User user = userRepository.findById(userId).orElseThrow();
        User user = User.builder()
                .nickname("test")
                .password("1234")
                .build();
        user.setNickname(dto.getNickname());
        user.setUsername(dto.getUsername());
        user.setStudentId(dto.getStudentId());
        //userRepository.save(user);
    }
}
