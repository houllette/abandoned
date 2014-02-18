package hai;

import java.util.*;

public class ItemCollection {
	
	static int randomForLoop = (int)(Math.random()*10+1);
	
	static AirTank first = new AirTank();
	static Book second = new Book(1);
	static Book third = new Book(2);
	static Book fourth = new Book(3);
	static FoodPack fifth = new FoodPack();
	static PodParts sixth = new PodParts(1);
	static Wrench seventh = new Wrench();
	static PodParts eighth = new PodParts(2);
	static PodParts ninth = new PodParts(3);
	static PodParts tenth = new PodParts(4);
	
	static ArrayList<Item> bin = new ArrayList<Item>();
	static ArrayList<Item> output = new ArrayList<Item>();
	
	public ItemCollection() {
		
		bin.add(0, first);
		bin.add(1, second);
		bin.add(2, third);
		bin.add(3, fourth);
		bin.add(4, fifth);
		bin.add(5, sixth);
		bin.add(6, seventh);
		bin.add(7, eighth);
		bin.add(8, ninth);
		bin.add(9, tenth);
		
		for(int i=0;i<randomForLoop;i++) {
			
			Collections.shuffle(bin);
			
			int j = 0;
			
			int random = (int)(Math.random()*100+1);
			
			if (random <= bin.get(i).getSpawnChance()) {
				output.add(j, bin.get(i));
				j++;
			}
			
		}
		
	}
	
}
