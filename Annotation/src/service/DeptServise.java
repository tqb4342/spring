package service;

import java.util.List;

import com.po.Dept;
//д�ӿ���Ϊ�˼��������
public interface DeptServise {
	
	void save(Dept dept);
	
	void update(Dept dept);
	
	void delete(Dept dept);
	
	List<Dept> getAll();
	
}
