package hai;

public class LaserBroom extends Item
{
	public LaserBroom()
	{
		name = "Laser Broom";
		this.setInfo();
		this.setSpawnChance();
	}
	public void setInfo()
	{
		info = "A high-tech broom used to clean up high-tech space dust.";
	}
	public void setSpawnChance()
	{
		//only spawns in broom closets
		//all broom closets must have at least 1 broom in them
		spawnChance = 0;
	}
}
