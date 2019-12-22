package cn.zs.mapper;

import cn.zs.bo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User queryUserById(@Param("id") long id);
}
