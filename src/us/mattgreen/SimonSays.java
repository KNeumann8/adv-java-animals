package us.mattgreen;

import java.util.Scanner;

public class SimonSays {
    public static void run(){

        int save;
        String animalName;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What kind of animal would you like to create?");
        System.out.println("1: Cat");
        System.out.println("2: Dog");
        System.out.println("3: Person");
        int menuChoice = Integer.parseInt(keyboard.nextLine());
        switch(menuChoice){
            case 1:
                System.out.println("What is your cat's name?");
                animalName = keyboard.nextLine();
                System.out.println("How many mice has your cat killed?");
                save = Integer.parseInt(keyboard.nextLine());
                Cat UserCat = new Cat(save,animalName);
                //zoo.add(UserCat); //do this in main
                break;
            case 2:

                break;
            case 3:

                break;
        }
    }
}
