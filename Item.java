import java.util.Random;

public class Item {
	String name;
	Random rand = new Random();
	public Item(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void useItem(String name)
	{
		if(name == "paper wad")
		{
			int healing = 2;
			
			System.out.println("The paper wad heals you for " + healing + "hp");
		}
		else if(name == "paper wad")
		{
			
		}
	}

	

}
