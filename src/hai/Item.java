package hai;

public abstract class Item {
	
	//global variables
	static String info; //description of the item ex:looks, feel, weight, etc.
	static String name; //same as java file name
	static double oxygenLevel; //only used for AirTank
	static double oxyAddon; //only used for OxyUpgrade
	static int spawnChance; //max of 100
	
	//private variables
	
	//required setters
	public abstract void setInfo();
	public abstract void setSpawnChance();
	
	public int getSpawnChance() {
		return spawnChance;
	}
	
	public String getInfo() {
		return info;
	}
	
	public String getName() {
		return name;
	}
	
	//ignore the following methods
	public double getOxygenLevel() {
		return oxygenLevel;
	}
	
	public double getOxyAddon() {
		return oxyAddon;
	}
	
}
