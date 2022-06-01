package com.ty.many.to.one.uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospital {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Branch branch1=new Branch();
		branch1.setName("BTM apolo");
		branch1.setState("karnataka");
		branch1.setPhone(1234567890);
		branch1.setCountry("india");
		
		Branch branch2=new Branch();
		branch2.setName("BTR apolo");
		branch2.setState("maharashtra");
		branch2.setPhone(345678901);
		branch2.setCountry("india");
		
		Branch branch3=new Branch();
		branch3.setName("jp nagar apolo");
		branch3.setState("karnataka");
		branch3.setPhone(1234567890);
		branch3.setCountry("india");
		
		Hospital hospital=new Hospital();
		hospital.setName("apolo");
		hospital.setWeb("www.apolo.com");
		
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		branch3.setHospital(hospital);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityTransaction.commit();
}
}
