package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.User;

@Mapper
public interface UserMapper {

	
	public User insert(User user);
	
	public User findByUserId(Integer userId);
	
	public User findByUserIdAndPassword(Integer userId,String password);
	
	public List<User> findAll();
	
	public User update(User user);
	
	
	
	
}
