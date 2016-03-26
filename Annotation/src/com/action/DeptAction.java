package com.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.DeptServise;

import com.po.Dept;

@Controller
//@Scope("prototype")
public class DeptAction {
	
	@Autowired
	DeptServise deptService;
	
	public String save(Dept dept){
		
		deptService.save(dept);
		
		List<Dept> list = deptService.getAll();
		for(Dept d:list){
			System.out.println(d);
		}
		
		return "success";
	}
}
