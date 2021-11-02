package com.dadaibiao.spring.demon1.pojo;

/**
 * @author dadaibiaoLi
 * @Desc IOC创建对象方式 无参构造方法来创建
 * @Date 2021/11/2 15:56
 */
public class User {
    private String name;

    public User(){
        System.out.println("user无参构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show (){
        System.out.println("show show ");
    }
}
