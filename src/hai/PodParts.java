package hai;

public class PodParts extends Item {
	
	public PodParts(int partVersion) {
		
		switch(partVersion) {
		case 1: name = "Small Thrusters";
			break;
		case 2: name = "Modular Wall Sections";
			break;
		case 3: name = "Heat Shielding";
			break;
		case 4: name = "Navigational Computer";
			break;
		}
		
		this.setInfo();
		this.setSpawnChance();
		
	}
	
	public void setInfo() {
		if (this.getName() == "Small Thrusters") {
			info = "these are the small thrusters"; //WORK ON DESCRIPTION
		} else if (this.getName() == "Modular Wall Sections") {
			info = "these are the small thrusters"; //WORK ON DESCRIPTION
		} else if (this.getName() == "Heat Shielding") {
			info = "these are the small thrusters"; //WORK ON DESCRIPTION
		} else if (this.getName() == "Navigational Computer") {
			info = "these are the small thrusters"; //WORK ON DESCRIPTION
		}
	}
	
	public void setSpawnChance() {
		spawnChance = 5;
	}
}
