package com.severinu.basic_app.domain.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser() {
        return new User(1L, "Adam", "Smith");
    }

}
