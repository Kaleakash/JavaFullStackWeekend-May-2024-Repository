package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Address;
import com.bean.Employee;
import com.config.MyConfiguration;

public class DemoTest {

	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//Address add = (Address)ac.getBean("address");
//System.out.println(add);
//add.setCity("Bangalore");
//add.setState("Kar");
//System.out.println(add);
//Employee emp1 = (Employee)ac.getBean("employee");
//System.out.println(emp1);
//ac.close();
	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
	Address add = (Address)ac.getBean("address");
	System.out.println(add);
	add.setCity("Bangalore");
	add.setState("Kar");
	System.out.println(add);
	Employee emp1 = (Employee)ac.getBean("employee");
	System.out.println(emp1);
	ac.close();
	}

}
