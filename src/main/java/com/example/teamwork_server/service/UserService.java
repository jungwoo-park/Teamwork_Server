package com.example.teamwork_server.service;

import com.example.teamwork_server.domain.User;
import com.example.teamwork_server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service //repository를 핸들링하기 위하여.
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findUser(int userId){
        return userRepository.findByUserId(userId);
    }

}
