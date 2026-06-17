import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class HelloWorld {

    static void Dog(){

        System.out.println("Woof!Woof!");
    }

    static void Cat(){
        System.out.println("meoww meowww");
    }

    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);

        System.out.println("Welcome to the Pet Simulator!! A place where you can take care of a pet without all the mess!");
        System.out.println("Please choose your pet- Dog/Cat");
        String pet = scan.nextLine().toLowerCase();


        if (Objects.equals(pet, "dog")){
            System.out.println("A "+pet+"! Good choice!");
            Dog();
        }
        else if (Objects.equals(pet, "cat")){
            System.out.println("A "+pet+"! Good choice!");
            Cat();
        }
        else{
            System.out.println("Please choose a correct option.");
        }


    }

}
