package hai;

import java.util.ArrayList;

public class ServerRoom extends Dungeon
{
	
	
public ServerRoom()
	{
	this.setActions();
	}

public void setActions() //sets the available options depending on the room version
	{
	actions.add (0, "return through the door behind you"); actions.add(1, "search storage locker on the wall beside you");
	}


public void setRoomFunction() //describes the room based on the room version
	{
	roomFunction = "a server room, with row upon row of powerful computers";
	}

public void setRoomShape() //returns square or rectangle
	{
	roomShape = "small rectangle";
	}

public void setCoordinates(int x, int y) //NEED ROOM GENERATOR
	{
	roomY1Coordinate = y;
	roomX1Coordinate = x;
	roomY2Coordinate = roomY1Coordinate + 2;
	roomX2Coordinate = roomX1Coordinate + 3;
	}

public void setRoomSize() //returns info on room size.  devide room[Long/Wide]Size by six to get grid lengths
	{
	roomArea = 6;
	roomLongSize = 12; //y
	roomWideSize = 18; //x
	}

public void setRoomLocation()
	{
	roomLocation = "ServerRoom";
	}

}
