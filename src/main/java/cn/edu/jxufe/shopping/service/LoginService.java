package cn.edu.jxufe.shopping.service;

import cn.edu.jxufe.shopping.entity.Admin;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/8.
 */
public interface LoginService {
    public Admin Login(String username, String password);
}
