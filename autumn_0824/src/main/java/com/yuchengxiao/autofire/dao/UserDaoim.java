package com.yuchengxiao.autofire.dao;

import org.springframework.stereotype.Repository;

@Repository
public class User_1 implements UserDao{


    @Override
    public void add() {
        System.out.println("数据访问-《》《》《》");
    }
}
