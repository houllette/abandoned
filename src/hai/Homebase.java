package hai;

public class Homebase extends Dungeon {

	
	public Homebase() {
		
		this.setCoordinates(777, 777); //numbers for this don't matter because it will always be the same for homebase
		this.setRoomLocation();
		this.setActions();
		
	}
	
	public void setActions() {
		actions.add(0, "Exit through the door to your left"); actions.add(1, "Exit through the door to your right"); actions.add(2, "Access storage chest"); actions.add(3, "Examine escape pods"); actions.add(4, "Search room"); actions.add(5, "Sleep");
		//results.add(0, "");
	}
	
	
	
	public void setRoomFunction() {
		roomFunction = "your base of operations";
	}
	
	public void setRoomShape() {
		roomShape = "a medium rectangle";
	}
	
	public void setCoordinates(int x, int y) {
		roomX1Coordinate = 0;
		roomY1Coordinate = 0;
		roomX2Coordinate = 6;
		roomY2Coordinate = 3;
	}
	
	public void setRoomSize() {
		int firstSide = Math.abs(roomY1Coordinate-roomY2Coordinate);
		int secondSide = Math.abs(roomX1Coordinate-roomX2Coordinate);
		roomArea = firstSide * secondSide;
		
		if (firstSide >= secondSide) {
			roomLongSize = secondSide;
			roomWideSize = firstSide;
		} else {
			roomLongSize = firstSide;
			roomWideSize = secondSide;
		}
	}
	
	public void setRoomLocation() {
		roomLocation = "Homebase";
	}
}
