package com.devpixelart.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Properties;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;

import org.junit.jupiter.api.Test;

import com.devpixelart.ejb.PersonDao;

public class PersonDaoTest {

	@Test
	public void testPersist() throws NamingException {
		Properties p = new Properties();
		p.put("myDatasource", "new://Resource?type=DataSource");
		p.put("myDatasource.jdbcUrl", "jdbc:mysql://localhost/javaee");
		p.put("myDatasource.jdbcDriver", "com.mysql.cj.jdbc.Driver");
		
		Context context = EJBContainer.createEJBContainer(p).getContext();
		PersonDao personDao = (PersonDao) context.lookup("java:global/PersonDao");
		
		assertEquals("Charlie", personDao.findPerson(22) );
		
	}
	
}
