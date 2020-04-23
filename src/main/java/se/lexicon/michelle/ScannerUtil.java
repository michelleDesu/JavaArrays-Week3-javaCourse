package se.lexicon.michelle;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * fetches the users input and returns a string.
     * @return
     */
    public static String getUserInput(){
        String userInput = scanner.nextLine();
        return userInput;
    }

    //Gets a number from user
    public static int getInputNumber(){
        System.out.print("Write a number you want to add: ");
        return ScannerUtil.getIntFromUser();
    }

    public static int getIntFromUser(){
        int number = 0;
        boolean invalidInt = true;

        while (invalidInt){
            try{
                String numberAsString = getUserInput().trim();
                number = Integer.parseInt(numberAsString);
                invalidInt = false;
            }catch(NumberFormatException e){
                System.out.print("Invalid input. Please try again: " );
            }
        }
        return number;
    }



}
