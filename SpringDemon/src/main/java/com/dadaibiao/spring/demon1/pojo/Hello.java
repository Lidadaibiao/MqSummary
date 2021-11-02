package com.dadaibiao.spring.demon1.pojo;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/11/2 15:47
 */

public class Hello {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Hello,"+name);
    }
}
