package com.xyz.cf.controller;

import com.xyz.cf.pojo.SysUser;
import com.xyz.cf.service.SysUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: liuyang
 * @Date: 20180513 16:00
 */
@RestController
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @RequestMapping("/createUser")
    public String createUser(String nickname, String username, String password) {
        SysUser user = new SysUser();
        user.setNickname(nickname);
        user.setUsername(username);
        user.setPassword(password);
        sysUserService.createUser(user);
        return "success";
    }
}
