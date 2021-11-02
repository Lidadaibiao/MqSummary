package spring.lookback.demo1.dao.impl;

import spring.lookback.demo1.dao.UserDao;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/11/2 15:28
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取用户数据");
    }
}
