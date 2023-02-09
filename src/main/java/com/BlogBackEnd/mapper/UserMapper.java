package com.BlogBackEnd.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @className UserMapper
 * @author Anke Zuo
 * @description DAO of user service
 * @updateTime 2/9/23 02:20
 * @version 1.0
 */
@Mapper
public interface UserMapper {
    String queryUserName(int userId);
}
