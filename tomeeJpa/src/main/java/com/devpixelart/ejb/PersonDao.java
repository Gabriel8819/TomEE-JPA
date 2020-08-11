package com.devpixelart.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.devpixelart.entities.Person;

@Stateless
public class PersonDao {

	
	@PersistenceContext(unitName = "myPu")
	private EntityManager em;
	
	public Person findPerson(int id) {
		return em.find(Person.class, id);
	}
	
	public void createPerson(Person person) {
		em.persist(person);
	}
	
	
	
	
}
