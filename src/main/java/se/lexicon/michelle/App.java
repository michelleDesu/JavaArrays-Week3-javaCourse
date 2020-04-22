package se.lexicon.michelle;

//import se.lexicon.michelle.ArrayExercises;

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

        //creates 2 arrays one of type int and one of type char
        int [] intArray = new int[] {11, 23,39, 50};
        char [] charArray = { 'J', 'A', 'V', 'A'};
        String[] stringArray = {
                "Paris",
                "London",
                "New York",
                "Stockholm"
        };

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
        System.out.println("\n" + ArrayExercises.indexOf(intArray, 39));
        ArrayExercises.sortArray(stringArray);


        ArrayExercises.copyArray(intArray);
        ArrayExercises.printTwoDimenstionalStrings(countryCityValues);


        runMultiplication();
    }

    public static void runMultiplication(){
        int[][] multiplication = new int[10][10];
        ArrayExercises.initArray(multiplication);
        ArrayExercises.multiplication(multiplication);
    }
}
