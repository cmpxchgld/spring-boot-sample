package com.sample.service.impl;

import com.sample.bean.Role;
import com.sample.bean.UserInfo;
import com.sample.roledao.RoleMapper;
import com.sample.userdao.UserMapper;
import com.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public UserInfo findByUserId(String userId) {
        return userMapper.findById(userId);
    }

    @Override
    public Role findByRoleId(String roleId) {
        return roleMapper.findById(roleId);
    }
}
