package com.common;

import java.util.List;
/*
 * 分页信息类，包含分页的所有信息
 * 
 * 
 * 
 */
public class PageInfo {

	//请求的Action名；
	String action;
	
	//数据
	List list;
	
	//总记录数
	int recordCount;
	//总页数
	int pageCount;
	
	//当前页号
	int currentPage=1;
	
	public PageInfo() {
		super();
	}

	public PageInfo(String action, int currentPage) {
		super();
		this.action = action;
		this.currentPage = currentPage;
	}

	//每页记录数；
	int pageSize=5;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
