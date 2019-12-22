package cn.zs.mapper;

import cn.zs.bo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User queryUserById(@Param("id") long id);

    List<User> queryAllUser();
}
