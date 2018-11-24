package com.example.controller;

import com.example.Service.UserService;
import com.example.entity.User;
import com.example.query.UserQuery;
import com.example.vo.UserVO;
import com.github.pagehelper.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@Slf4j
@RequestMapping("/user")
public class UserController {

	@Autowired
	com.example.Service.UserService UserService;
	
	/*@RequestMapping("/list")
	public String List(Model model,){
		UserService.userList();
	}*/
	@RequestMapping("/login")
	public String loginPage(){
		return "loginPage";
	}

	@PostMapping("/list")
    @ResponseBody
    public Page<User> findByPage(UserVO userVO){
	    int pageNum = userVO.getPageNum()!=0?userVO.getPageNum():1;
        int pageSize = userVO.getPageSize()!=0?userVO.getPageSize():10;
        UserQuery query = new UserQuery();

            log.info("[开始查询]");

            BeanUtils.copyProperties(userVO,query);


        Page<User> userPage = UserService.findByPage(query,userVO.getPageNum(),userVO.getPageSize());
        return userPage;

    }
}
