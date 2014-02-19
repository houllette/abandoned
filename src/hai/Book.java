package hai;

public class Book extends Item {
	int bookID;
	
	public Book(int variation) {
		//variation determines the book displayed. Current limit 3
		bookID = variation;
		
		switch(bookID) {
			case 1: name = "Captain's log";
				break;
			case 2: name = "Meatloaf Recipe";
				break;
			case 3: name = "Automated Error Message";
				break;
		}
	}
	
	public void setInfo() {
		switch(bookID) {
			case 1: info = "May 3rd- We've all been very strained for the past few days as we finish up testing on the Eberhard device. However spirits remain optimistic. May 6th- There is a slight food defecit.... We aren't due for another supply for another week. May 7th- Ground reports potential contact with a high-velocity debris field within the next 24 hours.";
				break;
			case 2: info = "Preheat oven to 350 degrees F (175 degrees C). In a large bowl, combine the beef, egg, onion, milk and bread OR cracker crumbs. Season with salt and pepper to taste and place in a lightly greased 5x9 inch loaf pan, OR form into a loaf and place in a lightly greased 9x13 inch baking dish. In a separate small bowl, combine the brown sugar, mustard and ketchup. Mix well and pour over the meatloaf. Bake at 350 degrees F (175 degrees C) for 1 hour.";
				break;
			case 3: info = "Automated Error Report from service drone 1686a0# : fatal error has occured; compromising system damage present; origin unknow; servicing suggested : ";
				break;
		}
	}
	
	public void setSpawnChance() {
		spawnChance = 0;
	}
}

