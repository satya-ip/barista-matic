package com.coffee.main;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.coffee.data.IngredientPrice;
import com.coffee.solutions.CoffeeMachineInventory;
import com.coffee.solutions.CoffeeMachineInventoryImpl;
import com.coffee.solutions.CoffeeMachineMenu;
import com.coffee.solutions.CoffeeMachineMenuImpl;

public class CoffeeMainApp {

	public static void main(String[] args) {
	
    CoffeeMachineInventory addInventory = new CoffeeMachineInventoryImpl();
	addInventory.addInventory("Cocoa", 10);
	addInventory.addInventory("Coffee", 10);
	addInventory.addInventory("Decaf Coffee",10);
	addInventory.addInventory("Cream",10);
	addInventory.addInventory("Espresso",10);
	addInventory.addInventory("Foamed Milk",10);
	addInventory.addInventory("Steamed Milk",10);
	addInventory.addInventory("Sugar",10);
	addInventory.addInventory("Whipped Cream",10 );
	
    CoffeeMachineMenu addMenu = new CoffeeMachineMenuImpl();
    addMenu.addMenu(1,"Caffe Americano",3.30,true);
    addMenu.addMenu(2,"Caffe Latte",2.55,true);
    addMenu.addMenu(3,"Caffe Mocha",3.35,true);
    addMenu.addMenu(4,"Cappuccino",2.90,true);
    addMenu.addMenu(5,"Coffee",2.75,true);
    addMenu.addMenu(6,"Decaf Coffee",2.75,true );
    
    List<IngredientPrice> price =new ArrayList<IngredientPrice>();
    price.add(new IngredientPrice("Coffee",0.75));
    price.add(new IngredientPrice("Decaf Coffee", 0.75));
    price.add(new IngredientPrice("Sugar",0.25));
    price.add(new IngredientPrice("Cream",0.25));
    price.add(new IngredientPrice("Steamed Milk",0.35));
	price.add(new IngredientPrice("Foamed Milk", 0.35));
	price.add(new IngredientPrice("Espresso", 1.10));
	price.add(new IngredientPrice("Cocoa", 0.90));
    price.add(new IngredientPrice("Whipped Cream" ,1.00));
    
    Scanner scanner = new Scanner(System.in);
    String input = "";
    try{
    while(!input.equalsIgnoreCase("q")){
    	 //System.out.print("Enter the drink number: ");
	     int drinkNumber = scanner.nextInt();
	     addMenu.orderDrink(addInventory,drinkNumber);
	     addInventory.displayInventory();
	     addMenu.displayMenu();
	     //System.out.print("Enter the option: ");
	     input = scanner.next();
	     if(input.equals("r")){
	    	 addMenu.restock(addInventory);; 
	    	 addInventory.displayInventory();
		     addMenu.displayMenu();
	     }
	   }
    } catch(InputMismatchException e){   
        System.out.println("Your input is not a number");
       }
   }
}
	


