package cn.zs.service.impl;

import cn.zs.bo.User;
import cn.zs.mapper.UserMapper;
import cn.zs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
/**
 * 利用注解方式配置事务，可以添加各种属性。如果不清楚怎么添加，可以点击注解，进去看看可以配置什么属性。
 */
//   @Transactional(timeout = -1,readOnly = true,isolation = Isolation.DEFAULT)
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }
}
