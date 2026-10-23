import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Yearn_Console{
    private static final Scanner insertUserInput = new Scanner(System.in);
    private static class consoleYearn {
        private final LinkedHashMap<Integer, String> consoleYearn;

        public consoleYearn() {
            consoleYearn = new LinkedHashMap<>();
            consoleYearn.put(1, "Overview Materials");
            consoleYearn.put(2, "Available Crafts");
            consoleYearn.put(3, "Current Projects");
            consoleYearn.put(4, "Exit");
        }

        
    }
    public static void main(String[] args) {
        Boolean statementIsTrue = true;
        while (statementIsTrue){
            System.out.println("~~~~ \t Yearn Console \t ~~~~");
            Integer callIntegerMethod = printObject();
            statementIsTrue = callIntegerMethod != 4;
        }
        insertUserInput.close();
    }

    static Integer printObject(){
        System.out.println("1. Overview Materials");
        System.out.println("2. Available Crafts");
        System.out.println("3. Current Projects");
        System.out.println("4. Exit\n");
        System.out.print("Choose Action: ");
        Integer inputUser = userInput(insertUserInput);
        System.out.printf("\n" + userReturnInput(inputUser) + "\t\n");
        return inputUser;
    }

    
    static Integer userInput(Scanner insertUserInput){
        Integer chooseConsole;
        while(true){
            try{
                chooseConsole = insertUserInput.nextInt();
                    if(chooseConsole < 5 && chooseConsole > 0){
                        break;
                    }else{
                        System.out.println("Invalid Input. Please choose between 1-4 and try again.");
                    }
                }catch(InputMismatchException e){
                        System.out.println("Invalid Input. Please input only numbers between 1-4 and try again.");
                        insertUserInput.nextLine();        
            }
        }return chooseConsole;
    }

    static String userReturnInput(Integer chooseConsole){
        String returnToConsole;
        consoleYearn getConsoleYearn = new consoleYearn();
        returnToConsole = switch(chooseConsole){
            case 1 -> getConsoleYearn.consoleYearn.get(1);
            case 2 -> getConsoleYearn.consoleYearn.get(2);
            case 3 -> getConsoleYearn.consoleYearn.get(3);
            case 4 -> getConsoleYearn.consoleYearn.get(4);
            default -> "Invalid Input";
        };
        
        return returnToConsole;
    }
}