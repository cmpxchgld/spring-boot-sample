package com.sample.roledao;

import com.sample.bean.Role;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper {

    Role findById(String roleId);
}
