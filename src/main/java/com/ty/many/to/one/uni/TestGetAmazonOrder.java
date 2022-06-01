package com.ty.many.to.one.uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.many.to.one.uni.*;

public class TestGetAmazonOrder {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Item item=entityManager.find(Item.class, 1);
		if(item != null)
		{
			System.out.println("item id is:"+item.getId());
			System.out.println("item name is:"+item.getName());
			System.out.println("item price is:"+item.getPrice());
			System.out.println("item quantity is:"+item.getQuantity());
			System.out.println("==========");
			
			AmazonOrder amazonOrder=item.getAmazonOrder();
			System.out.println("amazonOrder id is:"+amazonOrder.getId());
			System.out.println("amazonOrder address is:"+amazonOrder.getAddress());
			System.out.println("amazonOrder status is"+amazonOrder.getStatus());
		}
		else
		{
				System.out.println("No data is found");
		}
	}


}
