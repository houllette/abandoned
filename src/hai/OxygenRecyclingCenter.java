package hai;

public class OxygenRecyclingCenter extends Dungeon {
		
	public OxygenRecyclingCenter() {
		this.setActions();
	}

	//sets the available options depending on the room version
	public void setActions() {
		actions.add (0, "Go through the door on your left"); actions.add (1, "Go through the door on your right"); actions.add (2, "Search the room for oxygen tanks");
	}

	//describes the room based on the room version
	public void setRoomFunction() {
		roomFunction = "a room with four large machines occupying each corner. The sound of flowing liquid can be heard emanating from the walls. Lettering on the wall says 'oxygen recycling center'";
	}

	//returns square or rectangle
	public void setRoomShape() {
		roomShape = "a large rectangle";
	}

	//NEED ROOM GENERATOR
	public void setCoordinates(int x, int y) {
		roomY1Coordinate = y;
		roomX1Coordinate = x;
		roomY2Coordinate = roomY1Coordinate + 3;
		roomX2Coordinate = roomX1Coordinate + 6;
	}

	//returns info on room size. divide room[Long/Wide]Size by six to get grid lengths
	public void setRoomSize() {
		roomArea = 18;
		roomLongSize = 18; //y
		roomWideSize = 36; //x
	}

	public void setRoomLocation() {
		roomLocation = "OxygenRecyclingCenter";
	}

}
