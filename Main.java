import java.util.Scanner;

public class Main {
    static String Name;
    static String Class;

    static BattleManager battleManager = new BattleManager();
    static ItemManager itemManager = new ItemManager();
    static Scanner scanner = new Scanner(System.in);
	static Character player;

    public static void main(String[] args) {
        Printer.betterPrint("ORDER THROUGH NUMBERS, JUSTICE THROUGH COMPLIANCE.");
        Printer.betterPrint("...");
        Printer.betterPrint("\nDim light. Old desks. Dust swirls in a silent room.");
        Printer.betterPrint("\nBrown dossier. Cream coloured form inside.");
        Printer.betterPrint("\n");

        Printer.betterPrint("\n---TAX COLLECTOR REGISTRATION---");
        System.out.println("\nNAME: ");
        Name = scanner.nextLine();
        while (true) {
            Printer.betterPrint("\nTHE FOLLOWING IS A QUESTION OF CHARACTER. DO NOT IMAGINE. ACT.");
            Printer.betterPrint("\nAs you traverse a labyrinth of corridors, you stumble upon a door. Upon opening it, you find yourself in a room filled with clocks, all ticking in perfect unison. Suddenly, one clock begins to tick backwards. What do you do?");
            Printer.betterPrint("\n\tA) Smash the clock, disrupting its rhythm.");
            Printer.betterPrint("\n\tB) Study the clock, trying to decipher its meaning.");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("a")) {
                Class = "mean";
                break;
            } else if (input.equalsIgnoreCase("b")) {
                Class = "slick";
                break;
            } else {
                // This is the secret class if you don't conform to choices a or b
                Class = "big";
                break;
            }
        }
        player = new Character(Name, Class);
		Printer.betterPrint("...");
		Printer.betterPrint("Your heart feels cold.");
        Printer.betterPrint("\nStatic fills the room. A voice on the intercom booms.");
        Printer.betterPrint("\nINITIATE PROSPECTANT TAX COLLECTOR TESTING SEQUENCE. OBSERVATION OF APPLICANT QUEUED. PROCEED.");
        Printer.betterPrint("\nThe door in front of you swings open. You enter. Inside the room is a baby. It makes a very baby noise.");
        
		Enemy baby = new Enemy("baby");
        battleManager.addEnemy(baby);

        Item paperWad = new Item("paper wad");
        itemManager.addItem(paperWad);
        
        PlayerMenu();
    }
//maybe add boolean or int to determine level for more options
    static public void PlayerMenuAttackOptions() {
        System.out.println("\n1. Vague Verbal Threat");
        System.out.println("\n2. Ominous Hand Rubbing (3mp)");
        System.out.println("\n3. Throat-Slitting Hand Sign (5mp)");
        System.out.println("\n4. Attack Query?");
    }

    static public void AttackQuery() {
        Printer.betterPrint("\nWhich attack to explain?");
        PlayerMenuAttackOptions();
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Printer.betterPrint("\nMost likely something akin to 'I would like to acquaint your facial features with the fundamental items used in building walls. Repeatedly.' Deals low dmg.");
                break;
            case 2:
                Printer.betterPrint("Do not lick your lips while doing this. That will just make things weird. Deals medium dmg. Costs 3 mp.");
                break;
            case 3:
                Printer.betterPrint("\nThe quintessential friendly gesture of good nature. The sort of thing warring gang members do to indicate how much they all love each other. Deals medium dmg. Costs 5 mp.");
                break;
            case 4:
                Printer.betterPrint("I am not going to query attack query. Nice try.");
                break;
            default:
                Printer.betterPrint("Invalid choice");
        }
    }

    static public void PlayerMenu() {
        
       
        boolean choices = false;
while(!choices)
{
	if(player.getHealth() > 0)
	{
	System.out.println("1. Attack");
    System.out.println("2. Use Item");
    System.out.print("Choose your action: ");

	 int choice = scanner.nextInt();
        switch (choice) {
            case 1:
            	choices = true;
                int attackChoice = 0;
                while (true) {
                	battleManager.displayEnemies();
            		Enemy enemyToAttack = battleManager.selectEnemy(scanner);
                    System.out.println("Attacks:");
                    PlayerMenuAttackOptions();
                    System.out.print("Choose your attack: ");
                    attackChoice = scanner.nextInt();
                    if(attackChoice <= 4)
                    {
					//this is the query option
                    if (attackChoice == 4) {
                        AttackQuery();
                        continue;
                    }
                    battleManager.playerPerformAttack(player, enemyToAttack, attackChoice);
                    break;
                    }
                    else {
                    	System.out.println("BAD CHOICE!");
                    	continue;
                    	}
					
                }
                break;
            case 2:
                while(true)
                {
                    itemManager.displayItems();
                    if(itemManager.checkItems() != 0)
                    {
                    	choices = true;
                    	Item itemToUse = itemManager.selectItem(scanner);
                    	System.out.println("you picked " + itemToUse.getName());
                    	itemToUse.useItem(itemToUse.getName());
                    	itemManager.removeItem(itemToUse);
                    	break;
                    }
                    else
                    {
                    	break;
                    }
                }
                break;
		default:
                System.out.println("Invalid choice :(");
                continue;
        }
        
	}
}

    }
}