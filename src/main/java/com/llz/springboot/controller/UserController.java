package com.llz.springboot.controller;

import com.llz.springboot.entity.Dept;
import com.llz.springboot.entity.User;
import com.llz.springboot.mapper.DeptMapper;
import com.llz.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    @Autowired
    DeptMapper deptMapper;

    @GetMapping("/getuser/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return userMapper.getUserById(id);
    }

    @GetMapping("/insertuser")
    public User insertUser(User user){
        userMapper.insertUser(user);
        return user;
    }

    @GetMapping("/getdept/{id}")
    public Dept getDept(@PathVariable("id") Integer id){
        return deptMapper.getDeptById(id);
    }
}
