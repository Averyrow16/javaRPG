import java.util.concurrent.TimeUnit;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Scanner;
public class Printer {
	static String Class = null;
	static String Name  = null;
	public static void main(String[] args)
	{
		
		
	}

	
	public static void betterPrint(String message)
	{
		Dictionary<String, Integer> dict = new Hashtable<>();
		 dict.put(".", 500);
			dict.put(",", 250);
			dict.put("!", 500);
			dict.put("?", 500);
			try {
				char[] array = message.toCharArray();
				int q = 25;
				int newLine = 0;
				for(int i = 0; i < array.length; i++)
				{
					q = 25;
					Enumeration<String> k = dict.keys();
					System.out.print(array[i]);
					String l = String.valueOf(array[i]);
					if(((Hashtable<String, Integer>) dict).containsKey(l))
					{
						
						q = dict.get(l);
						
						
					}
					Thread.sleep(q);
					newLine++;
					if(newLine == 50)
					{
						System.out.println("");			
						}
					
				}
				}
				catch(Exception e) {
					
				}
	}
}

