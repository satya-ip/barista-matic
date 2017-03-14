package com.coffee.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.coffee.data.IngredientDetails;
import com.coffee.data.Inventory;
import com.coffee.data.Menu;

public class CoffeeMachineMenuImpl implements CoffeeMachineMenu {
	
	public Set<Menu> menuList = new HashSet<Menu>();

	public void addMenu(Integer drinkNumber, String drinkName, Double drinkCost, Boolean inStock) {
		Menu menuData = new Menu(drinkNumber,drinkName,drinkCost,inStock);
		menuList.add(menuData);
	}

	public void displayMenu() {
		System.out.println("Menu Details");
		menuList.forEach(item->System.out.println("  " + item.getDrinkNumber() + "  "
				+ item.getDrinkName() + "  " + item.getDrinkCost() +"  " + item.getInStock()));
	}
	
	public void updateMenu(CoffeeMachineInventory inventory, Integer drinkNumber,List<IngredientDetails> details) {
		
		Set<Inventory> stockAvailable = inventory.getStockDetails();
		
		for(Menu menu : menuList ){
			boolean status = menu.getInStock();
			List<IngredientDetails> ingredientsList = ingredientDetails(menu.getDrinkNumber());	
			 for (IngredientDetails ingredients : ingredientsList){
				 String ingredientName = ingredients.getIngredientName();
				 Integer noOfUnitsRequired = ingredients.getIngredientUnit();
				 status &= inventory.stockStatus(ingredientName,noOfUnitsRequired);
			}
			menu.setInStock(status);
		}
		
	}

	public void orderDrink(CoffeeMachineInventory inventory,Integer drinkNumber) {
		
		Menu selectedDrink =  menuList.stream()
		.filter(s->s.getDrinkNumber().equals(drinkNumber))
		.findAny()									
		.orElse(null);
		
		List<IngredientDetails> ingredients = ingredientDetails(selectedDrink.getDrinkNumber()) ;
		
		if(selectedDrink.getInStock()){
			 System.out.println("Dispensing:" + selectedDrink.getDrinkName() );	
			 ingredients.stream()
			 .forEach(s -> inventory.updateInventory(s.getIngredientName(), s.getIngredientUnit()));
		 } else {
			 System.out.println("Out Of Stock:" + selectedDrink.getDrinkName() );
		 }
		 	updateMenu(inventory,selectedDrink.getDrinkNumber(),ingredients);
		}
	

	public List<IngredientDetails> ingredientDetails(Integer drinkNumber) {
       
		List<IngredientDetails> detailsList = new ArrayList<IngredientDetails>();
		
		switch(drinkNumber){
		case 1:
			detailsList.add(new IngredientDetails("Espresso", 3));
			break;
		case 2:
			detailsList.add(new IngredientDetails("Espresso", 2));
			detailsList.add(new IngredientDetails("Steamed Milk", 1));
			break;
		case 3:
			detailsList.add(new IngredientDetails("Espresso", 1));
			detailsList.add(new IngredientDetails("Steamed Milk", 1));
			detailsList.add(new IngredientDetails("Cocoa", 1));
			detailsList.add(new IngredientDetails("Whipped Cream", 1));
			break;
		case 4:
			detailsList.add(new IngredientDetails("Espresso", 2));
			detailsList.add(new IngredientDetails("Steamed Milk", 1));
			detailsList.add(new IngredientDetails("Foamed Milk", 1));
			break;
		case 5:
			detailsList.add(new IngredientDetails("Coffee",3));
			detailsList.add(new IngredientDetails("Sugar",1));
			detailsList.add(new IngredientDetails("Cream",1));
			break;
		case 6:
			detailsList.add(new IngredientDetails("Decaf Coffee", 3));
			detailsList.add(new IngredientDetails("Sugar", 1));
			detailsList.add(new IngredientDetails("Cream", 1));
			break;
		 }
		return detailsList;
	}
}

	