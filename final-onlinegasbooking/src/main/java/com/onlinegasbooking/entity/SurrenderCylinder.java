package com.onlinegasbooking.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

/*********************************************************************************************
 *          @author          Aishwarya Gaiki
 *          Description      It is an entity class for SurrenderCylinder. It contains fields 
 *                           for surrenderId and surrenderDate        
 *          Version          1.0     
 *          Created Date     08 - March - 2021
 **********************************************************************************************/

public class SurrenderCylinder {

	@Id
	@GeneratedValue
	private Integer surrenderId;

	@Column(name = "surrender_date")
	private LocalDate surrenderDate;
	
	@OneToOne
	@JsonIgnore
    private Cylinder cylinder;

	public SurrenderCylinder() {
		super();
	}

	public SurrenderCylinder(Integer surrenderId, LocalDate surrenderDate, Cylinder cylinder) {
		super();
		this.surrenderId = surrenderId;
		this.surrenderDate = surrenderDate;
		this.cylinder = cylinder;
	}

	public Integer getSurrenderId() {
		return surrenderId;
	}

	public void setSurrenderId(Integer surrenderId) {
		this.surrenderId = surrenderId;
	}

	public LocalDate getSurrenderDate() {
		return surrenderDate;
	}

	public void setSurrenderDate(LocalDate surrenderDate) {
		this.surrenderDate = surrenderDate;
	}

	
	

	public Cylinder getCylinder() {
		return new Cylinder();
	}

	public void setCylinder(Cylinder cylinder) {
		this.cylinder = cylinder;
	}

	



	
}
