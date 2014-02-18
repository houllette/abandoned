package hai;

import java.util.*;

public abstract class Dungeon 
{


static String roomFunction,roomShape,roomLocation,roomDescription;
static int roomX1Coordinate,roomY1Coordinate,roomX2Coordinate,roomY2Coordinate,roomArea,roomWideSize,roomLongSize,maxItems,maxContainers;
static ArrayList<String> actions = new ArrayList<String>();

private boolean used = false;

public abstract void setRoomFunction();
public abstract void setRoomShape();
public abstract void setCoordinates(int x, int y);
public abstract void setRoomSize();
public abstract void setRoomLocation();
public abstract void setActions();



/* User Background Purpose --------------------------- */

public String getRoomFunction() //returns the function of the dungeon.  User purpose
	{
	return roomFunction;
	}

public String getRoomShape() //returns shape of dungeon.  User purpose
	{
	return roomShape;
	}

public int getRoomLongSize() //returns y length of room.  User purpose
	{
	return roomLongSize;
	}

public int getRoomWideSize() //returns x length of room.  User purpose
	{
	return roomWideSize;
	}


/* User Direct Purpose --------------------------- */

public String getRoomDescription() //describes next dungeon.  User purpose
	{
	
	if(this.getRoomLocation()=="Homebase") {
		roomDescription = "\nThis is " + roomFunction + ". The room is a "+roomShape+" room, \n"
				+ "about "+roomLongSize+" ft. long and about"+roomWideSize+" ft. wide. You can build over in the workshop \n";
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

public int getRoomArea() //returns area of room.  Coder purpose
	{
	return roomArea;
	}

public String getRoomLocation() //tests if homebase or dungeon.  Coder Purpose
	{
	return roomLocation;
	}

public int getMaxItems()
	{
	return maxItems;
	}

public int getMaxContainers()
	{
	return maxContainers;
	}


public int getRoomX1Coordinate() //bottom left coordinate of the room.  Coder purpose
	{
	return roomX1Coordinate;
	}
public int getRoomY1Coordinate() //bottom left coordinate of the room.  Coder purpose
	{
	return roomY1Coordinate;
	}
public int getRoomX2Coordinate() //upper right coordinate of the room.  Coder purpose
	{
	return roomX2Coordinate;
	}
public int getRoomY2Coordinate() //upper right coordinate of the room.  Coder purpose
	{
	return roomY2Coordinate;
	}

}
