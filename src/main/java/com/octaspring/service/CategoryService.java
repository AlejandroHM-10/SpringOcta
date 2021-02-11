package com.octaspring.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.octaspring.dao.CategoryInterface;
import com.octaspring.entity.Category;

public class CategoryService implements  CategoryInterface{
	
	private JdbcTemplate jdbcTemplate;
	String sql;
	
	public CategoryService(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	

	public void save(Category category) {
		// TODO Auto-generated method stub
		sql= "INSERT INTO category(name, description, status, image) values(?, ?, ?, ?)";
		jdbcTemplate.update(sql, category.getName(), category.getDescription(), category.getStatus(), category.getImage());
	}


	public void update(Category category) {
		// TODO Auto-generated method stub
		sql= "UPDATE category SET name = ?, description = ?, status = ?, image = ? WHERE id = ?";
		jdbcTemplate.update(sql, category.getName(), category.getDescription(), category.getStatus(), category.getImage(), category.getId());
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		sql= "DELETE FROM category WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}


	public List<Category> findAll() {
		// TODO Auto-generated method stub
		sql = "SELECT * FROM category";
		return this.jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Category.class));
	}
	public List<Category> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
