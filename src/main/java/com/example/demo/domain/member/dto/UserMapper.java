package com.example.demo.domain.member.dto;

import com.example.demo.domain.member.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserResponse toResponseDto(User user);

    User toEntity(UserRequest request);
}
