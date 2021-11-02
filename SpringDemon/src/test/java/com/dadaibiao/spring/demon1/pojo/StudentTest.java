package com.dadaibiao.spring.demon1.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/11/2 16:30
 */
public class StudentTest {
    public static void main(String[] args) {
        //解析beans.xml文件
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Student student = (Student)context.getBean("student");
//        System.out.println(student.getName());
//
//
//        Student student1 = (Student)context.getBean("student1");
//        System.out.println(student1.getName());
//        System.out.println(student1.getAddress().getAddress());

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Student student = (Student)context.getBean("student2");
//        student.show();
        Student student1 = (Student)context.getBean("studentprototype");
        Student student = (Student)context.getBean("studentprototype");
        System.out.println(student==student1);
    }
}
