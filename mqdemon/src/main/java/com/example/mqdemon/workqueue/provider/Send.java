package com.example.mqdemon.workqueue.provider;

import com.example.mqdemon.util.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author dadaibiaoLi
 * @Desc  生产者 ，模拟 50条消息
 * @Date 2021/9/26 9:40
 */
public class Send {

    private final static String QUEUE_NAME = "test_work_queue";

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        //1：获取到连接
        Connection connection = ConnectionUtil.getConnection();
        //2: 获取通道
        Channel channel = connection.createChannel();
        //3: 声明队列
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);

        //循环发布任务
        for (int i = 0; i < 50; i++) {
            //消息内容
            String msg = "task~~~~~~"+i;
            channel.basicPublish("",QUEUE_NAME,null,msg.getBytes());
            System.out.println(" [x] Sent '" + msg + "'");
            Thread.sleep(i*2);
        }
        channel.close();
        connection.close();
    }
}
