package com.dadaibiao.spring.demon1.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/11/2 16:23
 */
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbys;
    private Map<String,String> card;
    private Set<String> games;
    private String wife;
    private Properties info;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String[] getBooks() {
        return books;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public Set<String> getGames() {
        return games;
    }

    public String getWife() {
        return wife;
    }

    public Properties getInfo() {
        return info;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public void show(){
        System.out.println("name="+name
              +",address="+address.getAddress()+",books=");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println("爱好：——————"+hobbys);
        System.out.println("card：——————"+card);
        System.out.println("games：——————"+games);
        System.out.println("wife：——————"+wife);
        System.out.println("info：——————"+info);
        }
}
