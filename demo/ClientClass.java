package com.cg.jpa.demo;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.cg.jpa.entity.*;
import com.cg.jpa.entity.Student;

public class ClientClass {
public static void main(String[] args) {
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = emf.createEntityManager();
	/*em.getTransaction().begin();
	Student s1= new Student();
	s1.setName("Amit");
	s1.setEmailid("amit@gmail.com");
	em.persist(s1);
	em.flush();
	s1.setName("blah blah");
	s1.setEmailid("gah gah");
	em.persist(s1);
	em.flush();
	System.out.println("Record added:"+s1.getRollno());
	em.getTransaction().commit();
	Student s2 = em.find(Student.class, 1);
	Student s3 = new Student();
	s3.setRollno(3);
	s3.setName("Yashika Priya");
	s3.setEmailid("yashipriya17@gmail.com");
	em.getTransaction().begin();
	em.merge(s3);
	System.out.println("updated");
	em.getTransaction().commit();*/
	Student s4 = em.find(Student.class, 3);
	em.getTransaction().begin();
	em.remove(s4);
	System.out.println("deleted");
	em.getTransaction().commit();
	
	//System.out.println("Roll no is: "+s2.getRollno());
	//System.out.println("Name is: "+s2.getName());
	//System.out.println("Email Id is: "+s2.getEmailid());
}
}
