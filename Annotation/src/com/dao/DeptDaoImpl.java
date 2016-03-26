package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.po.Dept;


//@Component
@Repository("DeptDao")
public class DeptDaoImpl implements DeptDao {

	
	
	List<Dept> list = new ArrayList<Dept>();
	{
		list.add(new Dept(101,"林大","教育部"));
		list.add(new Dept(102,"黑大","教育部"));
		list.add(new Dept(103,"南大","教育部"));
		list.add(new Dept(104,"东大","教育部"));
	}
	@Override
	public void save(Dept dept) {
		// TODO Auto-generated method stub
		list.add(dept);
		System.out.println("插入成功"+dept);
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub
		System.out.println(""
				+ "插入成功"+dept);
	}

	@Override
	public void delete(Dept dept) {
		// TODO Auto-generated method stub
		System.out.println("删除成功"+dept);
	}

	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		return this.list;
	}

}
