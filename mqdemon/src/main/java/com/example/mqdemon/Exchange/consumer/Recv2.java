package com.example.mqdemon.Exchange.consumer;

import com.example.mqdemon.util.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author dadaibiaoLi
 * @Desc   消费者2（注册成功发给邮件服务）
 * @Date 2021/9/26 14:19
 */
public class Recv2 {
    //邮件队列
    private final static String QUEUE_NAME = "fanout_exchange_queue_email";

    private final static String EXCHANGE_NAME = "test_fanout_exchange";

    public static void main(String[] args) throws IOException, TimeoutException {
        //1 获取连接
        Connection connection = ConnectionUtil.getConnection();
        //2 创建通道
        Channel channel = connection.createChannel();

        //3 声明队列
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);

        //4 队列绑定到交换机
        channel.queueBind(QUEUE_NAME,EXCHANGE_NAME,"");

        //定义消费者
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String msg = new String(body,"UTF-8");
                System.out.println(" [邮件服务] received : " + msg + "!");
            }
        };

        //监听队列，自动消费消息
        channel.basicConsume(QUEUE_NAME,true,defaultConsumer);
    }
}
