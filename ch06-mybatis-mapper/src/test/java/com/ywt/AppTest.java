package com.ywt;

import static org.junit.Assert.assertTrue;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ywt.dao.UserMapper;
import com.ywt.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setAge(20);

        List<User> userlist = userMapper.findByCondition(user);
        System.out.println(userlist);
    }

    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //设置分页相关参数   当前页+每页显示的条数
        PageHelper.startPage(2,1);

        List<User> userlist = userMapper.findAll();
        for(User user:userlist)
            System.out.println(user);

        //获得与分页相关参数
        PageInfo<User> pageInfo = new PageInfo<>(userlist);
        System.out.println("当前页"+pageInfo.getPageNum());
        System.out.println("每页显示条数"+pageInfo.getPageSize());
        System.out.println("总页数"+pageInfo.getPages());

        sqlSession.close();
    }
}
