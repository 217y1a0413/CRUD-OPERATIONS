package com.codegnan.model;

public class Pharmacy {
	private int id;
	private String name;
    private String expiryDate;
	private double price;
    private int quantity;
	public Pharmacy() {
		super();
	}
	public Pharmacy(int id, String name, String expiryDate, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.expiryDate = expiryDate;
		this.price = price;
		this.quantity = quantity;
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
	
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate=expiryDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Pharmacy [id : " + id + ", name : " + name + ", Expiry Date : " +expiryDate + " , Price : " + price + " , Quantity : " + quantity +"]";



}
}
