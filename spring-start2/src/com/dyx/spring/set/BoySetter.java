package com.dyx.spring.set;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.Getter;
import lombok.Setter;

public class BoySetter {
	private static Logger logger=Logger.getLogger(BoySetter.class);
	
	//�����ӿ����͵����ú;���ʵ��������
	@Setter@Getter
	private GirlFriend girlFriend;
	private static ApplicationContext ctx;
	
	public static void main(String[] args) {
		ctx =new ClassPathXmlApplicationContext("aplc-set.xml");
		BoySetter boy=(BoySetter) ctx.getBean("boySetter");
		logger.info(boy.girlFriend.speak());
	}

}
