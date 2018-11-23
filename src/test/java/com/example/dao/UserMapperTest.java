package com.example.dao;

import com.example.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by XGH on 2018/11/24
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;
    @Test
    public void selectAllUser() {
    }

    @Test
    public void insertUser() {
        User u = new User();
        u.setAge(12);
        u.setEmail("213123123");
        u.setUsername("xasd");
        u.setPassword("12321");
        userMapper.insertUser(u);
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void findByName() {
    }

    @Test
    public void findById() {
    }
}