package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rays.bean.Person;
import com.rays.bean.UserBean;

public class TestMultiple {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Multiple.xml");

		UserBean user = (UserBean) context.getBean("user"); // context.getBean(UserBean.class);

		Person person = (Person) context.getBean("PersonBean"); // context.getBean(Person.class);

		System.out.println("User Name: " + user.getLogin());
		System.out.println("User Password: " + user.getPassword());
		System.out.println("Person Name: " + person.getName());
	}

}