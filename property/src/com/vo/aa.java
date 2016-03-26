package com.vo;

public class aa {
	String name;
	
	int power;
	
	public aa(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}
	public aa() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public void use(){
		System.out.println(this.name+":¹¥»÷Á¦ÊÇ"+this.power);
	}
	@Override
	public String toString() {
		return "aa [name=" + name + ", power=" + power + "]";
	}
}
