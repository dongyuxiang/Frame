package com.dyx.spring.set;


import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoyConstructor {
	private static Logger logger=Logger.getLogger(BoyConstructor.class);
	//�����ӿ����͵����ã��;���ʵ��������
	private GirlFriend girlFriend;
	private static ApplicationContext ctx;
	public BoyConstructor(){
		
	}
	//����ΪgirlFriend���Ը�ֵ�Ĺ��췽��
	
	public BoyConstructor(GirlFriend girlFriend){
		this.girlFriend=girlFriend;
	}
	public static void main(String[] args){
		ctx=new ClassPathXmlApplicationContext("aplc-set.xml");
		BoyConstructor boy=(BoyConstructor) ctx.getBean("boyConstructor");
		logger.info(boy.girlFriend.speak());
	}
}
