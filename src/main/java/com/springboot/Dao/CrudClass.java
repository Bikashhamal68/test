package com.springboot.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class CrudClass implements SignupDao {
@Autowired
	private JdbcTemplate jdbctemplate;
	
	public void save(User user) {
		   String sql = "INSERT INTO users (uname, email, num, address, pwd, image, gender) VALUES (?, ?, ?, ?, ?, ?, ?)";
         Object o[]= { user.getUname(), user.getEmail(), user.getNum(), user.getAddress(),
	                user.getPwd(), user.getImage(), user.getGender()};
	        jdbctemplate.update(sql,o);
	}
	  public List<User> getAllUsers() {
	        String sql = "SELECT * FROM users";
	        return jdbctemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
	    }
	public void delete(int id) {
		String sql = "DELETE FROM users WHERE id= ?";
        
        jdbctemplate.update(sql, id);
	}
	public User findById(int id) {
	    String sql = "SELECT * FROM users WHERE id = ?";
	    return 	    jdbctemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
 
	}
	public void modify(int id,String url) {
		String sql = "UPDATE users Set image=? WHERE id= ?";
        jdbctemplate.update(sql,url,id);

	}

	public User check(String email, String pwd) {
	    String sql = "SELECT * FROM users WHERE email = ? AND pwd = ?";
	    List<User> users = jdbctemplate.query(sql, new BeanPropertyRowMapper<>(User.class), email, pwd);
	    return users.isEmpty() ? null : users.get(0);
	}


	public void update(User user) {
		   String sql =" update users set uname=?, email=?, num=?, address=?, pwd=?, image=?, gender=? where id=?";
      Object o[]= { user.getUname(), user.getEmail(), user.getNum(), user.getAddress(),
	                user.getPwd(), user.getImage(), user.getGender(), user.getId()};
	        jdbctemplate.update(sql,o);
	}

	
}
