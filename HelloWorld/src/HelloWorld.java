import java.util.Objects;
import java.util.Scanner;

public class HelloWorld {

    // Method for when the user chooses dog
    static void Dog()
    {
        Scanner scan = new Scanner (System.in);

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
        System.out.println("This is your dog "+dogName+".");
        System.out.println("Now your job is to take care of it and make sure it doesn't die!");

        // Variables for the dog's needs
        int happy = 10;
        int hunger = 10;
        int energy = 10;

        System.out.println("Right now "+dogName+"'s needs are at these levels-\n" +
                "Happiness = "+happy+"\n" +
                "Hunger = "+hunger+"\n" +
                "Energy = "+energy);

        while(true)
        {
            System.out.println("What's your next action? (play/eat/sleep)");
            String action = scan.nextLine().toLowerCase();

            if (action.equals("play")){
                System.out.println("    ,    /-.\n" +
                        "   ((___/ __>\n" +
                        "   /      }\n" +
                        "   \\ .--.(    \n" +
                        "    \\\\   \\\\()\n" +
                        "wooff woofff");
                System.out.println("Seems like yall are having fun!");
                if (happy<10)
                {
                    happy = happy + 2;
                }

                if (hunger>0){
                    hunger = hunger - 3;
                }

                if (energy>0){
                    energy = energy - 1;
                }
            System.out.println("These are the current stats now-\n" +
                    "Happiness = "+happy+"\n" +
                    "Hunger = "+hunger+"\n" +
                    "Energy = "+energy);
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
