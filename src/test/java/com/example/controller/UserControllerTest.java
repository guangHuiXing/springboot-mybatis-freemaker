package com.example.controller;

import com.example.BaseTest;
import com.example.query.UserQuery;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.*;

/**
 * Created by XGH on 2018/11/24
 */
public class UserControllerTest extends BaseTest {

    @Autowired
    UserController userController;

    MockMvc mockMvc;
    @Test
    public void findByPage() throws Exception {
        UserQuery userQuery = new UserQuery();
        userQuery.setPassword("123");
        RequestBuilder request = MockMvcRequestBuilders.post("/user/list")
                .param("username","xgh")
                .param("password","123")
                .contentType(MediaType.APPLICATION_JSON_UTF8);
        MvcResult result = mockMvc.perform(request).andReturn();

        int status = result.getResponse().getStatus();
        Assert.assertEquals(status,200);
/*
        MvcResult mvcResult = mockMvc.perform(
                (MockMvcRequestBuilders.post("/user/list")
                .param("username","xgh")
                .param("password","123")
                .contentType(MediaType.APPLICATION_JSON_UTF8)).andReturn();*/




    }
}