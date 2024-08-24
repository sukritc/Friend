package com.sudhir.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//import com.demo.SpringRestCrud.Employee;

import jakarta.persistence.Entity;

//import com.test.HelloSpring.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class Custdaoimpl implements CustDao {
	//  private EntityManager entityManager;

	  private EntityManager entityManager;


	    // set up constructor injection
		
		 @Autowired public Custdaoimpl(EntityManager theEntityManager)
		 {
			 entityManager
			 = theEntityManager; 
		 }


		@Override
		public List<Customer> findAll() {
			// TODO Auto-generated method stub
			TypedQuery<Customer> theQuery =
				         entityManager.createQuery("from Customer", Customer.class);
					 
					            // execute query and get result list
					  
					  
					            List<Customer> cust = theQuery.getResultList();
					  
					            return cust; 
					            
		
		}


		@Override
		public Customer save(Customer emp) {
			// TODO Auto-generated method stub
			Customer cu=entityManager.merge(emp);
			
			return cu;
		}


		@Override
		public Customer findById(long id) {
			// TODO Auto-generated method stub
			Customer emp=entityManager.find(Customer.class, id);
			Customer emplo=new Customer();
			
			
			return emplo;
		}


		@Override
		public void deleteById(long id) {
			// TODO Auto-generated method stub
			
		}

          @Transactional
		@Override
		public Customer update( Customer cus,int id) {
			// TODO Auto-generated method stub
	Customer cus1=entityManager.find(Customer.class, id);
	
	
// dd is name of single person which is twice		

	if(cus1.getTrnamount()>100)
	{
		
		
		
		cus1.setPoints((cus1.getTrnamount()-100)*2+(1*50));
		
	}
	
	Customer cuss=entityManager.merge(cus1);
	
	return cuss;
          }

		
}


