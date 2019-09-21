package com.sgic.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sgic.model.defectModel;


public class defectDao {

private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveStudent(defectModel student) {
		String query = "INSERT INTO student(name,age) VALUES ('"+student.getName()+"','"+student.getAge()+"')";
		return jdbcTemplate.update(query);
	}
}
