package hai;

public class Medbay extends Dungeon{
		
	public Medbay() {
		this.setActions();
	}

	//sets the available options depending on the room version
	public void setActions() {
		actions.add (0, "return through the door to your left"); actions.add (1, "inspect the trash can by the desk"); actions.add (2, "open the first aid box on the wall"); actions.add (3, "look for crew in the regeneration pods"); actions.add (4, "look out the expansive medbay windows"); actions.add (5, "look in the oxygen supply");
	}

	//describes the room based on the room version
	public void setRoomFunction() {
		roomFunction = "a medical bay";
	}

	//returns square or rectangle
	public void setRoomShape() {
		roomShape = "small to medium rectangle";
	}

	//NEED ROOM GENERATOR
	public void setCoordinates(int x, int y) {
		roomY1Coordinate = y;
		roomX1Coordinate = x;
		roomY2Coordinate = roomY1Coordinate + 2;
		roomX2Coordinate = roomX1Coordinate + 3;
	}

	//returns info on room size. divide room[Long/Wide]Size by six to get grid lengths
	public void setRoomSize() {
		roomArea = 6;
		roomLongSize = 12; //y
		roomWideSize = 18; //x
	}

	public void setRoomLocation() {
		roomLocation = "Medbay";
	}

}
