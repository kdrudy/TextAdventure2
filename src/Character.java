/**
 * Created by kdrudy on 11/22/16.
 */
public class Character {
    String name;
    int health;
    int damage;

    public void battle(Character foe) {
        System.out.printf("%s appears!\n", foe.name);

        System.out.printf("%s's health: %d\n", name, health);
        System.out.printf("%s's health: %d\n", foe.name, foe.health);

        while(health > 0 && foe.health > 0) {
            health -= foe.damage;
            foe.health -= damage;
            System.out.printf("%s's health: %d\n", name, health);
            System.out.printf("%s's health: %d\n", foe.name, foe.health);
        }

        String message = "%s has died.\n";

        if(health <= 0) {
            System.out.printf(message, name);
        }

        if(foe.health <= 0) {
            System.out.printf(message, foe.name);
        }
    }
}
