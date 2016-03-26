package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DeptDao;
import com.po.Dept;

@Service("deptDervice")
public class DeptServiseImpl implements DeptServise {

		@Autowired  //�Զ�װ��
		DeptDao deptDao;
	@Override
	public void save(Dept dept) {
		// TODO Auto-generated method stub
		deptDao.save(dept);
		System.out.println("service������");
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub
		deptDao.update(dept);
		System.out.println("service������");
	}

	@Override
	public void delete(Dept dept) {
		// TODO Auto-generated method stub
		System.out.println("service������");
		deptDao.delete(dept);
	}

	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		return deptDao.getAll();
	}

}
