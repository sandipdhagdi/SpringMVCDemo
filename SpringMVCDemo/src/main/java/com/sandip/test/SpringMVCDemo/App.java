package com.sandip.test.SpringMVCDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sandip.test.pojos.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    	  Employee employee = (Employee) ctx.getBean("employee");
    	  employee.printName();
    }
}
