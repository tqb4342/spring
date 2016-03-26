package com.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.common.PageInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.po.Book;
import com.service.BookService;

@Controller
@Scope("prototype")
public class BookAction extends ActionSupport implements ModelDriven<Book> {

	PageInfo pageInfo = new PageInfo();
	
	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Book book = new Book();
	
	String ajax_message;
	
	Map<String,Object> map = new HashMap<String,Object>();
	 
	@Override
	public Book getModel() {
		// TODO Auto-generated method stub
		return book;
	}
	
	@Autowired
	BookService bookService;

	public String save()
	{
		bookService.save(book);
		return "list";
	}

	public String getAjax_message() {
		return ajax_message;
	}

	public void setAjax_message(String ajax_message) {
		this.ajax_message = ajax_message;
	}

	public String getAll(){
//		map.put("list", bookService.getAll());
//		ActionContext.getContext().getValueStack().push(map);
		//分页
		pageInfo.setAction("book_getAll");
		bookService.getAll(pageInfo);
		return "success";
	}
	
	public String chackBname(){
		System.out.println(book.getBname());
		if(bookService.checkbname(book.getBname())){
			ajax_message="<font color=red>此书已存在</font>";
		}else{
			ajax_message="<font color=green>此书可以添加</font>";
		}
		return  "ajax";
	}
	
	
}
