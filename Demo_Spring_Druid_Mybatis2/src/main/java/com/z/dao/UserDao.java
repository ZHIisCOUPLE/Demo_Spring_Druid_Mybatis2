package com.z.dao;

import com.z.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {


    User getUser(@Param("userName") String userName, @Param("password") String password);
}
