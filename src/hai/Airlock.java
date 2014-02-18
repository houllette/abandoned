package hai;

import java.util.ArrayList;

public class Airlock extends Dungeon
{
	
	
public Airlock()
	{
	 this.setActions();
	}

public void setActions() //sets the available options depending on the room version
	{
	actions.add (0, "return through the door behind you"); actions.add (1, "open the airlock");
	}


public void setRoomFunction() //describes the room based on the room version
	{
	roomFunction = "a room with a very large, very heavy door opposite you. A sign on the wall says 'Airlock', and there is a red lever on the wall";
	}

public void setRoomShape() //returns square or rectangle
	{
	roomShape = "a small square";
	}

public void setCoordinates(int x, int y) //NEED ROOM GENERATOR
	{
	roomY1Coordinate = y;
	roomX1Coordinate = x;
	roomY2Coordinate = roomY1Coordinate + 3;
	roomX2Coordinate = roomX1Coordinate + 3;
	}

public void setRoomSize() //returns info on room size.  devide room[Long/Wide]Size by six to get grid lengths
	{
	roomArea = 9;
	roomLongSize = 18; //y
	roomWideSize = 18; //x
	}

public void setRoomLocation()
	{
	roomLocation = "Airlock";
	}

}
