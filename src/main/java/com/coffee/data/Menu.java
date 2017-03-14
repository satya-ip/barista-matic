package com.coffee.data;
public class Menu {
	
	private Integer drinkNumber;
	private String drinkName;
	private Double drinkCost;
	private Boolean inStock;
	
	public Menu() {
	    super();
	}
	
	public Menu(Integer drinkNumber, String drinkName, Double drinkCost, Boolean inStock) {
		super();
		this.drinkNumber = drinkNumber;
		this.drinkName = drinkName;
		this.drinkCost = drinkCost;
		this.inStock = inStock;
	}
	public Integer getDrinkNumber() {
		return drinkNumber;
	}
	public void setDrinkNumber(Integer drinkNumber) {
		this.drinkNumber = drinkNumber;
	}
	public String getDrinkName() {
		return drinkName;
	}
	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	public Double getDrinkCost() {
		return drinkCost;
	}
	public void setDrinkCost(Double drinkCost) {
		this.drinkCost = drinkCost;
	}
	public Boolean getInStock() {
		return inStock;
	}
	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}
	@Override
	public String toString() {
		return "Menu [drinkNumber=" + drinkNumber + ", drinkName=" + drinkName + ", drinkCost=" + drinkCost
				+ ", inStock=" + inStock + "]";
	}
}
