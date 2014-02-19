package hai;

public class GeneratorRoom extends Dungeon {
	
	
	public GeneratorRoom() {
		this.setActions();
	}

	//sets the available options depending on the room version
	public void setActions() {
		actions.add (0, "Go through the right-hand door"); actions.add (1, "Go through the left-hand door"); actions.add (2, "Search the first crate"); actions.add (3, "Search the second crate");
	}

	//describes the room based on the room version
	public void setRoomFunction() {
		roomFunction = "a room with an electrical generator in the center of the floor and two crates pushed up against the wall. A low hum reverberates throughout and the entire room is dimly illuminated by a red glow ";
	}

	//returns square or rectangle
	public void setRoomShape() {
		roomShape = "a medium square";
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
		roomLocation = "GeneratorRoom";
	}

}
