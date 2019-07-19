package com.cg.jpa.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.jpa.entity.Account;

public class JPQLDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		String qry = "select acc.balance from Account acc where acc.balance>40000";
		TypedQuery<Double> tq= em.createQuery(qry, Double.class);
		List<Double> ballist = tq.getResultList();
		for(Double paisa:ballist){
			System.out.println(paisa);
		}
		/*Account c1= new Account();
		c1.setAccHolderName("Nikku");
		c1.setBalance(450000);
		c1.setMobileno("1234567890");
		Account ac2=new Account();
		ac2.setAccHolderName("Nikki");
		ac2.setBalance(4500000);
		ac2.setMobileno("1234567891");
		Account ac3=new Account();
		ac3.setAccHolderName("Nikka");
		ac3.setBalance(4500);
		ac3.setMobileno("1234567892");
		Account ac4=new Account();
		ac4.setAccHolderName("Nikksy");
		ac4.setBalance(4500000);
		ac4.setMobileno("1234567893");
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(ac2);
		em.persist(ac3);
		em.persist(ac4);
		
		em.getTransaction().commit();
		System.out.println("Accounts added");*/
		
	}

}
