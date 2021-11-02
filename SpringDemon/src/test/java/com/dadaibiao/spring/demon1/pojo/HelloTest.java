package com.dadaibiao.spring.demon1.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/11/2 15:50
 */
public class HelloTest {
    public static void main(String[] args) {
        //解析bean.xml文件。生成管理相应的bean对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Hello hello = (Hello)applicationContext.getBean("hellow");

        hello.show();
    }
}
