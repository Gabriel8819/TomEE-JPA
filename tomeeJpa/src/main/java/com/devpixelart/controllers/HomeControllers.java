package com.devpixelart.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.devpixelart.ejb.PersonDao;
import com.devpixelart.entities.Person;


@WebServlet("/home")
public class HomeControllers extends HttpServlet{
	
//	@Resource
//	private DataSource myDatasource;
	
	
	@EJB
	private PersonDao personDao;
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		
		out.println("Tomcat ee servlet home");
		
		
		Person person = personDao.findPerson(22);
		out.println(person.getPassword());

		
		Person person2 = new Person();
		person2.setUsername("Gabriel");
		person2.setPassword("123456");
		
		personDao.createPerson(person2);
		
		
		
		
		
		
//		Context ctx;
//		try {
//			ctx = new InitialContext();
//			DataSource ds = (DataSource) ctx.lookup("java:comp/env/myDs");
//			
//			Connection conn = myDatasource.getConnection();
//			Statement stmt = conn.createStatement();
//			ResultSet set = stmt.executeQuery("select * from users;");
//			
//			while(set.next()) {
//				out.println(set.getString(2));
//			}
//			
//			
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
	}
	

}
