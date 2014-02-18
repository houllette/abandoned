package hai;

import java.util.ArrayList;

public class OxygenRecyclingCenter extends Dungeon
{
		
public OxygenRecyclingCenter()
	{
	this.setActions();
	}

public void setActions() //sets the available options depending on the room version
	{
	actions.add (0, "Go through the door on your left"); actions.add (1, "Go through the door on your right"); actions.add (2, "Search the room for oxygen tanks");
	}


public void setRoomFunction() //describes the room based on the room version
	{
	roomFunction = "a room with four large machines occupying each corner. The sound of flowing liquid can be heard emanating from the walls. Lettering on the wall says 'oxygen recycling center'";
	}

public void setRoomShape() //returns square or rectangle
	{
	roomShape = "a large rectangle";
	}

public void setCoordinates(int x, int y) //NEED ROOM GENERATOR
	{
	roomY1Coordinate = y;
	roomX1Coordinate = x;
	roomY2Coordinate = roomY1Coordinate + 3;
	roomX2Coordinate = roomX1Coordinate + 6;
	}

public void setRoomSize() //returns info on room size.  devide room[Long/Wide]Size by six to get grid lengths
	{
	roomArea = 18;
	roomLongSize = 18; //y
	roomWideSize = 36; //x
	}

public void setRoomLocation()
	{
	roomLocation = "OxygenRecyclingCenter";
	}

}
