package com.jl.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jl.springcloud.entities.Dept;

@Mapper
public interface DeptDao {

	boolean addDept(Dept dept);
	Dept findById(Long id);
	List<Dept> findAll();
}
