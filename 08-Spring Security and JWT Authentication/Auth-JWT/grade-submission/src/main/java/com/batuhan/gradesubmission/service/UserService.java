package com.batuhan.gradesubmission.service;

import com.batuhan.gradesubmission.entity.User;

public interface UserService {
    User getUser(Long id);
    User getUser(String username);
    User saveUser(User user);
}