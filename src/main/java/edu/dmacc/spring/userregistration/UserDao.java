package edu.dmacc.spring.userregistration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class UserDao {

	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("UserRegistration");
	
	public void insertUser(User userToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(userToAdd);
		em.getTransaction().commit();
		em.close();
	}

	public List<User> getAllUsers() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select u from User u";
		TypedQuery<User> typedQuery = em.createQuery(q,User.class);
		List<User> all = typedQuery.getResultList();
		return all;
	}
	
}
