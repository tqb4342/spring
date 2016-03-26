package com.po;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class Book implements java.io.Serializable {

	// Fields

	private Integer bid;
	private String bname;
	private Integer price;

	// Constructors

	/** default constructor */
	public Book() {
	}

	/** full constructor */
	public Book(String bname, Integer price) {
		this.bname = bname;
		this.price = price;
	}

	// Property accessors

	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price
				+ "]";
	}

	public String getBname() {
		return this.bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}