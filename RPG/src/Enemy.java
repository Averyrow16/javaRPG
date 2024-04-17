public class Enemy {

    int strength, health, dexterity;
    public Enemy(String characterClass)
    {
        switch(characterClass)
        {
            case "baby":
            strength = 1;
            health = 1;
            dexterity = 1;
            break;

            case "poorPerson":
                strength = 5;
                health = 2;
                dexterity = 1;
                break; 

            case "forgetfulPerson":
                strength = 4;
                health = 5;
                dexterity = 5;
                break;

            case "seasonedSmuggler":
                strength = 8;
                health = 6;
                dexterity = 6;
                    
            case "whiteCollarCriminal":
                strength = 6;
                health = 9;
                dexterity = 7;
                break;
            
            case "corruptOfficial":
                strength = 10;
                health = 10;
                dexterity = 10;
                break;
                
            case "richPerson":
            	strength = 14;
                health = 7;
                dexterity = 10;
                break;

            case "nicholasCage":
                strength = 35;
                health = 35;
                dexterity = 12;
                break;
                
        }
    }
}
