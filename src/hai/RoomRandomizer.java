package hai;

import java.util.*;

public class RoomRandomizer {
	
	//global variables
	
	static EngineRoom second = new EngineRoom();
	static Medbay third = new Medbay();
	static Bathroom fourth = new Bathroom();
	static Lounge fifth = new Lounge();
	static Diagnostics sixth = new Diagnostics();
	static Airlock seventh = new Airlock();
	static Laboratory eighth = new Laboratory();
	static OxygenRecyclingCenter ninth = new OxygenRecyclingCenter();
	static GeneratorRoom tenth = new GeneratorRoom();
	static MessHall eleventh = new MessHall();
	static ServerRoom twelfth = new ServerRoom();
	static BroomCloset thirteenth = new BroomCloset();
	
	static OneByOne storage = new OneByOne(1);
	static OneByOne connectingForward = new OneByOne(2);
	static OneByOne closet = new OneByOne(3);
	static OneByOne empty = new OneByOne(4);
	static OneByOne connectingRight = new OneByOne(5);
	static OneByOne connectingLeft = new OneByOne(6);
	static OneByOne all = new OneByOne(7);
	
	static ArrayList<Dungeon> rooms = new ArrayList<Dungeon>();
	static ArrayList<Dungeon> filler = new ArrayList<Dungeon>();
	static Homebase first = new Homebase();
	
	static ArrayList<Dungeon> nextDungeon = new ArrayList<Dungeon>();
	
	static int j = 0;
	
	
	//private variables
	
	public RoomRandomizer() {
		setRooms();
		Collections.shuffle(rooms);
		rooms.add(0, first);
		assignLocations();
	}
	
	private static void assignLocations() {
		
		for(int i=0;i<=rooms.size();i++) {
			Dungeon old = rooms.get(i);
			
			switch(rooms.get(i).getRoomLocation()) {
			case "Lounge":nextDungeon.add(second);nextDungeon.add(ninth);nextDungeon.add(tenth);nextDungeon.add(eleventh);nextDungeon.add(fifth);nextDungeon.add(connectingRight);nextDungeon.add(all);
				break;
			case "Laboratory": nextDungeon.add(second);nextDungeon.add(ninth);nextDungeon.add(tenth);nextDungeon.add(eleventh);nextDungeon.add(fifth);nextDungeon.add(connectingRight);nextDungeon.add(all);
				break;
			case "OxygenRecyclingCenter": nextDungeon.add(second);nextDungeon.add(eighth);nextDungeon.add(tenth);nextDungeon.add(eleventh);nextDungeon.add(fifth);nextDungeon.add(connectingRight);nextDungeon.add(all);
				break;
			case "GeneratorRoom": nextDungeon.add(second);nextDungeon.add(eighth);nextDungeon.add(ninth);nextDungeon.add(eleventh);nextDungeon.add(fifth);nextDungeon.add(connectingRight);nextDungeon.add(all);
				break;
			case "EngineRoom": nextDungeon.add(fifth);nextDungeon.add(ninth);nextDungeon.add(tenth);nextDungeon.add(eleventh);nextDungeon.add(fifth);nextDungeon.add(connectingRight);nextDungeon.add(all);
				break;
			case "MessHall": nextDungeon.add(fifth);nextDungeon.add(ninth);nextDungeon.add(tenth);nextDungeon.add(second);nextDungeon.add(fifth);nextDungeon.add(connectingRight);nextDungeon.add(all);
				break;
			default: break;
			
			}
			
		}
		
		Dungeon old = rooms.get(i);
		
		
		//sets X coordinate
		int width = rooms.get(i+1).getRoomWideSize();
		int xLocation = old.getRoomX1Coordinate() - (width/6);

		//sets Y coordinate
		int heighth = rooms.get(i+1).getRoomLongSize();
		int yLocation = old.getRoomY1Coordinate() - (width/6);

		//sets the rooms' origin point
		rooms.get(i+1).setCoordinates(xLocation, yLocation);
				
	}
	
	private static void setRooms() {
		//sets all the variables for rooms arraylist
			//removed and moved to static
		//end variables
		
		//sets all the variables for the filler rooms arraylist
		
		
		
		rooms.add(1, second);
		rooms.add(2, third);
		rooms.add(3, fourth);
		rooms.add(4, fifth);
		rooms.add(5, sixth);
		rooms.add(6, seventh);
		rooms.add(7, eighth);
		rooms.add(8, ninth);
		rooms.add(9, tenth);
		rooms.add(10, eleventh);
		rooms.add(11, twelfth);
		rooms.add(12, thirteenth);
		
		filler.add(0, storage);
		filler.add(1, connectingForward);
		filler.add(2, closet);
		filler.add(3, empty);
		filler.add(4, connectingRight);
		filler.add(5, connectingLeft);
		filler.add(6, all);
	}
}
