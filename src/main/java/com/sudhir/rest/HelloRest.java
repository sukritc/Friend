package com.sudhir.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloRest {

    private CustDao dao;

    @Autowired
     public HelloRest(CustDao dao) {
		// TODO Auto-generated constructor stub
	 
        this.dao=dao;
    }

    @GetMapping("/getall")
    public List<Customer>  getAll(@RequestBody Customer em)
    {
    	
    	
    	
    	
    	
    	List<Customer>   lemp=dao.findAll();
    	
    	
    	
    	return lemp;
    	
    	

    	
    	
    }
    
    
    @PostMapping("/saveq")
    public Customer sve(@RequestBody Customer empl)
    {
    	
    	//empl.setId(0);
    	
    	Customer qi=dao.save(empl);
    	
    	return qi;
    }
    
    
    @PutMapping("/upd/{id}")
    public Customer update4(@PathVariable("id") int id,@RequestBody Customer cus)
    {
    	
    	
    	cus.setId(id);
    	Customer qq=dao.update(cus, id);
    	
    	return qq;
    }
    
    
    
    
 
}
