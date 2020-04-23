package se.lexicon.michelle;

//import se.lexicon.michelle.ArrayExercises;

import java.util.Arrays;

/**
 * @author Michelle Johansson
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        runExamples();
    }


    public static void runExamples(){

        runPrintExamples();
        runIndexOf_Sort_CopyExamples();
        runMultiplicationExample();
        runReverseExample();
    }

    public static void runPrintExamples(){

        //creates 2 arrays one of type int and one of type char
        int [] intArray = new int[] {11, 23,39, 50};
        char [] charArray = { 'J', 'A', 'V', 'A'};

        String[][] countryCityValues = {
                {
                        "France",
                        "Paris"
                },
                {
                        "Sweden",
                        "Stockholm"
                }
        };

        ArrayExercises.printArray(intArray);
        ArrayExercises.printArray(charArray);

        ArrayExercises.printTwoDimenstionalStrings(countryCityValues);
    }


    public static void runIndexOf_Sort_CopyExamples(){
        int [] intArray = new int[] {11, 23,39, 50};
        String[] stringArray = {
                "Paris",
                "London",
                "New York",
                "Stockholm"
        };
        System.out.println("\n" + ArrayExercises.indexOf(intArray, 39));
        ArrayExercises.sortArray(stringArray);
        ArrayExercises.copyArray(intArray);
    }

    public static void runMultiplicationExample(){
        int[][] multiplication = new int[10][10];
        ArrayExercises.initArray(multiplication);
        ArrayExercises.multiplication(multiplication);
    }

    public static void runReverseExample(){
        boolean quit = false,
                stateNumber = true;
        int number = 0;
        int[] numbers = new int[0];

        while(!quit){

            System.out.println("What du you want to do? \n" +
                    "(a (add number) , q (quit) )");
            String input = ScannerUtil.getUserInput();

            switch (input.toLowerCase()){
                case "q":
                    quit = true;
                    System.out.println("Thank you for your added numbers \n" +
                            "The numbers you added was: ");
                            ArrayExercises.printArray(numbers);
                    System.out.println("\nIn reverse it will be: " +
                            Arrays.toString(ArrayExercises.reversedArray(numbers)) );
                    break;

                case "a":
                    number =  ScannerUtil.getInputNumber();
                    numbers = ArrayExercises.add(numbers, number);
                    break;

                default:
                    System.out.println("The value you typed is none of the suggested alternatives");

            }
        }

    }


}
