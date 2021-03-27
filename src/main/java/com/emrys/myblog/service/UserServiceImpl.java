package com.emrys.myblog.service;

import com.emrys.myblog.dao.UserRepository;
import com.emrys.myblog.po.User;
import com.emrys.myblog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}

