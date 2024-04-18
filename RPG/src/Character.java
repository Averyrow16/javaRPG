import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;

public class Character {


int strength, health, dexterity, magic;
double realStrength;

String name, Class;


Random rand = new Random();



public Character(String name, String characterClass)

{

this.name = name;

switch(characterClass)

{

case "big":

Class = "big";
	
strength = 10;

health = 20;

dexterity = 15;

magic = 12;

break;

case "mean":

Class = "mean";
	
strength = 20;

health = 7;

dexterity = 10;

magic = 20;

break;

case "slick":

Class = "slick";
	
strength = 13;

health = 16;

dexterity = 20;

magic = 8;

break;

}
String message = "YOU ARE " + name + ", agent of the National Revenue Service.";
String message2 = "SILVER TONGUE (strength): " + strength;
String message3 = "HEALTH: " + health;
String message4 = "NEURON FIRING SPEED (dexterity): " + dexterity;
String message5 = "MAGIC: " + magic;
Printer.betterPrint(message);
System.out.println();
Printer.betterPrint(message2);
System.out.println();
Printer.betterPrint(message3);
System.out.println();
Printer.betterPrint(message4);
System.out.println();
Printer.betterPrint(message5);
System.out.println();

realStrength = strength * 0.2;

}


	




/**

* Vague verbal threat is the default move

* @return

*/

public int Threat()

{

//returns from 0 to 6 hitpoints

Roll_fear(5);

return rand.nextInt(6);

}


/**

* Incident Form Filing initiation returns which (if any) subsequent turn will trigger massive damage

* The player will not know if it files and when it will trigger, it will stack damage on the move it works

* @return

*/

public int Form_initiation()

{

magic =- 2;

//chance = 0, 1, 2, 3, 4

int chance = rand.nextInt(5);

if(chance > 3)

{

//returns 3, 4, 5

return rand.nextInt(3) + 3;

}else

{

//make sure this means form will never trigger

return 0;

}

}

/**

* Second part of Incident Form Filing, returns HIGH damage to deal

* @return

*/

public int Form_strike()

{

//range of 20 to 22

Roll_fear(5);

return rand.nextInt(3) + 20;

}


public int Hand()

{

Roll_fear(2);

return rand.nextInt(3) + 20;

}


public boolean Roll_fear(int chance)

{

boolean is_fear;

int roll = rand.nextInt(chance);

if(chance == 0)

{

is_fear = true;

}else

{

is_fear = false;

}

return is_fear;

}


public void checkClass()
{
	

}
}