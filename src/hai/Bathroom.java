package hai;

import java.util.ArrayList;

public class Bathroom extends Dungeon
{
	
	
public Bathroom()
	{
	 this.setActions();
	}

public void setActions() //sets the available options depending on the room version
	{
	actions.add (0, "return through the door on your left"); actions.add (1, "check the toilet"); actions.add (2, "relieve yourself"); actions.add (3, "reach your hand down the rubbish chute"); actions.add (4, "wash your hands"); actions.add (5, "*censored*");
	}


public void setRoomFunction() //describes the room based on the room version
	{
	roomFunction = "bathroom";
	}

public void setRoomShape() //returns square or rectangle
	{
	roomShape = "tiny square";
	}

public void setCoordinates(int x, int y) //NEED ROOM GENERATOR
	{
	roomY1Coordinate = y;
	roomX1Coordinate = x;
	roomY2Coordinate = roomY1Coordinate + 2;
	roomX2Coordinate = roomX1Coordinate + 2;
	}

public void setRoomSize() //returns info on room size.  devide room[Long/Wide]Size by six to get grid lengths
	{
	roomArea = 4;
	roomLongSize = 12; //y
	roomWideSize = 12; //x
	}

public void setRoomLocation()
	{
	roomLocation = "Bathroom";
	}

}
