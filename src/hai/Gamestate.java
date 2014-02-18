package hai;

import java.util.*;

public class Gamestate {
	
	//global variables
	static Scanner input = new Scanner(System.in);
	
	static RoomRLFB world = new RoomRLFB();
	
	static int choice;
	
	//private variables
	
	
	//methods
	public static void wait(int X) {
		int time = X * 1000;
		try {
			Thread.sleep(time);
		} catch(InterruptedException ex) {}
	}
	
	private static void consoleClear()
	{
	for (int i = 0; i < 50; ++i) System.out.println();
	
		/*try {
		Runtime.getRuntime().exec("clear");
		} catch (IOException ex) {}
		try
		{
			String os = System.getProperty("os.name").toLowerCase();
			Runtime.getRuntime().exec("cls");
			
			if(os.contains("windows"))
			{
	           Runtime.getRuntime().exec("cls");
				//System.out.println(os);
	
			}
			
			else
			{
				
				Runtime.getRuntime().exec("clear");
				//Runtime.getRuntime().exec("clear");
				//System.out.println(os);
			}
			
		}
		catch(Exception exception)
		{
			System.out.println("exception found");
		}
		*/
	}

	//main program
	public static void main(String[] args) {
		System.out.println(" +-+-+-+-+-+-+ +-+-+-+-+ +-+-+-+-+-+-+-+-+");
		System.out.println(" |M|o|b|i|u|s| |T|r|i|p| |P|r|e|s|e|n|t|s|");
		System.out.println(" +-+-+-+-+-+-+ +-+-+-+-+ +-+-+-+-+-+-+-+-+");
		wait(1);
		System.out.println("\n\n");
		wait(1);
		System.out.println("\n\n");
		wait(1);
		System.out.println("\n\n");
		wait(1);
		System.out.println("\n\n");
		wait(1);
		System.out.println("\n\n");
		wait(1);
		System.out.println("\n\n");
		System.out.println("");
		System.out.println(" .S_SSSs     .S_SSSs     .S_SSSs     .S_sSSs     .S_sSSs      sSSs_sSSs     .S_sSSs      sSSs   .S_sSSs   ");
		System.out.println(".SS~SSSSS   .SS~SSSSS   .SS~SSSSS   .SS~YS%%b   .SS~YS%%b    d%%SP~YS%%b   .SS~YS%%b    d%%SP  .SS~YS%%b   ");
		System.out.println("S%S   SSSS  S%S   SSSS  S%S   SSSS  S%S   `S%b  S%S   `S%b  d%S'     `S%b  S%S   `S%b  d%S'    S%S   `S%b  ");
		System.out.println("S%S    S%S  S%S    S%S  S%S    S%S  S%S    S%S  S%S    S%S  S%S       S%S  S%S    S%S  S%S     S%S    S%S  ");
		System.out.println("S%S SSSS%S  S%S SSSS%P  S%S SSSS%S  S%S    S&S  S%S    S&S  S&S       S&S  S%S    S&S  S&S     S%S    S&S  ");
		System.out.println("S&S  SSS%S  S&S  SSSY   S&S  SSS%S  S&S    S&S  S&S    S&S  S&S       S&S  S&S    S&S  S&S_Ss  S&S    S&S  ");
		System.out.println("S&S    S&S  S&S    S&S  S&S    S&S  S&S    S&S  S&S    S&S  S&S       S&S  S&S    S&S  S&S~SP  S&S    S&S  ");
		System.out.println("S&S    S&S  S&S    S&S  S&S    S&S  S&S    S&S  S&S    S&S  S&S       S&S  S&S    S&S  S&S     S&S    S&S  ");
		System.out.println("S*S    S&S  S*S    S&S  S*S    S&S  S*S    S*S  S*S    d*S  S*b       d*S  S*S    S*S  S*b     S*S    d*S ");
		System.out.println("S*S    S*S  S*S    S*S  S*S    S*S  S*S    S*S  S*S   .S*S  S*S.     .S*S  S*S    S*S  S*S.    S*S   .S*S ");
		System.out.println("S*S    S*S  S*S SSSSP   S*S    S*S  S*S    S*S  S*S_sdSSS    SSSbs_sdSSS   S*S    S*S   SSSbs  S*S_sdSSS  ");
		System.out.println("SSS    S*S  S*S  SSY    SSS    S*S  S*S    SSS  SSS~YSSY      YSSP~YSSY    S*S    SSS    YSSP  SSS~YSSY    ");
		System.out.println("       SP   SP                 SP   SP                                     SP                              ");
		System.out.println("       Y    Y                  Y    Y                                      Y                               ");
		wait(2);
		System.out.println("(C) 2014 Mobius Trip");
		System.out.println("Produced by Isaac Noland, Holden Oullette, and Andrew Soltesz");
		wait(2);
		System.out.println("\nPRESS ENTER TO CONTINUE");
		String enter = input.nextLine();
		
		if (!enter.equals("admin")) {
			story(1);
		}
		
		consoleClear();
		
		System.out.println("What is your name player?");
		String name = input.nextLine();
		
		Player main = new Player(name);
		
		Homebase base = new Homebase();
		currentState(base);

	}
	
	public static void story(int position) {
		switch (position) {
		case 1: //begin story
			System.out.print("May 8th, 2132, 353 kilometers above the surface of Earth"
					+ "\n8 hours after a system-crippling disaster, the space station Andromeda drifts through earth's uppermost atmosphere.");
			wait(6);
			System.out.print("\n\nAbandoned.");wait(1);System.out.print(".");wait(1);System.out.print(".");wait(1);System.out.print(".");wait(1);System.out.print("\nalmost.");
			
			wait(3);
			
			System.out.println("What is your name player?");
			String name = input.nextLine();
			
			Player main = new Player(name);
			break;
		case 2: 
			break;
		case 3:
			break;
		case 4:
			break;
		}
	}
	
	public static void currentState(Dungeon room) {
		room.setRoomFunction();
		room.setRoomLocation();
		System.out.println(room.getRoomDescription());
		System.out.println(room.getActions());
		String enter = input.nextLine();
		String user = enter.toUpperCase();
		
		if (user.equals("EXIT")) {
			System.out.println("Which exit?");
			String choose = input.nextLine();
			String phrase = choose.toUpperCase();
			if (phrase.equals("LEFT")) {
				currentState(world.getRightArray(1));
			} else if (phrase.equals("RIGHT")) { 
				currentState(world.getLeftArray(1)); 
			} else if (phrase.equals("FORWARD")) {
				currentState(world.getForwardArray(1));
			} else if (phrase.equals("BACK")) {
				currentState(world.getBackArray(1));
			} else {
				System.out.println("That is not an acceptable exit!");
				currentState(room);
			}
		} else if (user.equals("ACCESS")) {
			System.out.println("you access");
			currentState(room);
		} else if (user.equals("EXAMINE")) {
			System.out.println("you examine");
			currentState(room);
		} else if (user.equals("SEARCH")) {
			System.out.println("you search");
			currentState(room);
		} else if (user.equals("SLEEP")) {
			System.out.println("you sleep");
			currentState(room);
		} else {
			System.out.println("That is not an acceptable action!");
			currentState(room);
		}
		
	}
	
}
