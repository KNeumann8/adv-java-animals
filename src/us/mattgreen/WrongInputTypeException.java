package us.mattgreen;

public class WrongInputTypeException extends Exception{
    public WrongInputTypeException(){
        super("The user didn't enter the correct type of input");
    }
}
