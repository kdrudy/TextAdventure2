import java.util.Scanner;

/**
 * Created by kdrudy on 11/16/16.
 */
public class Game {

    public static Scanner scanner = new Scanner(System.in);
    public static Player player = new Player();

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, traveller.");

        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();

        Enemy ogre = new Enemy("Ogre", 10, 10);
        player.battle(ogre);

        player.findItem("shield");
        player.findItem("boots");
        player.findItem("belt");

        while(true) {
            nextLine();
        }


    }

    public static String nextLine() {
        String line = scanner.nextLine();
        while(line.startsWith("/")) {
            switch (line) {
                case "/inv":
                    for(String item : player.getItems()) {
                        System.out.println(item);
                    }
                    break;
                case "/exit":
                    System.exit(0);
                    break;
                case "/weapon":
                    System.out.println(player.getWeapon());
                    break;
                default:
                    System.out.println("Command not found!");
                    break;
            }

            line = scanner.nextLine();
        }
        return line;
    }
}
