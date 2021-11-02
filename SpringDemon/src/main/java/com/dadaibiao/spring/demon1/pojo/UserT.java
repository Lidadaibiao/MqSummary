package com.dadaibiao.spring.demon1.pojo;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/11/2 16:04
 */
public class UserT {
    private String name;
    public UserT(String name){
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("show"+"name="+name);
    }
}
