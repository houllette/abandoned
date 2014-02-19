package hai;

public class Laboratory extends Dungeon {
	
	
	public Laboratory() {
		this.setActions();
	}

	//sets the available options depending on the room version
	public void setActions() {
		actions.add (0, "Go through the door on the right"); actions.add (1, "Go through the door on the left"); actions.add (2, "Search the drawers on the right"); actions.add (3, "search the drawers on the left"); 
	}


public void setRoomFunction() //describes the room based on the room version
	{
	roomFunction = "a research laboratory. Steel tables line the walls. You notice drawers built into the tables";
	}

	//returns square or rectangle
	public void setRoomShape() {
		roomShape = "a medium rectangle";
	}

	//NEED ROOM GENERATOR
	public void setCoordinates(int x, int y) {
		roomY1Coordinate = y;
		roomX1Coordinate = x;
		roomY2Coordinate = roomY1Coordinate + 4;
		roomX2Coordinate = roomX1Coordinate + 4;
	}

	//returns info on room size. divide room[Long/Wide]Size by six to get grid lengths
	public void setRoomSize() {
		roomArea = 16;
		roomLongSize = 24; //y
		roomWideSize = 24; //x
	}

	public void setRoomLocation() {
		roomLocation = "Laboratory";
	}

}
