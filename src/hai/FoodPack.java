package hai;

public class FoodPack extends Item
{
	public FoodPack()
	{
		name = "Dehydrated Food Pack";
		this.setInfo();
		this.setSpawnChance();
	}
	public void setInfo()
	{
		info = "Dehydrated Astronaut food. It looks like there's enough for one day.";
	}
	public void setSpawnChance()
	{
		spawnChance = 20;
	}
}
