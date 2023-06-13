package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    User login(@Param("account") String account, @Param("password") String password);

    Integer register(@Param("account") String account,@Param("nickName")String nickName,@Param("password") String password,@Param("tel") String tel);
}
