package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author hhm
 * @version 1.0
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void show() {

        System.out.println("show...");
    }

//    private String username;

//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public UserDaoImpl() {
//        System.out.println("userDao实例化");
//    }
//
//    public void init(){
//        System.out.println("init初始化方法执行...");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("属性设置之后执行...");
//    }
}
