package com.dyx.spring.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static ApplicationContext ctx;
	
	public static void main(String[] args) {
		ctx=new ClassPathXmlApplicationContext("aplc-type.xml");
		DataType entity =(DataType) ctx.getBean("dataType");
		entity.printValue();
	}
}
