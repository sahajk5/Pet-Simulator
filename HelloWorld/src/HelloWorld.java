import java.util.Objects;
import java.util.Scanner;

public class HelloWorld
{

    // Method for when the user chooses dog
    static void Dog() {
        Scanner scan = new Scanner(System.in);

        // Asking for the dog's name
        System.out.println("What would you like to name your dog?");
        String dogName = scan.nextLine();
        System.out.println("        .-\"-.\n" +
                "       /|6 6|\\\n" +
                "      {/(_0_)\\}\n" +
                "       _/ ^ \\_\n" +
                "      (/ /^\\ \\)-'\n" +
                "       \"\"' '\"\"");
        System.out.println("Woof!Woof!!");
        System.out.println("This is your dog " + dogName + ".");
        System.out.println("Now your job is to take care of it and make sure it doesn't die!");

        // Variables for the dog's needs
        int happy = 10;
        int hunger = 10;
        int energy = 10;

        System.out.println("Right now " + dogName + "'s needs are at these levels-\n" +
                "Happiness = " + happy + "\n" +
                "Hunger = " + hunger + "\n" +
                "Energy = " + energy);


        while (true)
        {
            System.out.println("What's your next action? (play/eat/sleep/exit)");
            String action = scan.nextLine().toLowerCase();

            // When the user selects play
            if (action.equals("play")) {
                System.out.println("         __\n" +
                        " ,.    ,\" ,`-o\n" +
                        "(_(   (  | _,'\n" +
                        " \\ `-' `-' (__\n" +
                        " (    O   `--.'\n" +
                        " /)  .__,`--~'\n" +
                        "((  (          \n" +
                        "  `'''\n" +
                        "wooff woofff");
                System.out.println("Seems like yall are having fun!");

                // Update the stats after playing
                if (happy < 10) {
                    happy = happy + 2;
                    if (happy > 10) {
                        happy = 10;
                    }
                }

                if (hunger > 0) {
                    hunger = hunger - 3;
                    if (hunger < 0) {
                        hunger = 0;
                    }
                }

                if (energy > 0) {
                    energy = energy - 2;
                    if (energy < 0) {
                        energy = 0;
                    }
                }
            }

            // When the user selects eat
            else if (action.equals("eat")) {
                System.out.println("    ,    /-.\n" +
                        "   ((___/ __>\n" +
                        "   /      }\n" +
                        "   \\ .--.(    ___\n" +
                        "    \\\\   \\\\  /___\\\n" +
                        "nom nom");
                System.out.println("Awww looks like " + dogName + " is enjoying the food");

                // Update stats after eating
                if (happy > 0) {
                    happy = happy - 1;
                }

                if (hunger < 10) {
                    hunger = hunger + 3;
                    if (hunger > 10) {
                        hunger = 10;
                    }
                }

                if (energy < 10) {
                    energy = energy + 2;
                    if (energy > 10) {
                        energy = 10;
                    }
                }
            }

            // When the user selects sleep
            else if (action.equals("sleep"))
            {
                System.out.println("       .-\"\"\"\"-.\n" +
                        "      /      / \\\n" +
                        "      |.--'\"`\\_|\n" +
                        "      (  '/ '  )\n" +
                        "       \\  -   /\n" +
                        "       _`)  (`_\n" +
                        "     /`  '--'  `\\\n" +
                        "    /    _,,_    z\\\n" +
                        "   /   /`    `\\z   \\\n" +
                        "   /\\_/ / 6 6\\ \\_/\\\n" +
                        "   \\  \\/\\  Y /\\/  /\n" +
                        "    \\ \\/ `'U` \\/ /\n" +
                        "     \\(  \\  /  )/\n" +
                        "      |\\_/  \\_/|\n" +
                        "      /  ____  \\\n" +
                        "      \\ ( || ) /\n" +
                        "      (__)||(__)\n" +
                        "       |  ||  |\n" +
                        "       |  ||  |\n" +
                        "       |__||__|\n" +
                        "       /  |/  |\n" +
                        "      /  //  /\n" +
                        "     `\"\"` `\"`");
                System.out.println("Look at you and " + dogName + (" sleeping together :)"));

                // Update stats after sleeping
                if (happy > 0) {
                    happy = happy - 1;
                }

                if (hunger > 0) {
                    hunger = hunger - 5;
                    if (hunger < 0) {
                        hunger = 0;
                    }
                }

                if (energy < 10) {
                    energy = energy + 3;
                    if (energy > 10) {
                        energy = 10;
                    }
                }
            }

            // When the user selects exit
            else if (action.equals("exit")){
                break; // ends the loop
            }

            // When the user puts anything else other than the options given
            else
            {
                System.out.println("Please choose a correct action.");
            }

            // This shows the user the lastest stats of their dog
            if (action.equals("play") || action.equals("eat") || action.equals("sleep")){
                System.out.println("These are the current stats now-\n" +
                        "Happiness = " + happy + "\n" +
                        "Hunger = " + hunger + "\n" +
                        "Energy = " + energy);
            }

        }


    }

    // Method for when the user chooses cat
    static void Cat(){
        Scanner scan = new Scanner (System.in);

        System.out.println("What would you like to name your cat?");
        String catName = scan.nextLine();
        System.out.println("  /\\_/\\  (\n" +
                " ( ^.^ ) _)\n" +
                "   \\\"/  (\n" +
                " ( | | )\n" +
                "(__d b__)");
        System.out.println("Meoww meowww");
        System.out.println("This is your cat "+catName+".");
        System.out.println("Now your job is to take care of it and make sure it doesn't die!");

        // Variables for the cat's needs
        int happy = 10;
        int hunger = 10;
        int energy = 10;

        System.out.println("Right now " + catName + "'s needs are at these levels-\n" +
                "Happiness = " + happy + "\n" +
                "Hunger = " + hunger + "\n" +
                "Energy = " + energy);


        while (true)
        {
            System.out.println("What's your next action? (play/eat/sleep/exit)");
            String action = scan.nextLine().toLowerCase();

            // When the user selects play
            if (action.equals("play")) {
                System.out.println("               )\\._.,--....,'``.      \n" +
                        " .b--.        /;   _.. \\   _\\  (`._ ,.\n" +
                        "`=,-,-'~~~   `----(,_..'--(,_..'`-.;.'");
                System.out.println("Looks like "+catName+" found a new friend to play with!");

                // Update the stats after playing
                if (happy < 10) {
                    happy = happy + 2;
                    if (happy > 10) {
                        happy = 10;
                    }
                }

                if (hunger > 0) {
                    hunger = hunger - 3;
                    if (hunger < 0) {
                        hunger = 0;
                    }
                }

                if (energy > 0) {
                    energy = energy - 2;
                    if (energy < 0) {
                        energy = 0;
                    }
                }
            }

            // When the user selects eat
            else if (action.equals("eat")) {
                System.out.println("                                _.---.\n" +
                        "                      |\\---/|  / ) cat|\n" +
                        "          ------------;     |-/ /|food|---\n" +
                        "                      )     (' / `---'\n" +
                        "          ===========(       ,'==========\n" +
                        "          ||   _     |      |\n" +
                        "          || o/ )    |      | o\n" +
                        "          || ( (    /       ;\n" +
                        "          ||  \\ `._/       /\n" +
                        "          ||   `._        /|\n" +
                        "          ||      |\\    _/||\n" +
                        "        __||_____.' )  |__||____________\n" +
                        "         ________\\  |  |_________________\n" +
                        "                  \\ \\  `-.\n" +
                        "                   `-`---'  ");
                System.out.println("LOL I guess "+catName+" will get its food itself");

                // Update stats after eating
                if (happy > 0) {
                    happy = happy - 1;
                }

                if (hunger < 10) {
                    hunger = hunger + 3;
                    if (hunger > 10) {
                        hunger = 10;
                    }
                }

                if (energy < 10) {
                    energy = energy + 2;
                    if (energy > 10) {
                        energy = 10;
                    }
                }
            }

            // When the user selects sleep
            else if (action.equals("sleep"))
            {
                System.out.println("   |\\      _,,,---,,_\n" +
                        "   /,`.-'`'    -.  ;-;;,_\n" +
                        "  |,4-  ) )-,_..;\\ (  `'-'\n" +
                        " '---''(_/--'  `-'\\_) ");
                System.out.println("Awww it looks so peaceful sleeping");

                // Update stats after sleeping
                if (happy > 0) {
                    happy = happy - 1;
                }

                if (hunger > 0) {
                    hunger = hunger - 5;
                    if (hunger < 0) {
                        hunger = 0;
                    }
                }

                if (energy < 10) {
                    energy = energy + 3;
                    if (energy > 10) {
                        energy = 10;
                    }
                }
            }

            // When the user selects exit
            else if (action.equals("exit")){
                break; // ends the loop
            }

            // When the user puts anything else other than the options given
            else
            {
                System.out.println("Please choose a correct action.");
            }

            // This shows the user the lastest stats of their cat
            if (action.equals("play") || action.equals("eat") || action.equals("sleep")){
                System.out.println("These are the current stats now-\n" +
                        "Happiness = " + happy + "\n" +
                        "Hunger = " + hunger + "\n" +
                        "Energy = " + energy);
            }

        }
    }

    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);

        // Welcome message
        System.out.println("Welcome to the Pet Simulator!! A place where you can take care of a pet without all the mess!");

        // Loops until the user inputs a valid response
        while(true)
        {
            // Asking the user dog/cat
            System.out.println("Please choose your pet- Dog/Cat");
            String pet = scan.nextLine().toLowerCase();

            // Handling their input
            if (Objects.equals(pet, "dog")) {
            System.out.println("A dog! Good choice!");
            Dog();
            break;
             } else if (Objects.equals(pet, "cat")) {
            System.out.println("A cat! Good choice!");
            Cat();
            break;
            } else {
            System.out.println("Please choose a valid option.");
            }
        }


    }
}
