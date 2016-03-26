package com.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.common.PageInfo;

public class BaseDaoImpl<T> implements BaseDao<T> {

	@Autowired
	SessionFactory facktory;
	
	public Session getSession(){
		return 	facktory.getCurrentSession();
	}
	@Override
	public void save(T t) {
		this.getSession().save(t);
		System.out.println(t);
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		this.getSession().update(t);
	}

	@Override
	public void delete(Class<T> clazz, Serializable id) {
		// TODO Auto-generated method stub
		this.getSession().delete(this.getEntityById(clazz, id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getEntityById(Class<T> clazz, Serializable id) {
		// TODO Auto-generated method stub
		return (T) this.getSession().get(clazz, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll(Class<T> clazz) {
		// TODO Auto-generated method stub
		return this.getSession().createCriteria(clazz).list();
	}
	//���������ض������ļ���
	@Override
	public List<T> getEntity(Class<T> clazz, String name, Object value) {
		Criteria c =  this.getSession().createCriteria(clazz);
		//����һ������
		c.add(Restrictions.eq(name, value));
		return c.list();
	}
	
	//��ҳ
	@Override
	public void getAll(Class<T> clazz, PageInfo info) {
		//�����ܼ�¼��
		info.setRecordCount(this.getCount(clazz));
		//������ҳ��
		info.setPageCount( info.getRecordCount()%info.getPageSize()==0 ? info.getRecordCount()/info.getPageSize() : info.getRecordCount()/info.getPageSize()+1 );
		
		Criteria c =  this.getSession().createCriteria(clazz);
		//ÿҳ�ļ�¼��
		c.setMaxResults(info.getPageSize());
		c.setFirstResult((info.getCurrentPage()-1)*info.getPageSize());
		//��ѯ��������ѯ�������info
		info.setList(c.list());
	
	}
	
	//����ܼ�¼��
	@Override
	public Integer getCount(Class<T> clazz) {
		// TODO Auto-generated method stub
		Query query = this.getSession().createQuery("select count(d) from "+clazz.getSimpleName()+" d");
		return ((Long)query.uniqueResult()).intValue();
	}

}
