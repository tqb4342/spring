package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.PageInfo;
import com.dao.BookDao;
import com.po.Book;
import com.po.BookDAO;


@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao<Book> bookdao;
	
	@Override
	public void save(Book book) {
		// TODO Auto-generated method stub
		//System.out.println(book);
		bookdao.save(book);
	}

	@Override
	public void update(Book book) {
		// TODO Auto-generated method stub
		bookdao.update(book);
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookdao.getAll(Book.class);
	}

	@Override
	public void delete(Integer bid) {
		// TODO Auto-generated method stub
		bookdao.delete(Book.class,bid);
	}

	@Override
	public boolean checkbname(String bname) {
		List<Book> list = bookdao.getEntity(Book.class, "bname", bname);
		return !list.isEmpty();
	}

	@Override
	public void getAll(PageInfo info) {
		// TODO Auto-generated method stub
		bookdao.getAll(Book.class, info);
	}

}
