package service;

import java.util.List;

import com.po.Dept;
//写接口是为了减少耦合性
public interface DeptServise {
	
	void save(Dept dept);
	
	void update(Dept dept);
	
	void delete(Dept dept);
	
	List<Dept> getAll();
	
}
