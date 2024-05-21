package com.itheima.service;

import com.itheima.pojo.User;

public interface UserService {

    User findByUserName(String username);

    //注册
    void register(String username, String password);

    // 更新
    void update(User user);
}
