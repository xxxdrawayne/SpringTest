package com.ywt;

import static org.junit.Assert.assertTrue;

import com.ywt.User;
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
public class MybatisTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    //查询操作
    public void test01() throws IOException {
        //加载核心配置文件
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获取session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(sqlMapConfig);
        //获取session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作 参数：namespace.id
        List<User> userList = sqlSession.selectList("userMapper.findAll");

        System.out.println(userList);

        sqlSession.close();
    }
    @Test
    //插入操作
    public void test02() throws IOException {
        User user = new User();
        user.setName("ltm"); user.setAge(25); user.setPassword("abc123");

        //加载核心配置文件
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获取session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(sqlMapConfig);
        //获取session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作 参数：namespace.id
        sqlSession.insert("userMapper.save",user);
        //mybatis执行更新操作，需要提交事务
        sqlSession.commit();

        sqlSession.close();
    }
    @Test
    //修改操作
    public void test03() throws IOException {
        User user = new User();
        user.setName("ltm"); user.setAge(20); user.setPassword("ltm123");

        //加载核心配置文件
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获取session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(sqlMapConfig);
        //获取session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作 参数：namespace.id
        sqlSession.update("userMapper.update",user);
        //mybatis执行更新操作，需要提交事务
        sqlSession.commit();

        sqlSession.close();
    }
    @Test
    //删除操作
    public void test04() throws IOException {


        //加载核心配置文件
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获取session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(sqlMapConfig);
        //获取session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作 参数：namespace.id
        sqlSession.delete("userMapper.delete","ltm");
        //mybatis执行更新操作，需要提交事务
        sqlSession.commit();

        sqlSession.close();
    }
}
