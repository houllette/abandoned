package hai;

public class ServerRoom extends Dungeon {
		
	public ServerRoom() {
		this.setActions();
	}

	//sets the available options depending on the room version
	public void setActions() {
		actions.add (0, "return through the door behind you"); actions.add(1, "search storage locker on the wall beside you");
	}

	//describes the room based on the room version
	public void setRoomFunction() {
		roomFunction = "a server room, with row upon row of powerful computers";
	}

	//returns square or rectangle
	public void setRoomShape() {
		roomShape = "small rectangle";
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
		roomLocation = "ServerRoom";
	}

}
