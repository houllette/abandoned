package hai;

import java.util.ArrayList;

public class Medbay extends Dungeon
{
	
	
public Medbay()
	{
	this.setActions();
	}

public void setActions() //sets the available options depending on the room version
	{
	actions.add (0, "return through the door to your left"); actions.add (1, "inspect the trash can by the desk"); actions.add (2, "open the first aid box on the wall"); actions.add (3, "look for crew in the regeneration pods"); actions.add (4, "look out the expansive medbay windows"); actions.add (5, "look in the oxygen supply");
	}


public void setRoomFunction() //describes the room based on the room version
	{
	roomFunction = "a medical bay";
	}

public void setRoomShape() //returns square or rectangle
	{
	roomShape = "small to medium rectangle";
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
	roomLocation = "Medbay";
	}

}
