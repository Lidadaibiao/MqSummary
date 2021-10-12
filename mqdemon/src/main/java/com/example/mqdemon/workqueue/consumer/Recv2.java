package com.example.mqdemon.workqueue.consumer;

import com.example.mqdemon.util.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author dadaibiaoLi
 * @Desc 消费者2
 * @Date 2021/9/26 10:09
 */
public class Recv2 {
    private final static String QUEUE_NAME = "test_work_queue";

    public static void main(String[] args) throws IOException, TimeoutException {
        //1 获取连接
        Connection connection = ConnectionUtil.getConnection();
        //2 创建通道
        Channel channel = connection.createChannel();
        //3 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        channel.basicQos(1);
        //        //实现消费方法
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {

            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String msg = new String(body, "UTF-8");
                System.out.println(" [消费者2] received : " + msg + "!");
            }
        };
        channel.basicConsume(QUEUE_NAME, false, defaultConsumer);
    }
}
