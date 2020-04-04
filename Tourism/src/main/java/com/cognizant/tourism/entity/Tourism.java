package com.cognizant.tourism.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "tourism")
public class Tourism {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//@NotEmpty(message="Name can not be empty!!")
	@Size(min=4, max=15,message = "Required!! Can't be empty")
	private String name;
	@Column(name="from_location")
	@NotEmpty(message="Required!! Can't be empty")
	private String fromLocation;
	@Column(name="to_location")
	@NotEmpty(message="Required!! Can't be empty")
	private String toLocation;
	@Min(value = 1, message = "Min 1 day package!!")
	@Max(value = 100,message="Mega package is 100 days!!")
	@Column(name = "no_of_days")
	private int noOfDays;
	@Min(value = 600,message="Starting package 600")
	@Max(value = 100000,message="Luxury package is at 100000")
	private double price;
	
	public Tourism() {
		super();
	}

	public Tourism(String name, String fromLocation, String toLocation, int noOfDays, double price) {
		super();
		this.name = name;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.noOfDays = noOfDays;
		this.price = price;
	}

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

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Tourism [id=" + id + ", name=" + name + ", fromLocation=" + fromLocation + ", toLocation=" + toLocation
				+ ", noOfDays=" + noOfDays + ", price=" + price + "]";
	}
}
