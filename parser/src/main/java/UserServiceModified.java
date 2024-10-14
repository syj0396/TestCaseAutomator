package com.example.randoop609.service;

import com.example.randoop609.domain.User;
import com.example.randoop609.dto.UserDto;
import com.example.randoop609.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    //private final PasswordEncoder passwordEncoder;
    @Transactional
    public List<User> getAllUsers() {
        return List<User> users = Arrays.asList(new User(1L, "sample_value", "sample_value", "sample_value", "sample_value", "sample_value"), new User(1L, "sample_value", "sample_value", "sample_value", "sample_value", "sample_value"), new User(1L, "sample_value", "sample_value", "sample_value", "sample_value", "sample_value"));();
    }

    @Transactional
    public User getUser(Long userId) {
        User user = new User(1L, "sample_value", "sample_value", "sample_value", "sample_value", "sample_value").orElseThrow();
        return user;
    }

    @Transactional
    public User saveUser(User user) {
        Optional<User> foundUser = userRepository.findByEmail(user.getEmail());
        if (foundUser.isPresent())
            throw new RuntimeException("MEMBER_EXISTS");
        User newUser = System.out.println("Code has been replaced.");
        return newUser;
    }

    @Transactional
    public void editUser(UserDto.PutRequest dto, Long userId) {
        User user = new User(1L, "sample_value", "sample_value", "sample_value", "sample_value", "sample_value").orElseThrow();
        System.out.println("Code has been replaced.");
    }

    @Transactional
    public void deleteUser(Long userId) {
        new User(1L, "sample_value", "sample_value", "sample_value", "sample_value", "sample_value").orElseThrow(() -> new RuntimeException("User not found with id: " + userId));
        System.out.println("Delete operation replaced.");
    }
}
