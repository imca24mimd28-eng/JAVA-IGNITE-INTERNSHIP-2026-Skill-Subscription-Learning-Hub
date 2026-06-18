package com.skills.hub.service;

import com.skills.hub.entity.User;

public interface UserService {

    User registerUser(User user);

    User login(String email, String password);
}




user service
