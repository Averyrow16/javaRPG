import java.util.ArrayList;
import java.util.Scanner;

public class ItemManager {
	private ArrayList<Item> items;

	public ItemManager()
	{
		this.items = new ArrayList<>();
	}

	public void addItem(Item item)
	{
		items.add(item);
		System.out.println("You have acquired a new item: " + item.getName());
	}

	public void displayItems()
	{
		if(items.size() <=0 )
		{
			System.out.println("You have no items!");
		}else
		{
			System.out.println("Items:");
			for (int i = 0; i < items.size(); i ++)
			{
				System.out.println((i + 1) + ". " + items.get(i).getName());
			}
		}
	}

	public Item selectItem(Scanner scanner)
	{
		while(true)
		{
			System.out.println("Choose an item to use: ");
			int choice = scanner.nextInt();
			int index = choice - 1;
			if(index >= 0 && index < items.size()) 
			{
				return items.get(index);
			} else
			{
				System.out.println("Invalid choice");
				continue;
			}
		}
	}

	public void removeItem(Item item)
	{
		items.remove(item);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int checkItems()
	{
		return items.size();
	}

}
