package com.cww.tmall.service.impl;


import com.cww.tmall.mapper.UserMapper;
import com.cww.tmall.pojo.User;
import com.cww.tmall.pojo.UserExample;
import com.cww.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void add(User u) {
        userMapper.insert(u);
    }

    @Override
    public void delete(int id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(User u) {
        userMapper.updateByPrimaryKeySelective(u);
    }

    @Override
    public User get(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    //UserController只写了这个方法，其他的就当好看
    @Override
    public List list() {
        UserExample example = new UserExample();
        example.setOrderByClause("id desc");
        return userMapper.selectByExample(example);

    }

    @Override
    public boolean isExist(String name) {
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(name);
        List<User> result = userMapper.selectByExample(example);
        if (!result.isEmpty()) {
            return true;
        }
        return false;

    }

    //判断登录
    @Override
    public User get(String name, String password) {
        UserExample example =new UserExample();
        example.createCriteria().andNameEqualTo(name).andPasswordEqualTo(password);
        List<User> result= userMapper.selectByExample(example);
        if(result.isEmpty())
            return null;
        return result.get(0);
    }
}
