package hai;

import java.util.*;

public class RoomRLFB {
	
	static int countOne = 1;
	static int countTwo = 1;
	static int countThree = 1;
	static int countFour = 1;
	
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
	
	static Dungeon[] right = new Dungeon[8];
	static Dungeon[] left = new Dungeon[12];
	static Dungeon[] forward = new Dungeon[4]; 
	static Dungeon[] back = new Dungeon[11];
	static Dungeon[][][][] general = new Dungeon[8][12][4][11];
	
	public RoomRLFB() {
		
		right[0]=second;right[1]=fifth;right[2]=eighth;right[3]=ninth;right[4]=tenth;right[5]=eleventh;right[6]=connectingRight;right[7]=all;
		left[0]=second;left[1]=third;left[2]=fourth;left[3]=fifth;left[4]=sixth;left[5]=eighth;left[6]=ninth;left[7]=tenth;left[8]=eleventh;left[9]=thirteenth;left[10]=connectingLeft;left[11]=all;	
		forward[0]=sixth;forward[1]=eleventh;forward[2]=connectingForward;forward[3]=all;
		back[0]=sixth;back[1]=seventh;back[2]=eleventh;back[3]=twelfth;back[4]=storage;back[5]=connectingForward;back[6]=closet;back[7]=empty;back[8]=connectingRight;back[9]=connectingLeft;back[10]=all;
	
		shuffleArray(right);
		shuffleArray(left);
		shuffleArray(forward);
		shuffleArray(back);
		
	}
	
	public static void shuffleArray(Dungeon[] ar) {
	    Random rnd = new Random();
	    for (int i = ar.length - 1; i > 0; i--) {
	    	int index = rnd.nextInt(i + 1);
	    	// Simple swap
	    	Dungeon a = ar[index];
	    	ar[index] = ar[i];
	    	ar[i] = a;
	    }
	}
	
	public static void assignGrid() {
		int randomRight = (int)(Math.random()*8+1);
		int randomLeft = (int)(Math.random()*12+1);
		int randomForward = (int)(Math.random()*4+1);
		int randomBack = (int)(Math.random()*10+1);
		
	}
	
	public Dungeon getRightArray(int x) {
		right[x].actions.clear();
		right[x].setActions();
		return right[x];
	}
	
	public Dungeon getLeftArray(int x) {
		left[x].actions.clear();
		left[x].setActions();
		return left[x];
	}
	
	public Dungeon getForwardArray(int x) {
		forward[x].actions.clear();
		forward[x].setActions();
		return forward[x];
	}
	
	public Dungeon getBackArray(int x) {
		back[x].actions.clear();
		back[x].setActions();
		return back[x];
	}
	
}
