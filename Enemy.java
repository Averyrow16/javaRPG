public class Enemy {

    int strength, health, dexterity;

    String name; 

    public Enemy(String characterClass)
    {
        switch(characterClass)
        {
            case "baby":
            name = "Baby";
            strength = 1;
            health = 1;
            dexterity = 1;
            break;

            case "poorPerson":
                name = "Poor Person";
                strength = 5;
                health = 2;
                dexterity = 1;
                break; 

            case "forgetfulPerson":
                name = "forgetful Person";
                strength = 4;
                health = 5;
                dexterity = 5;
                break;

            case "seasonedSmuggler":
                name = "Seasoned Smuggler";
                strength = 8;
                health = 6;
                dexterity = 6;
                    
            case "whiteCollarCriminal":
                name = "White Collar Criminal";
                strength = 6;
                health = 9;
                dexterity = 7;
                break;
            
            case "corruptOfficial":
                name = "Corrupt Official";
                strength = 10;
                health = 10;
                dexterity = 10;
                break;
                
            case "richPerson":
                name = "Rich Person";
            	strength = 14;
                health = 7;
                dexterity = 10;
                break;

            case "nicholasCage":
                name = "Nicholas Cage";
                strength = 35;
                health = 35;
                dexterity = 12;
                break;
                
        }
    }

    private int getHealth()
    {
        return health;
    }

    public String getName()
    {
        return name + " [Health: " + getHealth() + "]";
    }

    public String getNameLimited()
    {
        return name;
    }

    public void TakeDamage(int damage)
    {
        health -= damage;
        if(health <= 0)
        {
            DeathMessage();
        }
    }

    public void DeathMessage()
    {
        System.out.println("\n" + getNameLimited() + " vanquished.");
    }

	
}