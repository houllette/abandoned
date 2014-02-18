package hai;

import java.util.ArrayList;

public class Homebase extends Dungeon{

	
	public Homebase() {
		
		this.setCoordinates(777, 777); //numbers for this don't matter because it will always be the same
		this.setRoomLocation();
		this.setActions();
		
	}
	
	public void setActions() {
		actions.add(0, "Exit through the door to your left"); actions.add(1, "Exit through the door to your right"); actions.add(2, "Access storage chest"); actions.add(3, "Examine escape pods"); actions.add(4, "Search room"); actions.add(5, "Sleep");
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
		roomArea = Math.abs(roomY1Coordinate-roomY2Coordinate) * Math.abs(roomX1Coordinate-roomX2Coordinate);
	}
	
	public void setRoomLocation() {
		roomLocation = "Homebase";
	}
}
