package com.example.demo.domain.member.service;

import com.example.demo.domain.member.dto.UserMapper;
import com.example.demo.domain.member.dto.UserRequest;
import com.example.demo.domain.member.dto.UserResponse;
import com.example.demo.domain.member.entity.User;
import com.example.demo.domain.member.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResponse create(UserRequest request) {

        User user = userMapper.toEntity(request);
        User saveUser = userRepository.save( user);
        return userMapper.toResponseDto( saveUser);
    }
}
