package com.vo;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class General {
	String name;
	int age;
	aa weapon;
	String[] hobby;
	
	List<String> skill;
	
	Set<aa> set;
	
	Map<String,String> language;
	
	

	public Map<String, String> getLanguage() {
		return language;
	}

	public void setLanguage(Map<String, String> language) {
		this.language = language;
	}

	public Set<aa> getSet() {
		return set;
	}

	public void setSet(Set<aa> set) {
		this.set = set;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public aa getWeapon() {
		return weapon;
	}

	public void setWeapon(aa weapon) {
		this.weapon = weapon;
	}

	public void init(){
		System.out.println("init被调用....");
		System.out.println(this.name);
	}
	
	public void eat(){
		System.out.println(this.age+"岁的"+this.name+"正在愉快的吃着早餐");
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void attack(){
		System.out.println(this.name+"正在挥舞着"+this.weapon.getName());
		this.getWeapon().use();
	}
	
	public void shouInfo() {
		System.out.println(this.name+"的信息如下");
		System.out.println("爱好是："+Arrays.toString(hobby));
		System.out.println("技能是："+this.skill);
		System.out.println("武器有："+this.set);
		
		//map
		System.out.println("技能如下：");
		Set<String> set = language.keySet();
		for(String s:set){
			System.out.println(s+":"+language.get(s));
		}
	}

	public List<String> getSkill() {
		return skill;
	}

	public void setSkill(List<String> skill) {
		this.skill = skill;
	}
	
}
