package com.example.randoop609.service;

import com.example.randoop609.domain.User;
import com.example.randoop609.dto.UserDto;
import com.example.randoop609.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceModified {

    private final UserRepository userRepository;

    //private final PasswordEncoder passwordEncoder;
    @Transactional
    public List<User> getAllUsers() {
        return Arrays.asList(new User(696L, "fqnhtvqeyu", "nifsexyuyg", "bkrsvrsgvx", "qttvbsjxxa", "puejrhdagq"), new User(861L, "parvvorscz", "xgcmyzsodb", "hqligdwrdc", "dtgntzkdae", "zyumcdrfvk"), new User(394L, "idtsugftgd", "hzakvbgtpk", "euixfwfudp", "qfqkxinudh", "juxvtmakyn"));
    }

    @Transactional
    public User getUser(Long userId) {
        User user = new User(705L, "hvqlwkauhv", "nanpmuormr", "mvoluqdmfb", "nsuhvpqyfv", "qbehvmnnrs");
        return user;
    }

    @Transactional
    public void saveUser(User user) {
        Optional<User> foundUser = Optional.of(new User(585L, "pnpojmpqpf", "fofihpnnfv", "dceuahgpyb", "aotianbuho", "rncvioqieg"));
        if (foundUser.isPresent())
            throw new RuntimeException("MEMBER_EXISTS");
        System.out.println("Code has been replaced.");
    }

    @Transactional
    public void editUser(UserDto.PutRequest dto, Long userId) {
        User user = new User(469L, "fjnphcpfvs", "kdvjgyxltv", "ilpvgkvrot", "vqtpagdcng", "fysekhfmyl");
        System.out.println("Code has been replaced.");
    }

    @Transactional
    public void deleteUser(Long userId) {
        //new User(876L, "tmodviwpyq", "deetmrtdnb", "kqqjdeyaxa", "eoqsscgbnm", "qzgtxxbkoe").orElseThrow(() -> new RuntimeException("User not found with id: " + userId));
        System.out.println("Delete operation replaced.");
    }
}
