package com.example.Service;

import java.util.List;

import com.example.entity.User;
import com.example.query.UserQuery;
import com.github.pagehelper.Page;

public interface UserService {
	public List<User> userList();

	public Page<User> findByPage(UserQuery query, int pageNo, int pageSize);

	public int insert(User user);

	public int delete(int id);

	public User findByName(String name);
}
