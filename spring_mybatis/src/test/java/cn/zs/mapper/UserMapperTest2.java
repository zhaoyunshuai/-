package cn.zs.mapper;

import cn.zs.bo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserMapperTest2 {

    @Test
    public void queryUserById() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
//        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) ac.getBean("sqlSessionFactory");
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //可以利用id属性进行获取bean。也可以利用UserMapper.class进行获取bean
        //  UserMapper mapper = ac.getBean("userMapper");
        UserMapper mapper = ac.getBean(UserMapper.class);
        UserMapper bean = ac.getBean(UserMapper.class);
        User user1 = mapper.queryUserById(2l);
        System.out.println(user1);
        User user = bean.queryUserById(1l);
        System.out.println(user);
    }
}