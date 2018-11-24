package com.example.vo;

import lombok.Data;

/**
 * Created by XGH on 2018/11/24
 */
@Data
public class UserVO {
    private int id;

    private String username;

    private String password;

    private int age;

    private String email;
    private int pageNum;
    private int pageSize;
}
