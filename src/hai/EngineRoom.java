package hai;

public class EngineRoom extends Dungeon {

	
	public EngineRoom() {
		this.setActions();
	}

	//sets the available options depending on the room version
	public void setActions() {
		actions.add (0, "go through the door to your left"); actions.add (1, "go through the door to your right"); actions.add (2, "check the crate in the far corner"); actions.add (3, "check the tool cabinate on the left wall"); actions.add (4, "check the tool cabinate on the left wall"); actions.add (5, "check the crate in the middle right of the room");
	}

	//describes the room based on the room version
	public void setRoomFunction() {
		roomFunction = "engine room";
	}

	//returns square or rectangle
	public void setRoomShape() {
		roomShape = "large square";
	}

	//NEED ROOM GENERATOR
	public void setCoordinates(int x, int y) {
		roomY1Coordinate = y;
		roomX1Coordinate = x;
		roomY2Coordinate = roomY1Coordinate + 6;
		roomX2Coordinate = roomX1Coordinate + 6;
	}
	
	//returns info on room size. divide room[Long/Wide]Size by six to get grid lengths
	public void setRoomSize()  {
		roomArea = 36;
		roomLongSize = 36; //y
		roomWideSize = 36; //x
	}

	public void setRoomLocation() {
		roomLocation = "EngineRoom";
	}

}
