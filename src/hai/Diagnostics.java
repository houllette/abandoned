package hai;

public class Diagnostics extends Dungeon {
	
	
	public Diagnostics() {
		this.setActions();
	}

	//sets the available options depending on the room version
	public void setActions() {
		actions.add (0, "[action, doors>containers>items]");
	}

	//describes the room based on the room version
	public void setRoomFunction() {
		roomFunction = "a diagnostics room, that would normally output varius systems specs and stats. \n ";
	}

	//returns square or rectangle
	public void setRoomShape() {
		roomShape = "a medium-ish rectangle";
	}

	//NEEDS ROOM GENERATOR RESULT
	public void setCoordinates(int x, int y) {
		roomY1Coordinate = y;
		roomX1Coordinate = x;
		roomY2Coordinate = roomY1Coordinate + 4;
		roomX2Coordinate = roomX1Coordinate + 3;
	}

	//returns info on room size. divide room[Long/Wide]Size by six to get grid lengths
	public void setRoomSize() {
		roomArea = 12;
		roomLongSize = 24; //y
		roomWideSize = 18; //x
	}

	public void setRoomLocation() {
		roomLocation = "Diagnostics";
	}

}
