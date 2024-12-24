package com.fawry.movie_app.service;

import com.fawry.movie_app.model.dto.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public LoginResponse login(String userName, String rawPassword);
}
