package com.demo.reflection.method;

import com.demo.reflection.model.Person;

/**
* @author wudi
* @version ����ʱ�䣺2018��5��14�� ����10:27:47
* @ClassName ������
* @Description ������
*/
public class MethodTest {
       
	public void getPersonInfo(){
		Person person = new Person();
		person.setName("wudi");
		person.setSex("men");
		person.setAge(28);
		System.out.println(person);
	}
	
	
	public void getPersonByGuid(String guid){
		Person person = new Person();
		person.setGuid(guid);
		person.setName("keke");
		person.setSex("woman");
		person.setAge(28);
		System.out.println(person);
	}
	
	
	
	
}
