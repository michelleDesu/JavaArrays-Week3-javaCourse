package se.lexicon.michelle;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static String getUserInput(){
        String userInput = scanner.nextLine();
        return userInput;
    }

}
