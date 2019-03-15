package com.sample.service;

import com.sample.bean.Role;
import com.sample.bean.UserInfo;

public interface SampleService {

    UserInfo findByUserId(String userId);

    Role findByRoleId(String roleId);
}
