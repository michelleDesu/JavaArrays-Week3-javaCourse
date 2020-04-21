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

      */
        arr.copyArray(intArray);
        arr.printTwoDimenstionalStrings(countryCityValues);



    }
}
