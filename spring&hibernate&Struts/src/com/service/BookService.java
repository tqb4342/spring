package com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.common.PageInfo;
import com.po.Book;

@Transactional   //Ӧ����service�п�������
public interface BookService {
	
	public void save(Book book);
	
	public void update(Book book);
	
	public List<Book> getAll();
	
	public void delete(Integer bid);
	
	public boolean checkbname(String bname);
	
	public void getAll(PageInfo info);
}
