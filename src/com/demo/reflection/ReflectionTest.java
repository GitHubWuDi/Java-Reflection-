package com.demo.reflection;

import java.util.UUID;

import com.demo.reflection.model.Person;

/**
* @author wudi
* @version ����ʱ�䣺2018��5��11�� ����10:59:14
* @ClassName ������
* @Description ������
*/
public class ReflectionTest {
      
	/**
	 * ��ȡ��� Class ����
	 */
	public static void createClassInstance(){
		try {
			Class<?> forName = Class.forName("com.demo.reflection.model.Person");
			Person person = (Person)forName.newInstance();
			person.setName("wudi");
			person.setAge(28);
			person.setSex("men");
			person.setGuid("891012");
			System.out.println(person);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		createClassInstance();
	}
	
}
