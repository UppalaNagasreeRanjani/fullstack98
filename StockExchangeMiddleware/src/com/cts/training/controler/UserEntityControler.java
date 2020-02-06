package com.cts.training.controler;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cts.trainin.model.UserEntity;

public class UserEntityControler {
	public static void main(String[] args) {
		//BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("example.xml"));
		ApplicationContext context=new ClassPathXmlApplicationContext("example.xml");
		UserEntity entity=(UserEntity)context.getBean("user");
		System.out.println(entity.getEmail()+":"+entity.getPhone());
			
			
			
	}

}
