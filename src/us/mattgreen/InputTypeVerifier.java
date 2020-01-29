package us.mattgreen;

public class InputTypeVerifier {

    public static int isInt(String input) throws NoInputException, WrongInputTypeException {
        if(input==null||input.isEmpty()){
            NoInputException oops = new NoInputException();
            throw oops;
        }
        else{
            //totally found this int finder online, but now I'm use it for something stupid
            StringBuilder sb = new StringBuilder();
            boolean found = false;
            for(char c: input.toCharArray()){
                if(Character.isDigit(c)){
                    sb.append(c);
                    found = true;
                }
                else if(found){
                    break;
                }
            }
            try{
                return Integer.parseInt(sb.toString());
            }
            catch(NumberFormatException t){
                WrongInputTypeException e = new WrongInputTypeException();
                throw e;
            }
        }
    }


    public static void isName(String name) throws NoInputException, WrongInputTypeException {
        if(name==null||name.isEmpty()){
            NoInputException oops = new NoInputException();
            throw oops;
        }
        else{
            boolean found = false;
            for(char c: name.toCharArray()){
                if(Character.isDigit(c)){
                    WrongInputTypeException nope = new WrongInputTypeException();
                    throw nope;
                }
                else if(isVowel(c)){
                    found = true;
                }
                else if(found){
                    break;
                }
            }
            if(!found){
                WrongInputTypeException notGood = new WrongInputTypeException();
                throw notGood;
            }
        }
    }

    public static boolean isYoN(String input) throws WrongInputTypeException, NoInputException {
        boolean friend = false;
        if(input==null||input.isEmpty()){
            NoInputException oops = new NoInputException();
            throw oops;
        }
        else{
            input = input.toUpperCase();
            if(!(input.equals("Y")||input.equals("N"))){
                WrongInputTypeException e = new WrongInputTypeException();
                throw e;
            }
            else{
                if(input.toUpperCase().equals("Y")) friend = true;
                else friend = false;
            }
        }
        return friend;
    }

    private static boolean isVowel(char c){
        if(Character.isUpperCase(c)){
            if(c == 'A') return true;
            else if(c == 'E') return true;
            else if(c == 'I') return true;
            else if(c == 'O') return true;
            else if(c == 'U') return true;
            else if(c == 'Y') return true;
            else return false;
        }
        else{
            if(c == 'a') return true;
            else if(c == 'e') return true;
            else if(c == 'i') return true;
            else if(c == 'o') return true;
            else if(c == 'u') return true;
            else if(c == 'y') return true;
            else return false;
        }
    }



    public static int isIntAlt(String input) throws NoInputException, WrongInputTypeException {
        if(input==null||input.isEmpty()){
            NoInputException oops = new NoInputException();
            throw oops;
        }
        else{
            for(char c: input.toCharArray()){
                if(!Character.isDigit(c)){
                    WrongInputTypeException e = new WrongInputTypeException();
                    throw e;
                }
            }
            return Integer.parseInt(input);
        }
    }

}
