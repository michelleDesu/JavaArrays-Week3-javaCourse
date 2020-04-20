package se.lexicon.michelle;

import se.lexicon.michelle.ArrayExercises;

public class App 
{
    public static void main( String[] args )
    {
        int [] intArray = new int[] {11, 23,39, 50};
        char [] charArray = { 'J', 'A', 'V', 'A'};

        ArrayExercises arr = new ArrayExercises();
        arr.printArray(intArray);
        arr.printArray(charArray);
        System.out.println("\n" + arr.indexOf(intArray, 39));



    }
}
