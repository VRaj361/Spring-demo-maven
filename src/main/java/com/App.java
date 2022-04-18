package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Userbean;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
    	System.out.println(context);
        Userbean user1=context.getBean("user",Userbean.class);
        Userbean user2=context.getBean("user",Userbean.class);
        Userbean user3=context.getBean("user",Userbean.class);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        
    }
}
