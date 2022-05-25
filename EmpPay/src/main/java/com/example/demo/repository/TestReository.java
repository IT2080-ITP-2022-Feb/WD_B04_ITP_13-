package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;


import com.example.demo.model.Test;


public interface TestReository extends CrudRepository<Test , Integer> {
	
	public Test findByid(String id);
	public Test findBywbc(String wbc);

}
