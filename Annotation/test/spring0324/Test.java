package spring0324;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import service.DeptServise;

import com.action.DeptAction;
import com.dao.DeptDao;
import com.po.Dept;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//注意：factory.getBean("deptDaoImpl");中的"deptDaoImpl"和源类名不一样，第一个字母是小写
		//DeptDao dao =  (DeptDao) factory.getBean("deptDaoImpl");
		//DeptDao dao =  (DeptDao) factory.getBean(DeptDao.class);
		//对应@Repository("DeptDao")
		DeptDao dao =  (DeptDao) factory.getBean("DeptDao");
		
		List<Dept> list = dao.getAll();
		for(Dept d:list){
			System.out.println(d);
		}
		
		DeptServise serivce = (DeptServise) factory.getBean("deptDervice");
		serivce.save(new Dept(105,"北大","教育部"));
		for(Dept d:serivce.getAll()){
			System.out.println(d);
		}
		
		
		
		DeptAction action = (DeptAction) factory.getBean("deptAction");
		action.save(new Dept(106,"国防科大","国防部"));
		
		DeptAction action1 = (DeptAction) factory.getBean("deptAction");
		action1.save(new Dept(107,"北航","国防部"));  
		
		System.out.println(action==action1);
		
	}

}
