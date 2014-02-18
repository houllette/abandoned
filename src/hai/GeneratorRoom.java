package hai;

import java.util.ArrayList;

public class GeneratorRoom extends Dungeon
{
	
	
public GeneratorRoom()
	{
	this.setActions();
	}

public void setActions() //sets the available options depending on the room version
	{
	actions.add (0, "Go through the right-hand door"); actions.add (1, "Go through the left-hand door"); actions.add (2, "Search the first crate"); actions.add (3, "Search the second crate");
	}


public void setRoomFunction() //describes the room based on the room version
	{
	roomFunction = "a room with an electrical generator in the center of the floor and two crates pushed up against the wall. A low hum reverberates throughout and the entire room is dimly illuminated by a red glow ";
	}

public void setRoomShape() //returns square or rectangle
	{
	roomShape = "a medium square";
	}

public void setCoordinates(int x, int y) //NEED ROOM GENERATOR
	{
	roomY1Coordinate = y;
	roomX1Coordinate = x;
	roomY2Coordinate = roomY1Coordinate + 4;
	roomX2Coordinate = roomX1Coordinate + 4;
	}

public void setRoomSize() //returns info on room size.  devide room[Long/Wide]Size by six to get grid lengths
	{
	roomArea = 16;
	roomLongSize = 24; //y
	roomWideSize = 24; //x
	}

public void setRoomLocation()
	{
	roomLocation = "GeneratorRoom";
	}

}
