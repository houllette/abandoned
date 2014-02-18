package hai;

import java.util.ArrayList;

public class Lounge extends Dungeon
{
	
	
public Lounge()
	{
	 this.setActions();
	}

public void setActions() //sets the available options depending on the room version
	{
	actions.add(0, "go through the door on your left"); actions.add(1, "go through the door on your right"); actions.add(2, "check the cubbies on the wall behind you"); actions.add(3, "check the shelves on the wall in front of you"); actions.add(4, "check under the couch cushions"); actions.add(5, "try turning on the tv");
	}


public void setRoomFunction() //describes the room based on the room version
	{
	roomFunction = "a lounge for down time";
	}

public void setRoomShape() //returns square or rectangle
	{
	roomShape = "a medium rectangle";
	}

public void setCoordinates(int x, int y) //NEED ROOM GENERATOR
	{
	roomY1Coordinate = y;
	roomX1Coordinate = x;
	roomY2Coordinate = roomY1Coordinate + 3;
	roomX2Coordinate = roomX1Coordinate + 4;
	}

public void setRoomSize() //returns info on room size.  devide room[Long/Wide]Size by six to get grid lengths
	{
	roomArea = 12;
	roomLongSize = 18; //y
	roomWideSize = 24; //x
	}

public void setRoomLocation()
	{
	roomLocation = "Lounge";
	}

}
