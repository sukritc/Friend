package com.sudhir.rest;

import java.util.List;

//import com.demo.SpringRestCrud.Employee;

//import com.test.HelloSpring.entity.Employee;

public interface CustDao {
	
	//public List<Employee> show();

public Customer save(Customer emp);
	
	
	
	
	
	
	
	
	public List<Customer> findAll();
	
	
	
	


	Customer findById(long id);





	void deleteById(long id);








	Customer update( Customer cus,int id);

}
