package com.gyojincompany.spring_4_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String configPath = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configPath);
		//스프링 컨테이너 생성(ctx)
		
		MyBMI mybmi = ctx.getBean("yourBMI", MyBMI.class);
		mybmi.printInfo();
		
		ctx.close();		
		
	}

}
