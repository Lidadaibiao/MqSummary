package com.dadaibiao.spring.demon1.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/11/2 15:58
 */
public class UserTest {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        User user =(User)applicationContext.getBean("user");
//        //调用对象方法
//        user.show();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserT userT = (UserT)context.getBean("userT");
        userT.show();
    }
}
