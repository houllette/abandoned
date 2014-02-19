package hai;

public class BroomCloset extends Dungeon {
		
	public BroomCloset() {
		this.setActions();
	}

	//sets the available options depending on the room version
	public void setActions() {
		actions.add (0, "Leave"); actions.add (1, "Take a broom");
	}

	 //describes the room based on the room version
	public void setRoomFunction() {
		roomFunction = "a closet, which is somewhat dingy. It has 3 walls lined with shiny, very high-tech, very expensive brand-spanking-new laser brooms. It was immediately evident that these were top of the line brooms. Obviously no expense was spared";
	}

	//returns square or rectangle
	public void setRoomShape() {
		roomShape = "tiny square";
	}

	public void setCoordinates(int x, int y) {
		roomY1Coordinate = y;
		roomX1Coordinate = x;
		roomY2Coordinate = roomY1Coordinate + 1;
		roomX2Coordinate = roomX1Coordinate + 1;
	}

	//returns info on room size.  divide room[Long/Wide]Size by six to get grid lengths
	public void setRoomSize() {
		roomArea = 1;
		roomLongSize = 6; //y
		roomWideSize = 6; //x
	}

	public void setRoomLocation() {
		roomLocation = "BroomCloset";
	}

}
