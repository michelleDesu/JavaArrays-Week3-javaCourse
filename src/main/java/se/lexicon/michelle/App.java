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

        ArrayExercises arr = new ArrayExercises();
      /*
        arr.printArray(intArray);
        arr.printArray(charArray);
        System.out.println("\n" + arr.indexOf(intArray, 39));
        arr.sortArray(stringArray);


        arr.copyArray(intArray);
        arr.printTwoDimenstionalStrings(countryCityValues);
        */

        runMultiplication();

    }

    public static void runMultiplication(){
        ArrayExercises arr = new ArrayExercises();
       /* int[][] multiplication = {
                {1 , 2, 3 },
                {1 , 2, 3 }
        };*/
        int[][] multiplication = new int[10][10];
        arr.initArray(multiplication);
        arr.multiplication(multiplication);
    }
}
