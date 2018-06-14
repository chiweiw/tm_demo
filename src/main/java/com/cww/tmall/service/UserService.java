package com.cww.tmall.service;

import com.cww.tmall.pojo.User;

import java.util.List;

/**
 * 用户表，
 * 1. 用户的增加，是交由前台注册行为产生的，后台不需要自己进行增加
 *2. 用户信息不能删除。 用户信息是最重要的业务信息，不可以删除
* 3. 用户资料的修改，也应该有前台用户自己进行，而不是后台操作。比如修改密码
 * */
public interface UserService {

    void add(User c);
    void delete(int id);
    void update(User c);
    User get(int id);
    List list();
    //判断是否存在该名称
    boolean isExist(String name);

    //判断登录
    User get(String name, String password);

}
