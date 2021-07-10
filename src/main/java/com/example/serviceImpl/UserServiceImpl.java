package com.example.serviceImpl;

import com.example.bean.User;
import com.example.dao.UserDao;
import com.example.service.UserService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll(){
        System.out.println("userService的findAll()查询");
        List<User> userList = userDao.findAll();
        return userList;
    };

    public User findById(Integer id){

        return  null;
    };

    @Insert("INSERT INTO `user` (username,birthday,sex,address) VALUES(#{username},#{birthday},#{sex},#{address});")
    public void save(User user){

    };

    public void deleteById(Integer id){

    };

}
