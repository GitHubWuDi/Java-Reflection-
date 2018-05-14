package com.demo.reflection.method;

import com.demo.reflection.model.Person;

/**
* @author wudi
* @version 创建时间：2018年5月14日 下午10:27:47
* @ClassName 类名称
* @Description 类描述
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
