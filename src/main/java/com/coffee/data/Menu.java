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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((drinkName == null) ? 0 : drinkName.hashCode());
		result = prime * result + ((drinkNumber == null) ? 0 : drinkNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		if (drinkName == null) {
			if (other.drinkName != null)
				return false;
		} else if (!drinkName.equals(other.drinkName))
			return false;
		if (drinkNumber == null) {
			if (other.drinkNumber != null)
				return false;
		} else if (!drinkNumber.equals(other.drinkNumber))
			return false;
		return true;
	}	
}
