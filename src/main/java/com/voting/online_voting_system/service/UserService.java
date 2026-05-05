package com.voting.online_voting_system.service;

import com.voting.online_voting_system.dto.RegisterRequest;
import com.voting.online_voting_system.entity.User;
import com.voting.online_voting_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerUser(RegisterRequest request){
        User user = new User();
        
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }
}
