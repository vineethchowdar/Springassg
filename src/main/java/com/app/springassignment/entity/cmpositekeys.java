package com.app.springassignment.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

import com.app.springassignment.entity.cmpositekeys;

@Embeddable
public class cmpositekeys implements Serializable{
	@Column(name = "orderNumber")
	private int orderNumber;
	@Column(name = "productCode")
	private String productCode;
	public cmpositekeys() {
		super();
	}
	public cmpositekeys(int orderNumber, String productCode) {
		super();
		this.orderNumber = orderNumber;
		this.productCode = productCode;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof cmpositekeys)) return false;
        cmpositekeys that = (cmpositekeys) o;
        return Objects.equals(getOrderNumber(), that.getOrderNumber()) &&
                Objects.equals(getProductCode(), that.getProductCode());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getOrderNumber(), getProductCode());
    }

}
