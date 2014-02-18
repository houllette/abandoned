package hai;

public class OxyUpgrade extends Item
{
	
	public OxyUpgrade(double x)
	{
		oxyAddon = x;
		name = "OxyUpgrade";
	}
	
	public void setInfo()
	{
		info = "this mofo will totes upgrade the amount of oxygen you can hold";
	}

	public void setSpawnChance()
	{
		spawnChance = 7;
	}
	
	public double getOxyAddon() {
		return oxyAddon;
	}
}
