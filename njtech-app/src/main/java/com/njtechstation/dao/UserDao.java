package com.njtechstation.dao;

import com.njtechstation.domain.User;

import java.util.List;

public interface UserDao {

    public int insertUser(User user);
    public List<User>selectUsers();
    public String userPwd(String phone);
}
