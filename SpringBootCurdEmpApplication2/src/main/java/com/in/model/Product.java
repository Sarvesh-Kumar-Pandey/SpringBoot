package com.in.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Product_tab")
public class Product {
	@Id
	@Column(name="P_id")
 private int id;
	@Column(name = "P_name")
 private String pName;
	@Column(name="P_qty")
 private int qty;
	@Column(name="P_desc")
 private String desc;

}
