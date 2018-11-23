package com.example.Service;

import java.util.List;

import com.example.dao.UserMapper;
import com.example.entity.User;
import com.example.query.UserQuery;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {



	@Autowired
	UserMapper userDao;
	@Override
	public Page<User> findByPage(UserQuery query,int pageNo, int pageSize) {
		PageHelper.startPage(pageNo,pageSize);
		return userDao.findByPage(query);
	}
	@Override
	public List<User> userList() {
		return userDao.selectAllUser();
	}

	@Override
	public int insert(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public int delete(int id) {
		return 0;
	}

	@Override
	public User findByName(String name) {
		return null;
	}

}
