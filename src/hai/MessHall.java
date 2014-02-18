package hai;

import java.util.ArrayList;

public class MessHall extends Dungeon
{
	
	
public MessHall()
	{
	this.setActions();
	}

public void setActions() //sets the available options depending on the room version
	{
	actions.add (0, "exit through the door in front of you"); actions.add (1, "exit through the door behind you"); actions.add (2, "exit through the door to your left"); actions.add (3, "exit through the door to your right");
	}


public void setRoomFunction() //describes the room based on the room version
	{
	roomFunction = "a mess hall. Windows occupy one wall, wrapping around the door. An automated serving machine occupies part of another. A layer of ice has formed over the front of it, and food packs are visible through the ice.";
	}

public void setRoomShape() //returns square or rectangle
	{
	roomShape = "a large rectangle";
	}

public void setCoordinates(int x, int y) //NEED ROOM GENERATOR
	{
	roomY1Coordinate = y;
	roomX1Coordinate = x;
	roomY2Coordinate = roomY1Coordinate + 6;
	roomX2Coordinate = roomX1Coordinate + 4;
	}

public void setRoomSize() //returns info on room size.  devide room[Long/Wide]Size by six to get grid lengths
	{
	roomArea = 24;
	roomLongSize = 36; //y
	roomWideSize = 24; //x
	}

public void setRoomLocation()
	{
	roomLocation = "MessHall";
	}

}
