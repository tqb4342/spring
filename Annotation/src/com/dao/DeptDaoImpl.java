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
		list.add(new Dept(101,"�ִ�","������"));
		list.add(new Dept(102,"�ڴ�","������"));
		list.add(new Dept(103,"�ϴ�","������"));
		list.add(new Dept(104,"����","������"));
	}
	@Override
	public void save(Dept dept) {
		// TODO Auto-generated method stub
		list.add(dept);
		System.out.println("����ɹ�"+dept);
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub
		System.out.println(""
				+ "����ɹ�"+dept);
	}

	@Override
	public void delete(Dept dept) {
		// TODO Auto-generated method stub
		System.out.println("ɾ���ɹ�"+dept);
	}

	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		return this.list;
	}

}
