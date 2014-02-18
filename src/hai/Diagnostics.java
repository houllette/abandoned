package hai;

import java.util.ArrayList;

public class Diagnostics extends Dungeon
{
	
	
public Diagnostics()
	{
	this.setActions();
	}

public void setActions() //sets the available options depending on the room version
	{
	actions.add (0, "[action, doors>containers>items]");
	}


public void setRoomFunction() //describes the room based on the room version
	{
	roomFunction = "a diagnostics room, that would normally output varius systems specs and stats. \n ";
	}

public void setRoomShape() //returns square or rectangle
	{
	roomShape = "a medium-ish rectangle";
	}

public void setCoordinates(int x, int y) //NEED ROOM GENERATOR
	{
	roomY1Coordinate = y;
	roomX1Coordinate = x;
	roomY2Coordinate = roomY1Coordinate + 4;
	roomX2Coordinate = roomX1Coordinate + 3;
	}

public void setRoomSize() //returns info on room size.  devide room[Long/Wide]Size by six to get grid lengths
	{
	roomArea = 12;
	roomLongSize = 24; //y
	roomWideSize = 18; //x
	}

public void setRoomLocation()
	{
	roomLocation = "Diagnostics";
	}

}
