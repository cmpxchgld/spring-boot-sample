package com.sample.userdao;

import com.sample.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
//@Mapper
public interface UserMapper {

    UserInfo findById(@Param("userId") String userId);

}
