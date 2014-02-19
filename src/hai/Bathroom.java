package hai;

public class Bathroom extends Dungeon {
	
	
	public Bathroom() {
		this.setActions();
	}
	
	//sets the available options depending on the room version
	public void setActions() {
		actions.add (0, "return through the door on your left"); actions.add (1, "check the toilet"); actions.add (2, "relieve yourself"); actions.add (3, "reach your hand down the rubbish chute"); actions.add (4, "wash your hands"); actions.add (5, "*censored*");
	}

	//describes the room based on the room version
	public void setRoomFunction() {
		roomFunction = "bathroom";
	}

	//returns square or rectangle
	public void setRoomShape() {
		roomShape = "tiny square";
	}

	//NEED ROOM GENERATOR
	public void setCoordinates(int x, int y) {
		roomY1Coordinate = y;
		roomX1Coordinate = x;
		roomY2Coordinate = roomY1Coordinate + 2;
		roomX2Coordinate = roomX1Coordinate + 2;
	}

	//returns info on room size.  divide room[Long/Wide]Size by six to get grid lengths
	public void setRoomSize() {
		roomArea = 4;
		roomLongSize = 12; //y
		roomWideSize = 12; //x
	}

	public void setRoomLocation() {
		roomLocation = "Bathroom";
	}

}
