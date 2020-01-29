package us.mattgreen;
public class NoInputException extends Exception{
    public NoInputException() {
        super("User didn't enter anything");
    }
}
