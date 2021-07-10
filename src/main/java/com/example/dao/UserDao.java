package com.example.dao;

import com.example.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    @Select("select * from `user`")
    public List<User> findAll();

    public User findById(Integer id);

    public void save(User user);

    public void deleteById(Integer id);
}
