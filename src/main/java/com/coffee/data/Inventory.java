package com.coffee.data;

public class Inventory {
	
	private String ingredientName;
	private Integer ingredientQuantity;
	
	public String getIngredientName() {
		return ingredientName;
	}
	
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
	
	public Integer getIngredientQuantity() {
		return ingredientQuantity;
	}
	
	public void setIngredientQuantity(Integer ingredientQuantity) {
		this.ingredientQuantity = ingredientQuantity;
	}
	
	@Override
	public String toString() {
		return "Inventory [ingredientName=" + ingredientName + ", "
				+ "ingredientQuantity=" + ingredientQuantity + "]";
	}
	
	

}
