package hai;

public class OneByOne extends Dungeon {
	
	private int version;
	
	public OneByOne(int numberBlank) {
		version = numberBlank; //EXPAND VERSION TO EXTREME>  VERSION ALWEAYS SAME
		this.setActions();
	}
	
	//sets the available options depending on the room version
	public void setActions() {
		switch(version) {
			case 1: actions.add (0, "go through the door behind you"); actions.add (1, "open cuboard to your left"); actions.add (2, "open cuboard in front of you"); actions.add (3, "open cubord to your right"); break;
			case 2: actions.add (0, "go through the door behind you"); actions.add (1, "go through door across from you"); break;
			case 3: actions.add (0, "go through the door behind you"); actions.add (1, "open the cuboard to your left"); break;
			case 4: actions.add (0, "go through the door behind you"); break;
			case 5: actions.add (0, "go through the door behind you"); actions.add (1, "open the door to your right"); break;
			case 6: actions.add (0, "go through the door behind you"); actions.add (1, "open the door to your left"); break;
			case 7: actions.add (0, "go through the door behind you"); actions.add (1, "open the door to your left"); actions.add (1, "open the door in front of you"); actions.add (1, "open the door to your right"); break;
		}
	}

	//describes the room based on the room version
	public void setRoomFunction() {
		switch(version) {
			case 1: roomFunction = "a small storage room"; break;
			case 2: roomFunction = "a small connecting room"; break;
			case 3: roomFunction = "a small closet"; break;
			case 4: roomFunction = "an empty room"; break;
			case 5: roomFunction = "a small connector room"; break;
			case 6: roomFunction = "a small connector room"; break;
			case 7: roomFunction = "a small connector hub"; break;	
		}
	}
	
	//returns square or rectangle
	public void setRoomShape() {
		roomShape = "square";
	}

	//NEED ROOM GENERATOR
	public void setCoordinates(int x, int y) {
		roomY1Coordinate = y;
		roomX1Coordinate = x;
		roomY2Coordinate = roomY1Coordinate + 1;
		roomX2Coordinate = roomX1Coordinate + 1;
	}

	//returns info on room size.
	public void setRoomSize() {
		roomArea = 1;
		roomLongSize= 6;
		roomWideSize = 6;
	}

	public void setRoomLocation() {
		roomLocation = "OneByOne";
	}

}
