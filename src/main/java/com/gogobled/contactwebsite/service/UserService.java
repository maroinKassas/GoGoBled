package com.gogobled.contactwebsite.service;

import com.gogobled.contactwebsite.entity.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

}
