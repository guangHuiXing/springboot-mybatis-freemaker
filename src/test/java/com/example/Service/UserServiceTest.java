package com.example.Service;

import com.example.entity.User;
import com.example.query.UserQuery;
import com.github.pagehelper.Page;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
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
public class UserServiceTest {

    @Autowired
    UserServiceImpl userService;
    @Test
    public void userList() {
        ;
        log.info("所有"+userService.userList().size());
    }
    @Test
    public void findByPage() {
        UserQuery query = new UserQuery();
        query.setUsername("xgh");
        query.setPassword("123");

        Page<User> page = userService.findByPage(query,1,2);
        log.info("分页后的数据"+page.toString());
    }

    @Test
    public void insert() {
        User u = new User();
        u.setAge(12);
        u.setEmail("213123123");
        u.setUsername("13213123");
        u.setPassword("12321");
       int a= userService.insert(u);
        Assert.assertEquals(1,userService.insert(u));
    }

    @Test
    public void delete() {
    }

    @Test
    public void findByName() {
    }
}