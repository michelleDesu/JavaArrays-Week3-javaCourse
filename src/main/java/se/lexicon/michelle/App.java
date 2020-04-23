package se.lexicon.michelle;

//import se.lexicon.michelle.ArrayExercises;

import java.util.Arrays;
import java.util.Random;

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

        //runPrintExamples();
        //runIndexOf_Sort_CopyExamples();
        //runMultiplicationExample();
        //runReverseExample();
        runEvenOddSortExample();
    }

    public static void runPrintExamples(){

        //creates 2 arrays one of type int and one of type char
        int [] intArray = new int[] {11, 23,39, 50};
        char [] charArray = { 'J', 'A', 'V', 'A'};

        //
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
        System.out.println();

        //overloaded printArray method
        ArrayExercises.printArray(charArray);
        System.out.println();

        ArrayExercises.printTwoDimenstionalStrings(countryCityValues);
        System.out.println();
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
        System.out.println();
        ArrayExercises.sortArray(stringArray);
        System.out.println();
        ArrayExercises.copyArray(intArray);
        System.out.println();
    }

    public static void runMultiplicationExample(){
        System.out.println();
        int[][] multiplication = new int[10][10];
        ArrayExercises.initArray(multiplication);
        ArrayExercises.multiplication(multiplication);
    }

    /**
     * creates a random number and then creates an array with the size of that number
     * --> initializes the array with random numbers--> sorts the array
     * --> runs evenOddSorted method that returns a sorted array where even numbers are first and then the odd numbers are at the end of the array.
     * prints out the initialized array then the evenOddNumbers.
     */
    public static void runEvenOddSortExample(){
        Random rand = new Random();
        int arraySize = rand.nextInt(10) +1;
        int[] intArray = ArrayExercises.initRandomArray( arraySize),
                toBeSorted = new int[0];

        System.out.println("The array given: " + Arrays.toString(intArray));
        toBeSorted = ArrayExercises.evenOddSorted(intArray, toBeSorted);

        System.out.println( "Array sorted in 'even' then 'odd' numbers" + Arrays.toString(toBeSorted));

    }

    public static void runReverseExample(){
        System.out.println();
        boolean quit = false;
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
