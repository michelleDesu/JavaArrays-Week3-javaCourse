package se.lexicon.michelle;

import java.util.Arrays;

public class ArrayExercises {

    /**
     * which takes in an array of type ‘int’ and print it out.
     * @param intArray
     */
    public static void printArray(int[] intArray){

        for(int integer: intArray){
            System.out.print(integer + " ");
        }

      /*  for (int i = 0 ; i < intArray.length; i++){
           System.out.print(intArray[i] + " ");
        }*/
    }

    /**
     * which takes in an array of type ‘char’ and print it out.
     * @param charArray
     */
    public static void printArray(char[] charArray){
        for (int i = 0 ; i < charArray.length; i++){
            System.out.print(charArray[i] + " ");
        }
    }

    /**
     * will find and return the index of an element in the array.
     * If the element doesn’t exist it returns -1.
     * @param intArray
     * @param number
     * @return
     */
    public static int indexOf( int[] intArray, int number){
        for (int i = 0; i < intArray.length ; i++){
            if(intArray[i] == number){
                return i;
            }
        }
        return -1;
    }


    /**
     * Will sort string array in alphabetic order.
     * @param stringArray
     */
    public static void sortArray(String[] stringArray){
        String[] sortedStringArray;
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }

    /**
     * Will copy and print out an array of integers
     * @param intArray
     */
    public static void copyArray(int[] intArray){
        int[] arrayCopy = Arrays.copyOf(intArray, intArray.length);

        System.out.print("\nElements from first array: ");
        printArray(intArray);

        System.out.print("\nElements from second array: ");
        printArray(arrayCopy);
    }


}
