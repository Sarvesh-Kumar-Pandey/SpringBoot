package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "User_id")
	private Integer id;
	@Column(name = "user_name")
	private String name;
	@Column(name = "user_address")
	private String address;
	public User(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
