package com.cts.training.controler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.model.UserEntity;

public class UserAnnotationControler {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		UserEntity userEntity=(UserEntity)context.getBean("userEntity");
		List<String>emails=new ArrayList<String>(Arrays.asList("admin.gamil.com","naga@123"));
		userEntity.setEmail(emails);
		System.out.println(userEntity.getEmail());
	}

}
