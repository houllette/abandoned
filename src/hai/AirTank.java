package hai;

public class AirTank extends Item {
	
	public AirTank() {
		oxygenLevel = (Math.random()*10+1);
		
		name = "AirTank";
		
		this.setInfo();
		this.setSpawnChance();
	}
	
	public void setInfo() {
		info = "This is an airtank that cotains air in it, its heavy and does not \n" +
				"take up a spot on your inventory list but instead adds to your oxygen \n" +
				"level. This tank's oxygen level is " + oxygenLevel;
	}
	
	public void setSpawnChance() {
		spawnChance = 10;
	}

}
