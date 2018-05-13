package com.xyz.cf.service.impl;

import com.xyz.cf.pojo.SysUser;
import com.xyz.cf.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author: liuyang
 * @Date: 20180513 15:57
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createUser(SysUser user) {
        jdbcTemplate.update("insert into sys_user(nickname,username,password) values(?, ?, ?)", user.getNickname(), user.getUsername(), user.getPassword());
        System.out.println("创建用户成功...");
    }
}
