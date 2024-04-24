import java.util.concurrent.TimeUnit;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Scanner;
import java.awt.event.KeyEvent;
public class Printer {
	static String Class = null;
	static String Name  = null;
	public static void main(String[] args)
	{
		
		
	}

	
	public static void betterPrint(String message)
	{
		int newLine = 0;
		Dictionary<String, Integer> dict = new Hashtable<>();
		 dict.put(".", 500);
			dict.put(",", 250);
			dict.put("!", 500);
			dict.put("?", 500);
			boolean skip = false;
			try {
				char[] array = message.toCharArray();
				int q = 25;
				

				Scanner scanner = new Scanner(System.in);
				for(int i = 0; i < array.length; i++)
				{
					if(!skip)
					{
					q = 25;
					}
					else
					{
						q = 0;
					}
					
					Enumeration<String> k = dict.keys();
					System.out.print(array[i]);
					String l = String.valueOf(array[i]);
					if(((Hashtable<String, Integer>) dict).containsKey(l) && !skip)
					{
						
						q = dict.get(l);
						
						
					}
					if (System.in.available() > 0 && System.in.read() == '\n')
					{
						skip = true;
						q = 0;
						System.out.print("\b");
					}
					Thread.sleep(q);
					newLine++;
					if(newLine >= 50)
					{
						if(l.equalsIgnoreCase(" ") || l.equalsIgnoreCase(".") || l.equalsIgnoreCase(",") || l.equalsIgnoreCase("!") || l.equalsIgnoreCase("?"))
						{
							System.out.println("");			
							newLine = 0;
							skip = false;
						}
						}
					
				}
				}
				catch(Exception e) {
					
				}
	}
}
