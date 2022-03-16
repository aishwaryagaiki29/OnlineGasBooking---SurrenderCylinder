package com.onlinegasbooking.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

@Table(name = "egas_cylinder_connection")

public class Cylinder {

	@Id
	@GeneratedValue
	private Integer cylinderTypeId;

	@Column(name = "cylinder_type", length = 10, nullable = false)
	private String cylinderType;

	@Column(name = "weight")
	private Float weight;

	@Column(name = "price")
	private Float price;
	
	@OneToOne
	private SurrenderCylinder surrenderCylinder;

	@OneToOne(mappedBy="cylinder")
	@JsonIgnore
	private Customer customer;

	public Cylinder() {
		super();
	}

	public Cylinder(Integer cylinderTypeId, String cylinderType, Float weight, Float price,
			SurrenderCylinder surrendercylinder, Customer customer) {
		super();
		this.cylinderTypeId = cylinderTypeId;
		this.cylinderType = cylinderType;
		this.weight = weight;
		this.price = price;
		this.surrenderCylinder = surrendercylinder;
		this.customer = customer;
	}

	public Integer getCylinderTypeId() {
		return cylinderTypeId;
	}

	public void setCylinderTypeId(Integer cylinderTypeId) {
		this.cylinderTypeId = cylinderTypeId;
	}

	public String getCylinderType() {
		return cylinderType;
	}

	public void setCylinderType(String cylinderType) {
		this.cylinderType = cylinderType;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public SurrenderCylinder getSurrendercylinder() {
		return surrenderCylinder;
	}

	public void setSurrendercylinder(SurrenderCylinder surrendercylinder) {
		this.surrenderCylinder = surrendercylinder;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
