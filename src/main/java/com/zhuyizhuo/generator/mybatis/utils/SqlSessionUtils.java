package com.zhuyizhuo.generator.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * class: SqlSessionUtils <br>
 * description: TODO <br>
 * time: 2018/7/30 12:34
 *
 * @author yizhuo <br>
 * @version 1.0
 */
public class SqlSessionUtils {

    /**
     *  相对路径加载配置文件
     */
    public static SqlSession getSqlSession() throws Exception {
        //配置文件
        String resource = "mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        LogFactory.useStdOutLogging();
        return sqlSessionFactory.openSession();
    }

}