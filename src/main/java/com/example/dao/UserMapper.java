package com.example.dao;

import java.util.List;

import com.example.entity.User;
import com.example.query.UserQuery;
import com.github.pagehelper.Page;

public interface UserMapper {


	public List<User> selectAllUser();

	public Page<User> findByPage(UserQuery query);

	public int insertUser(User user);

	public int updateUser(User user);

	public int deleteUser(int id);

	public User findByName(String name);
	
	public User findById(int id);
}
