package com.demo.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.demo.reflection.method.MethodTest;
import com.demo.reflection.model.Person;

/**
* @author wudi
* @version 创建时间：2018年5月11日 下午10:59:14
* @ClassName 类名称
* @Description 类描述
*/
public class ReflectionTest {
      
	/**
	 * 获取类的 Class 对象
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
	
	/**
	 * 获得函数方法
	 */
	public static void getFields(){
		String fieldName = "fieldName:";
		Field[] fields = Person.class.getDeclaredFields();
		for (Field field : fields) {
			String name = field.getName();
			fieldName+=name+",";
		}
		System.out.println(fieldName);
	}
	
	public static void MethodMainTest(){
		
		try {
			 Constructor<MethodTest> constructor = MethodTest.class.getConstructor();
			 MethodTest methodTest = constructor.newInstance();
			 Method method = MethodTest.class.getMethod("getPersonByGuid", String.class);
			 method.invoke(methodTest, "901123");
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}catch (InstantiationException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 构造函数测试
	 */
    public static void ConstructTest(){
    	try {
			Constructor<Person> constructor = Person.class.getConstructor(String.class,String.class,Integer.class);
			Person person = constructor.newInstance("wudi","men",28);
			System.out.println(person);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	
	
	public static void main(String[] args) {
		createClassInstance(); //新建实例
		getFields(); //获得对应实体类的方法
		MethodMainTest();//获得对应的方法，并反射到对应的方法
		ConstructTest(); //构造方法获得
	}
	
}
