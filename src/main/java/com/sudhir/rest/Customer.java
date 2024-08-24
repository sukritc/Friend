package com.sudhir.rest;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="cusrewards")
public class Customer {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cusid")
    private int id;

    @Column(name="name")
    private String name;
    
    @Column(name="transaction_amt")
    private int trnamount;
    
    @Column(name="points")
    private int points;
    @Column(name="time")
    private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTrnamount() {
		return trnamount;
	}
	public void setTrnamount(int trnamount) {
		this.trnamount = trnamount;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Customer(String name, int trnamount, int points, Date date) {
		
		this.name = name;
		this.trnamount = trnamount;
		this.points = points;
		this.date = date;
	}
public Customer()

{
	
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", trnamount=" + trnamount + ", points=" + points + ", date="
			+ date + "]";
}
  
}