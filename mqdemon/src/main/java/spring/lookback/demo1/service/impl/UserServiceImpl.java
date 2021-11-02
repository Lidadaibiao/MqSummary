package spring.lookback.demo1.service.impl;

import spring.lookback.demo1.dao.UserDao;
import spring.lookback.demo1.dao.impl.UserDaoImpl;
import spring.lookback.demo1.service.UserService;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/11/2 15:30
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();


    @Override
    public void getUser() {
        this.userDao.getUser();
    }
}
