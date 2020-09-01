package com.njtechstation.service.impl;

import com.njtechstation.dao.UserDao;
import com.njtechstation.domain.User;
import com.njtechstation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {

        int nums = userDao.insertUser(user);
        return nums;
    }

    @Override
    public String queryPwd(String phone) {

        return userDao.userPwd(phone);
    }
}
