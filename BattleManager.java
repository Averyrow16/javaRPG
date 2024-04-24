import java.util.ArrayList;
import java.util.Scanner;

public class BattleManager {
    private ArrayList<Enemy> enemies;

    public BattleManager() 
    {
        this.enemies = new ArrayList<>();
    }

    // Method to add an enemy to the battle
    public void addEnemy(Enemy enemy) 
    {
        enemies.add(enemy);
    }

   // Method to display all enemies in the battle
   public void displayEnemies() 
   {
        System.out.println("Enemies:");
        for (int i = 0; i < enemies.size(); i++) 
        {
            System.out.println((i + 1) + ". " + enemies.get(i).getName());
        }
    }

    // Method to allow the player to select an enemy to attack
    public Enemy selectEnemy(Scanner scanner) {
        while(true)
        {
            System.out.print("Choose an enemy to attack: ");
            int choice = scanner.nextInt();
            // Subtract 1 from choice to match the index in the ArrayList
            int index = choice - 1;
            if (index >= 0 && index < enemies.size()) {
                return enemies.get(index);
            } else {
                System.out.println("Invalid choice");
                continue;
            }
        }
    }

    // Method to perform an attack on a selected enemy
    public void playerPerformAttack(Character player, Enemy enemy, int attackChoice) {
    	int damage = 0;
    	switch(attackChoice)
        {
    	
            case 1:
                damage = player.Threat();
                System.out.print("This is the damage: " + damage);
                enemy.TakeDamage(damage);
                enemy.getName();

            case 2:
                damage = player.Rubbing();
                System.out.print("This is the damage: " + damage);
                enemy.TakeDamage(damage);
                enemy.getName();
                break;
        }
        // Logic to calculate damage and apply it to the selected enemy
        // For example: enemy.takeDamage(player.calculateDamage());
    }
}