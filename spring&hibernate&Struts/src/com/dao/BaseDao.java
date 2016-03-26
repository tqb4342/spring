package com.dao;

import java.util.List;

import com.common.PageInfo;


public interface BaseDao<T> {
	
	public void save(T t);
	
	public void update(T t);
	
	//参数的类型化
	public void delete(Class<T> clazz,java.io.Serializable id);
	
	public T getEntityById(Class<T> clazz,java.io.Serializable id);
	
	public List<T> getAll(Class<T> clazz);
	
	public List<T> getEntity(Class<T> clazz,String name,Object value);
	
	public Integer getCount(Class<T> clazz);

	void getAll(Class<T> clazz, PageInfo info);
	
	
}
