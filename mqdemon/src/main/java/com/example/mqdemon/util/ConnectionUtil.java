package com.example.mqdemon.util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author dadaibiaoLi
 * @Desc  连接工具类
 * @Date 2021/9/24 16:07
 */
public class ConnectionUtil {
    /**
     *@Author dadaibiao
     *@Desc 建立与rabbitmq的连接
     */
    public static Connection getConnection() throws IOException, TimeoutException {
        //定义连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置服务地址
        factory.setHost("127.0.0.1");
        //端口
        factory.setPort(5672);
        //设置账号信息，用户名、密码、vhost
//        factory.setVirtualHost("/kavito");
//        factory.setUsername("guest");
//        factory.setPassword("guest");
        //通过工厂获取连接
        Connection connection = factory.newConnection();
        return connection;
    }
}
