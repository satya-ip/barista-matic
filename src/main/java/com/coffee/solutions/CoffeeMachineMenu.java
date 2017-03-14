package com.coffee.solutions;

import java.util.List;

import com.coffee.data.IngredientDetails;

public interface CoffeeMachineMenu {
	
	public void addMenu(Integer drinkNumber,String drinkName,Double drinkCost,Boolean inStock);
    public void updateMenu(CoffeeMachineInventory inventory) ;
    public void displayMenu();
    public void orderDrink(CoffeeMachineInventory inventory,Integer drinkNumber);
    public List<IngredientDetails> ingredientDetails(Integer drinkNumber);
    public void restock(CoffeeMachineInventory inventory);
  }
