package com.coffee.data;

public class IngredientPrice {
	
	private String ingredientName;
	private double price ;
	
	public IngredientPrice() {
	    super();
	}

	public IngredientPrice(String ingredientName, double price) {
		super();
		this.ingredientName = ingredientName;
		this.price = price;
	}
	
	public String getIngredientName() {
		return ingredientName;
	}
	
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "IngredientPrice [ingredientName=" + ingredientName + ", price=" + price + "]";
	}
}
