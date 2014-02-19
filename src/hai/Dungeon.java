package hai;

import java.util.*;

public abstract class Dungeon {


	static String roomFunction,roomShape,roomLocation,roomDescription;
	static int roomX1Coordinate,roomY1Coordinate,roomX2Coordinate,roomY2Coordinate,roomArea,roomWideSize,roomLongSize,maxItems,maxContainers;
	static ArrayList<String> actions = new ArrayList<String>();
	static ArrayList<String> results = new ArrayList<String>();

	private boolean used = false;

	public abstract void setRoomFunction();
	public abstract void setRoomShape();
	public abstract void setCoordinates(int x, int y);		
	public abstract void setRoomSize();
	public abstract void setRoomLocation();
	public abstract void setActions();


	/* User Background Purpose --------------------------- */

	//returns the function of the dungeon.  User purpose
	public String getRoomFunction() {
		return roomFunction;
	}

	//returns shape of dungeon.  User purpose
	public String getRoomShape() {
		return roomShape;
	}

	//returns y length of room.  User purpose
	public int getRoomLongSize() {
		return roomLongSize;
	}

	//returns x length of room.  User purpose
	public int getRoomWideSize() {
		return roomWideSize;
	}


	/* User Direct Purpose --------------------------- */

	//describes next dungeon.  User purpose
	public String getRoomDescription() {
	
		if(this.getRoomLocation()=="Homebase") {
			roomDescription = "\nThis is " + roomFunction + ". The room is a "+roomShape+" room, \n"
				+ "about "+roomLongSize+" ft. long and about "+roomWideSize+" ft. wide. You can build over in the workshop \n";
		} else {
			roomDescription = "\nThe door slides open, and you walk into the next area.  A quick look around \n"
			     	+ "the room reveals it is most likely "+roomFunction+".  It is a "+roomShape+" room, \n"
			        + "about "+roomLongSize+" ft. long and about"+roomWideSize+" ft. wide.";
		}
	
		return roomDescription;
	
	}


	/* Coder Purpose --------------------------- */

	public void setUsed() {
		if(used==false) {
			used = true;
		}
	}

	public String getActions() {
		String sum="";
		for (int i=0;i<actions.size();i++) {
			if (i == 5) {
				break;
			}
			sum = sum + actions.get(i) + "\n";
		}
		return sum;
	}

	public boolean getUsed() {
		return used;
	}

	//returns area of room.
	public int getRoomArea() {
		return roomArea;
	}

	//tests if homebase or dungeon.
	public String getRoomLocation() {
		return roomLocation;
	}

	public int getMaxItems() {
		return maxItems;
	}

	public int getMaxContainers() {
		return maxContainers;
	}

	
	//bottom left coordinate of the room.  Coder purpose
	public int getRoomX1Coordinate() {
		return roomX1Coordinate;
	}
	
	//bottom left coordinate of the room.  Coder purpose
	public int getRoomY1Coordinate() {
		return roomY1Coordinate;
	}
	
	//upper right coordinate of the room.  Coder purpose
	public int getRoomX2Coordinate() {
		return roomX2Coordinate;
	}
	
	//upper right coordinate of the room.  Coder purpose
	public int getRoomY2Coordinate() {
		return roomY2Coordinate;
	}

}
