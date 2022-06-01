package com.ty.many.to.one.uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveAmazonOrder {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Item item1=new Item();
		item1.setName("laptop");
		item1.setPrice("20000");
		item1.setQuantity(4);
		
		Item item2=new Item();
		item2.setName("notepad");
		item2.setPrice("5000");
		item2.setQuantity(5);
		
		Item item3=new Item();
		item3.setName("markers");
		item3.setPrice("1000");
		item3.setQuantity(6);
		
		AmazonOrder amazonOrder=new AmazonOrder();
		amazonOrder.setAddress("basavanagudi");
		amazonOrder.setName("office items");
		amazonOrder.setStatus("getting prepared");
		item1.setAmazonOrder(amazonOrder);
		item2.setAmazonOrder(amazonOrder);
		item3.setAmazonOrder(amazonOrder);
		
		entityTransaction.begin();
		entityManager.persist(amazonOrder);
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityManager.persist(item3);
		entityTransaction.commit();
	}
		

}
