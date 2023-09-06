package com.hospital.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hospital.dto.Hospital;



public class HospitalDao {

  public Hospital saveHospital(Hospital hospital) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sagar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		if(hospital!=null) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return hospital;
		}
		return null;
	}
  public Hospital updateHospital(Hospital hospital) {
	
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sagar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		if(hospital!=null) {
		entityTransaction.begin();
		entityManager.merge(hospital);
		entityTransaction.commit();
		return hospital;
		}
		return null;
    }


   public Hospital deleteHospital(int id) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sagar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Hospital hospital=entityManager.find(Hospital.class,id);
	
	if(hospital!=null) {
		entityTransaction.begin();
		entityManager.remove(hospital);
		entityTransaction.commit();
		return hospital;
	}
	return null;
}


   public List<Hospital> displayHospital() {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sagar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
    Query query=entityManager.createQuery("select alias from Hospital alias");
	
    return query.getResultList();
	
	}
  
   
   public Hospital loginHospital(String email,String password) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sagar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	

	  Query query= entityManager.createQuery("select alias from Hospital alias where alias.email=?1 and alias.password=?2");
	 
	  query.setParameter(1, email);
	  query.setParameter(2, password);
	  List<Hospital> list=query.getResultList();
	  
	  for(Hospital hospital:list) {
		  return hospital;
	  }
	return null;
	
}
public Hospital getHospitalById(int id) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sagar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	Hospital hospital=entityManager.find(Hospital.class,id);
	
	if(hospital!=null) {
		return hospital;
	}	
	return null;
}
}
