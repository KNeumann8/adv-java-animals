package us.mattgreen;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class SimonSays {
    public SimonSays(ArrayList zoo){

        int save = -1;
        boolean friend, weGood;
        String animalName;
        String input;
        String message;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What kind of animal would you like to create?");
        System.out.println("1: Cat");
        System.out.println("2: Dog");
        System.out.println("3: Teacher");
        int menuChoice = Integer.parseInt(keyboard.nextLine());
        switch(menuChoice){
            case 1:
                message = "What is your cat's name?";
                //NAME CHECK
                weGood = false;
                do{
                    System.out.println(message);
                    weGood = true;
                    animalName = keyboard.nextLine();
                    try{
                        InputTypeVerifier.isName(animalName);
                    }
                    catch(NoInputException e){
                        System.out.println("You must enter a name!");
                        weGood = false;
                    }
                    catch(WrongInputTypeException e){
                        System.out.println("That isn't a name!");
                        weGood = false;
                    }
                }while(!weGood);
                //END NAME CHECK

                message = "How many mice has your cat killed?";
                //INT CHECK
                weGood = false;
                do{
                    weGood = true;
                    System.out.println(message);
                    input = keyboard.nextLine();
                    try{
                        save = InputTypeVerifier.isIntAlt(input);
                    }
                    catch (NoInputException e){
                        System.out.println("You must type something!");
                        weGood = false;
                    }
                    catch (WrongInputTypeException e){
                        System.out.println("You didn't type an Integer!");
                        weGood = false;
                    }
                }while(!weGood);
                //END INT CHECK


                Cat UserCat = new Cat(save,animalName);
                zoo.add(UserCat);
                break;
            case 2:
                message = "What is your dog's name?";
                //NAME CHECK
                weGood = false;
                do{
                    System.out.println(message);
                    weGood = true;
                    animalName = keyboard.nextLine();
                    try{
                        InputTypeVerifier.isName(animalName);
                    }
                    catch(NoInputException e){
                        System.out.println("You must enter a name!");
                        weGood = false;
                    }
                    catch(WrongInputTypeException e){
                        System.out.println("That isn't a name!");
                        weGood = false;
                    }
                }while(!weGood);
                //END NAME CHECK

                message = "Is the dog friendly? Y/N";
                //Y/N CHECK
                weGood = false;
                do{
                    friend = false;
                    weGood = true;
                    System.out.println(message);
                    input = keyboard.nextLine();
                    try{
                        friend = InputTypeVerifier.isYoN(input);
                    }
                    catch(WrongInputTypeException e){
                        System.out.println("That isn't Y or N!");
                        weGood = false;
                    }
                    catch (NoInputException e){
                        System.out.println("You need to type a response!");
                        weGood = false;
                    }
                }while(!weGood);
                //END Y/N CHECK

                Dog UserDog = new Dog(friend,animalName);
                zoo.add(UserDog);
                break;
            case 3:
                message = "What is your teacher's name?";
                //NAME CHECK
                weGood = false;
                do{
                    System.out.println(message);
                    weGood = true;
                    animalName = keyboard.nextLine();
                    try{
                        InputTypeVerifier.isName(animalName);
                    }
                    catch(NoInputException e){
                        System.out.println("You must enter a name!");
                        weGood = false;
                    }
                    catch(WrongInputTypeException e){
                        System.out.println("That isn't a name!");
                        weGood = false;
                    }
                }while(!weGood);
                //END NAME CHECK

                message = "How old is your teacher?";
                //INT CHECK
                weGood = false;
                do{
                    weGood = true;
                    System.out.println(message);
                    input = keyboard.nextLine();
                    try{
                        save = InputTypeVerifier.isInt(input);
                    }
                    catch (NoInputException e){
                        System.out.println("You must type something!");
                        weGood = false;
                    }
                    catch (WrongInputTypeException e){
                        System.out.println("You didn't type an Integer!");
                        weGood = false;
                    }
                }while(!weGood);
                //END INT CHECK
                Teacher userTeacher = new Teacher(save,animalName);
                zoo.add(userTeacher);
                break;
        }

    }

}
