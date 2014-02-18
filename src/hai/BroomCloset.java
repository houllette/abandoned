package hai;

import java.util.ArrayList;

public class BroomCloset extends Dungeon
{
	
	
public BroomCloset()
	{
	this.setActions();
	}

public void setActions() //sets the available options depending on the room version
	{
	actions.add (0, "Leave"); actions.add (1, "Take a broom");
	}


public void setRoomFunction() //describes the room based on the room version
	{
	roomFunction = "a closet, which is somewhat dingy. It has 3 walls lined with shiny, very high-tech, very expensive brand-spanking-new laser brooms. It was immediately evident that these were top of the line brooms. Obviously no expense was spared";
	}

public void setRoomShape() //returns square or rectangle
	{
	roomShape = "tiny square";
	}

public void setCoordinates(int x, int y) //NEED ROOM GENERATOR
	{
	roomY1Coordinate = y;
	roomX1Coordinate = x;
	roomY2Coordinate = roomY1Coordinate + 1;
	roomX2Coordinate = roomX1Coordinate + 1;
	}

public void setRoomSize() //returns info on room size.  devide room[Long/Wide]Size by six to get grid lengths
	{
	roomArea = 1;
	roomLongSize = 6; //y
	roomWideSize = 6; //x
	}

public void setRoomLocation()
	{
	roomLocation = "BroomCloset";
	}

}
