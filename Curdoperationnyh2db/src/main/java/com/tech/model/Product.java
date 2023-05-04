package com.tech.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	@Id
	private long id;
	private String name;
	private String desc;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Product(long id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}


}
