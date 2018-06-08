package com.siddharth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static ApplicationContext context;

 public static void main(String[] args) {
       
	           context = new ClassPathXmlApplicationContext("com/siddharth/Beans.xml");
               Employee obj = (Employee) context.getBean("a");
               obj.getEid();
               obj.getEname();
               obj.getEaddress();
               System.out.println();
               obj = (Employee) context.getBean("b");
               obj.getEid();
               obj.getEname();
               obj.getEaddress();
               System.out.println();
               obj = (Employee) context.getBean("c");
               obj.getEid();
               obj.getEname();
               obj.getEaddress(); 
 }

}
