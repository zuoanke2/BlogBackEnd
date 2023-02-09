package com.BlogBackEnd.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    String queryUserName(int userId);
}
