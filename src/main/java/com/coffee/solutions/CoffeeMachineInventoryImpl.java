package com.coffee.solutions;

import java.util.Set;
import java.util.HashSet;

import com.coffee.data.Inventory;

public class CoffeeMachineInventoryImpl implements CoffeeMachineInventory {

	public Set<Inventory> inventoryList = new HashSet<Inventory>();
	
	public void addInventory(String ingredientName, Integer ingredientQuantity) {
		Inventory inventoryData = new Inventory();
		inventoryData.setIngredientName(ingredientName); 
		inventoryData.setIngredientQuantity(ingredientQuantity);
		inventoryList.add(inventoryData);
	 }

	public void updateInventory(String ingredientName, Integer ingredientQuantity) {
		inventoryList.stream()
		.filter(s->s.getIngredientName().equals(ingredientName))
		.findAny()
		.ifPresent(s ->{ 
			if((s.getIngredientQuantity()- ingredientQuantity) >= 0 ){
				s.setIngredientQuantity( s.getIngredientQuantity() - ingredientQuantity);
			} else {
				System.out.println("Out of Stock:");;
			}
	    });
	 }
 
	public void  displayInventory() {
		System.out.println("Inventory Details");
		inventoryList.forEach(item->System.out.println("  " + item.getIngredientName() + "  "
				+ item.getIngredientQuantity()));
	 }
	
   	public void restock(String ingredientName) {
		int ingredientQuantity = 10; 
		inventoryList.stream()
		.filter(s->s.getIngredientName().equals(ingredientName))
		.findAny().ifPresent(s -> s.setIngredientQuantity( ingredientQuantity));
	 }

	public Boolean stockStatus(String ingredientName,Integer noOfUnitsRequired) {
		boolean stockStatus = inventoryList.stream()
				.filter(s->s.getIngredientName().equals(ingredientName) && s.getIngredientQuantity() > 0)
	            .anyMatch(p -> p.getIngredientQuantity() >= noOfUnitsRequired);
		return stockStatus;
	}

	public Set<Inventory> getStockDetails() {
		 return inventoryList;
	}
}
	
