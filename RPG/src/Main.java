import java.util.Scanner;

public class Main {
static String Name;
static String Class;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Hello, world, welcome back to my lets play! today we are gamiong. goodbye? ok whatever";
		Printer.betterPrint(message);
		Scanner scan = new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter your true name: ");
		Name = scan.nextLine();
		while(true)
		{
			
			System.out.println("Are you big, mean or slick?? ");
			Class = scan.nextLine();
			if(Class.equalsIgnoreCase("mean"))
			{
				break; 
			}
			else if(Class.equalsIgnoreCase("big"))
			{
				break;
			}
			else if(Class.equalsIgnoreCase("slick"))
			{
				break;
			}
			else 
			{
				System.out.println("Not real :(");
			}
		}
		Character player = new Character(Name, Class);
	}

}
