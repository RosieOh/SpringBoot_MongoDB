package com.mongodb_test.service;

import com.mongodb_test.domain.User;
import com.mongodb_test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository ur;

    public List<User> getAllUsers() {
        return ur.findAll();
    }

    public User createUser(User u) {
        return ur.save(u);
    }
}
