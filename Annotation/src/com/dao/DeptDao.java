package com.dao;



import java.util.List;

import com.po.Dept;

/*
 * 
 * dao�ӿ�
 */
public interface DeptDao {
	
	void save(Dept dept);
	
	void update(Dept dept);
	
	void delete(Dept dept);
	
	List<Dept> getAll();
}
