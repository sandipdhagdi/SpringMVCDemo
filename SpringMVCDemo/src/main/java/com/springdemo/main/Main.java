package com.springdemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.account.Account;

public class Main {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Account account = context.getBean("account", Account.class);
		account.getInfo();
	}
}
