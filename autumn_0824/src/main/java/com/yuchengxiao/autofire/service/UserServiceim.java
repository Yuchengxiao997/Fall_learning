package com.yuchengxiao.autofire.service;

import com.yuchengxiao.autofire.dao.UserDao;
import org.junit.jupiter.api.parallel.ResourceLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class User_2 implements UserService{
    @Autowired
    private UserDao userDao;


    @Override
    public void save() {
        System.out.println("save");
        userDao.add();
    }
}
