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
		System.out.println("init������....");
		System.out.println(this.name);
	}
	
	public void eat(){
		System.out.println(this.age+"���"+this.name+"�������ĳ������");
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
		System.out.println(this.name+"���ڻ�����"+this.weapon.getName());
		this.getWeapon().use();
	}
	
	public void shouInfo() {
		System.out.println(this.name+"����Ϣ����");
		System.out.println("�����ǣ�"+Arrays.toString(hobby));
		System.out.println("�����ǣ�"+this.skill);
		System.out.println("�����У�"+this.set);
		
		//map
		System.out.println("�������£�");
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
