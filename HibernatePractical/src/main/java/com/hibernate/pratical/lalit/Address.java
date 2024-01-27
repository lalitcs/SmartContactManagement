package com.hibernate.pratical.lalit;

import java.util.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
//@Table(name="Address_Table")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	@Column(name = "Name")
	private String name;
	@Column(name = "STREET", length = 50)
	private String street;
	@Column(name = "CITY")
	private String city;

	private boolean isOpen;
	@Transient
	private double x;
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	@Lob
	private byte[] image;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Address(int addressId, String name, String street, String city, boolean isOpen, double x, Date addedDate,
			byte[] image) {
		super();
		this.addressId = addressId;
		this.name = name;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", name=" + name + ", street=" + street + ", city=" + city
				+ ", isOpen=" + isOpen + ", x=" + x + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image)
				+ "]";
	}

}