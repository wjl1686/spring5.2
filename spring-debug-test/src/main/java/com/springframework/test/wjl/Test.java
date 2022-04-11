package com.springframework.test.wjl;

import com.springframework.test.wjl.config.AppConfig;
import com.springframework.test.wjl.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public   class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("容器启动完成");
		UserService userService = applicationContext.getBean(UserService.class);
		System.out.println(userService);
		Object customerFactoryBean = applicationContext.getBean("customerFactoryBean");
		System.out.println(customerFactoryBean);

		Object customerFactoryBean$ = applicationContext.getBean("&customerFactoryBean");
		System.out.println(customerFactoryBean$);
	}
}
