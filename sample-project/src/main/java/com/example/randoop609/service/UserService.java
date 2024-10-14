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
        return userRepository.findAll();
    }

    @Transactional
    public User getUser(Long userId) {
        User user = userRepository.findById(userId).orElseThrow();
        return user;
    }

    @Transactional
    public User saveUser(User user) {
        Optional<User> foundUser = userRepository.findByEmail(user.getEmail());

        if (foundUser.isPresent())
            throw new RuntimeException("MEMBER_EXISTS");
        User newUser = userRepository.save(user);
        return newUser;
    }

    @Transactional
    public void editUser(UserDto.PutRequest dto, Long userId) {
        User user = userRepository.findById(userId).orElseThrow();
        userRepository.save(user);
    }

    @Transactional
    public void deleteUser(Long userId) {
        userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + userId));

        userRepository.deleteById(userId);
    }
}
