package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.Dao.CrudClass;
import com.springboot.Dao.User;
import com.springboot.controller.UserDto;
@Component
public class SignupServiceImp  implements SignupService{

	
	@Autowired
	private CrudClass crudclass;
	
	
	@Override
	public void save(UserDto userdto) {
		User user=new User();
		BeanUtils.copyProperties(userdto, user);
		crudclass.save(user);
		
	}
	@Override
	public void update(UserDto userdto) {
		User user=new User();
		BeanUtils.copyProperties(userdto, user);
		crudclass.update(user);
		
	}

	@Override
	public List<UserDto> getAllUsers() {
      List<User> list=crudclass.getAllUsers();
		List<UserDto> dtos=new ArrayList<>();
		for(User user: list){
			UserDto dto=new UserDto();
			BeanUtils.copyProperties(user, dto);
			dtos.add(dto);
			
		}
		
		return dtos;
	}

	@Override
	public void delete(int id) {
		crudclass.delete(id);
	}

	@Override
	public UserDto findById(int id) {
	User user=crudclass.findById(id);
	UserDto userdto=new UserDto();
		BeanUtils.copyProperties(user,  userdto);
		return userdto;
	}

	@Override
	public void modify(int id, String url) {
        crudclass.modify(id, url);		
	}

	@Override
	public UserDto check(String email, String pwd) {
	User user=crudclass.check(email, pwd);
	if (user==null) {
		return null;
	}
	UserDto userdto=new UserDto();
		BeanUtils.copyProperties(user, userdto);
		
		return userdto;
	}
	

}
