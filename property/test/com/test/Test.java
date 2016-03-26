package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vo.General;

public class Test {
	public static void main(String[] args) {
		
		//1.����һ��Spring����
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//2.�ڹ����ػ�general����
		General g = (General) factory.getBean("general");
		g.setName("����");
		g.eat();
		
		//Ĭ��bean�ǵ���ģʽ��g1��g��ͬһ�����󣬵��ǿ���ͨ��scope�����޸ĳ�prototype;
		General g1 = (General) factory.getBean("general");
		g1.eat();
		System.out.println(g==g1);
		
		g.attack();
		
		g.shouInfo();
		
		
	}
}
