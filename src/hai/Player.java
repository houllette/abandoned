package hai;

import java.util.*;

public class Player {
	
	//global variables
	static double OXYGEN = 40.0; //intial value of oxygen level
	
	//private variables
	private String NAME; //name of player
	
	private String currentLocation;
	
	private double personalOxygen = OXYGEN;
	
	private final int MAX_INVENTORY = 30;
	private int inventorySpace;
	private Item inventory[] = new Item[MAX_INVENTORY+1];
	private ArrayList<Item> chest = new ArrayList<Item>();
	
	public Player(String name) {
		NAME = name;
	}
	
	public String getName() {
		return NAME;
	}
	
	public void grabItem(Item object) {
		if (object.getName() == "AirTank") {
			if (personalOxygen == OXYGEN) {
				System.out.println("Your oxygen level is at it's max!");
			} else if ((personalOxygen + object.getOxygenLevel()) >= OXYGEN) {
				personalOxygen = OXYGEN;
				System.out.println("Your oxygen level is now: " + personalOxygen);
			} else {
				personalOxygen = personalOxygen + object.getOxygenLevel();
				System.out.println("Your oxygen level is now: " + personalOxygen);
			}
		} else if (object.getName() == "OxyUpgrade") {
			this.setNewOxygenMax(object.getOxyAddon());
		} else if (inventorySpace == 30) {
			System.out.println("Your inventory is full!");
		} else {
			inventory[inventorySpace] = object;
			inventorySpace++;
		}
	}
	
	public void setNewOxygenMax(double x) {
		OXYGEN = OXYGEN + x;
	}
	
	public void setDownItems(){
		if (currentLocation != "Homebase") {
			System.out.println("You cannot place your items down here!\nYou can only deposit in the Homebase!");
		} else {
			for(int i=0;i<=inventorySpace;i++) {
				chest.add(inventory[i]);
			}
			Arrays.fill(inventory, null);
			inventorySpace = 0;
		}
	}

}
