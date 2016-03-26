package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vo.General;

public class Test {
	public static void main(String[] args) {
		
		//1.创建一个Spring工厂
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//2.在工厂重获general对象
		General g = (General) factory.getBean("general");
		g.setName("刘勇");
		g.eat();
		
		//默认bean是单例模式，g1与g是同一个对象，但是可以通过scope属性修改成prototype;
		General g1 = (General) factory.getBean("general");
		g1.eat();
		System.out.println(g==g1);
		
		g.attack();
		
		g.shouInfo();
		
		
	}
}
