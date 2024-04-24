
public class LevelManager {

	public static int EXP;
	public static int Level; 
	
	
	public int getLevel()
	{
		return Level;
	}
	
	public void addEXP(int experience)
	{
		EXP += experience;
		for(int i = 1; i < 4; i++)
		{
			if(EXP >= (5 + (5*i)) && Level == i)
			{
				Level = (i + 1);
				EXP = 0;
		}
		}
	}
}
