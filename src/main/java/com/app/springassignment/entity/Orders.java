package com.app.springassignment.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.springassignment.entity.cmpositekeys;

@Entity
@Table(name = "orderdetails")

public class Orders {
	@EmbeddedId
	private cmpositekeys orderId;
	@Column(name = "quantityOrdered")
	private int quantityOrdered;
	@Column(name = "priceEach")
	private double priceEach;
	@Column(name = "orderLineNumber")
	private int orderLineNumber;
	
	
	public cmpositekeys getOrderId() {
		return orderId;
	}

	public void setOrderId(cmpositekeys orderId) {
		this.orderId = orderId;
	}

	
	public Orders() {
	
	}



	public Orders(cmpositekeys orderId, int quantityOrdered, double priceEach, int orderLineNumber) {
		super();
		this.orderId = orderId;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}



	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}

	public int getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

}
