package com.njtechstation.service;

import com.njtechstation.domain.User;

public interface UserService {

    public int addUser(User user);
    public String queryPwd(String phone);
}
