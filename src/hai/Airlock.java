package hai;

public class Airlock extends Dungeon {
	
	
	public Airlock() {
		this.setActions();
	}

	//sets the available options depending on the room version
	public void setActions() {
		actions.add (0, "return through the door behind you"); actions.add (1, "open the airlock");
	}

	
	//describes the room based on the room version
	public void setRoomFunction() {
		roomFunction = "a room with a very large, very heavy door opposite you. A sign on the wall says 'Airlock', and there is a red lever on the wall";
	}
	
	//returns square or rectangle
	public void setRoomShape() {
		roomShape = "a small square";
	}

	public void setCoordinates(int x, int y) {
		roomY1Coordinate = y;
		roomX1Coordinate = x;
		roomY2Coordinate = roomY1Coordinate + 3;
		roomX2Coordinate = roomX1Coordinate + 3;
	}

	//returns info on room size.  divide room[Long/Wide]Size by six to get grid lengths
	public void setRoomSize() {
		roomArea = 9;
		roomLongSize = 18; //y
		roomWideSize = 18; //x
	}

	public void setRoomLocation() {
		roomLocation = "Airlock";
	}

}
