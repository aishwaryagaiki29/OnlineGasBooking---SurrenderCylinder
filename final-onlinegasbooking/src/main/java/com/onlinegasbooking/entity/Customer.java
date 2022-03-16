package com.onlinegasbooking.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "egas_customer")

public class Customer {

	@Id

	@GeneratedValue
	private Integer customerId;

	@Column(name = "user_name", length = 25, nullable = false)
	private String userName;

	@Column(name = "mob_number", length = 10, nullable = false, unique = true)
	private String mobileNumber;

	@Column(name = "email", length = 30, nullable = false, unique = true)
	private String email;

	@Column(name = "aadhar_card", length = 12, unique = true)
	private String aadharCard;

	@Column(name = "address", nullable = false, length = 80)
	private String address;

	@Column(name = "city", nullable = false, length = 20)
	private String city;

	@Column(name = "connection_status", nullable = false, length = 10)
	private String connectionStatus;

	@OneToMany(mappedBy = "customer")
	private Set<GasBooking> gasBookings = new HashSet<GasBooking>();

	@OneToOne(cascade = CascadeType.ALL)
	private Cylinder cylinder;

	public Customer() {
		super();
	}

	public Customer(Integer customerId, String userName, String mobileNumber, String email, String aadharCard,
			String address, String city, String connectionStatus, Set<GasBooking> gasBookings, Cylinder cylinder) {
		super();
		this.customerId = customerId;
		this.userName = userName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.aadharCard = aadharCard;
		this.address = address;
		this.city = city;
		this.connectionStatus = connectionStatus;
		this.gasBookings = gasBookings;
		this.cylinder = cylinder;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getConnectionStatus() {
		return connectionStatus;
	}

	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	public Set<GasBooking> getGasBookings() {
		return gasBookings;
	}

	public void setGasBookings(Set<GasBooking> gasBookings) {
		this.gasBookings = gasBookings;
	}

	public Cylinder getCylinder() {
		return cylinder;
	}

	public void setCylinder(Cylinder cylinder) {
		this.cylinder = cylinder;
	}

}