package nLayeredDemo.entities.conceretes;

import nLayeredDemo.entities.abstracts.Entity;

public class Product implements Entity{
	private int id;
	private int categoryId;
	private int unitsInStock;
	private double unitPrice;
	private String name;	
	
	public Product() {}
	
	public Product(int id, int categoryId, int unitsInStock, double unitPrice, String name) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.unitsInStock = unitsInStock;
		this.unitPrice = unitPrice;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
