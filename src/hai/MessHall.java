package hai;

public class MessHall extends Dungeon {
	
	
	public MessHall() {
		this.setActions();
	}

	//sets the available options depending on the room version
	public void setActions() {
		actions.add (0, "exit through the door in front of you"); actions.add (1, "exit through the door behind you"); actions.add (2, "exit through the door to your left"); actions.add (3, "exit through the door to your right");
	}

	//describes the room based on the room version
	public void setRoomFunction() {
		roomFunction = "a mess hall. Windows occupy one wall, wrapping around the door. An automated serving machine occupies part of another. A layer of ice has formed over the front of it, and food packs are visible through the ice.";
	}

	//returns square or rectangle
	public void setRoomShape() {
		roomShape = "a large rectangle";
	}

	//NEED ROOM GENERATOR
	public void setCoordinates(int x, int y) {
		roomY1Coordinate = y;
		roomX1Coordinate = x;
		roomY2Coordinate = roomY1Coordinate + 6;
		roomX2Coordinate = roomX1Coordinate + 4;
	}

	//returns info on room size. divide room[Long/Wide]Size by six to get grid lengths
	public void setRoomSize() {
		roomArea = 24;
		roomLongSize = 36; //y
		roomWideSize = 24; //x
	}

	public void setRoomLocation() {
		roomLocation = "MessHall";
	}

}
