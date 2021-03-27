package com.emrys.myblog.service;

import com.emrys.myblog.po.User;


public interface UserService {
    User checkUser(String username, String password);
}
