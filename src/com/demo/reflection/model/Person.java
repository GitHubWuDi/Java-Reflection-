package com.demo.reflection.model;

/**
 * @author wudi
 * @version ����ʱ�䣺2018��5��11�� ����11:00:05
 * @ClassName Person
 * @Description ������
 */
public class Person {

	private String guid;
	private String name;
	private Integer age;
	private String sex;

	public Person(){
		super();
	}
	
	public Person(String name,String sex,Integer age){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	
	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
    
	@Override
	public String toString(){
		return "Person[guid:"+guid+";age:"+age+";sex:"+sex+";name:"+name+"]";
	}
}
