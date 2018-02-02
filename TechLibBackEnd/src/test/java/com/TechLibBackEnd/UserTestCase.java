/*package com.TechLibBackEnd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.UserDao;
import com.Model.USer;

public class UserTestCase {
	
	private static AnnotationConfigApplicationContext context;

	private static UserDao userDao;

	private USer user;
	
	@BeforeClass
	public static void init(){
		
		context= new  AnnotationConfigApplicationContext();
		context.scan("com.TechLibBackEnd");
		context.refresh();
		userDao=(UserDao)context.getBean("userDao");
	}
	
	@Test
	public void testAddUser()
	{
		user=new USer("pratibha","abc123","pqr@gmail.com","mumbai","9853356379");
		assertEquals("successfully added",true);
	}
	
}
*/