package se.lexicon.michelle;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayExercises {

    /**
     * which takes in an array of type ‘int’ and print it out.
     *
     * @param intArray
     */
    public static void printArray(int[] intArray) {

        for (int integer : intArray) {
            System.out.print(integer + " ");
        }
    }

    /**
     * which takes in an array of type ‘char’ and print it out.
     *
     * @param charArray
     */
    public static void printArray(char[] charArray) {
        for(char charValue : charArray){
            System.out.print(charValue + " ");
        }

    }

    /**
     * will find and return the index of an element in the array.
     * If the element doesn’t exist it returns -1.
     *
     * @param intArray
     * @param number
     * @return
     */
    public static int indexOf(int[] intArray, int number) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == number) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Will sort string array in alphabetic order.
     *
     * @param stringArray
     */
    public static void sortArray(String[] stringArray) {
        String[] sortedStringArray;
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }

    /**
     * @param intArray
     * @author Michelle Johansson
     * Will copy and print out an array of integers
     */
    public static void copyArray(int[] intArray) {
        int[] arrayCopy = Arrays.copyOf(intArray, intArray.length);

        System.out.print("\nElements from first array: ");
        printArray(intArray);

        System.out.print("\nElements from second array: ");
        printArray(arrayCopy);
    }

    public static void printTwoDimenstionalStrings(String[][] twoDimArray) {
        System.out.println();

        for (String[] strings : twoDimArray) {

            for (int j = 0; j < strings.length; j++) {
                System.out.print(strings[j] + " ");
                if (j == strings.length - 1) {
                    System.out.println();
                }
            }

        }
    }

    public static double calculatePrintAverage(double[] doubleArray) {
        int totalNumberOfValues = 0;
        double sum = 0;

        for (double v : doubleArray) {
            totalNumberOfValues++;
            sum += v;
        }
        if (totalNumberOfValues == 0) {
            return -1;
        }
        sum /= totalNumberOfValues;

        System.out.println(sum);
        return sum;
    }

    /**
     * print out and return an array with only the uneven numbers of the given array
     * @param intArray
     * @return
     */
    public static int[] unevenArray(int[] intArray) {
        int[] unevenNumbersArray = new int[0];
        for (int value : intArray) {

            if ((value % 2) >= 1) {
                unevenNumbersArray = add(unevenNumbersArray, value);
            }
        }
        System.out.print(Arrays.toString(unevenNumbersArray));

        return unevenNumbersArray;
    }

    /**
     * removes the duplicate elements of a given array
     * @param intArray
     * @return
     */

    public static Integer[] removeDuplicates(Integer[] intArray){

        //This array has duplicate elements
        System.out.println( Arrays.toString(intArray) );

        //Create set from array elements
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(intArray) );

        /*
         Get back the array without duplicates
          LinkedHashSet does two things internally :
            * Remove duplicate elements
            * Maintain the order of elements added to it
         */
        Integer[] arrayWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});

        //Verify the array content
        System.out.println( Arrays.toString(arrayWithoutDuplicates) );
        return arrayWithoutDuplicates;
    }

    /**
     * Creates a new array with the added value
     * returns the new array
     * @param intArray
     * @param addNumber
     * @return
     */
    public static int[] add(final int[] intArray, int addNumber){
        int[] newArray = Arrays.copyOf(intArray, intArray.length+1 );
        int offset = newArray.length-1;
        newArray[offset] = addNumber;
        return newArray;
    }

    /**
     * prints out a multiplication table of a given array.
     * @param multiplication
     */
    public static void multiplication(int[][] multiplication){
        for(int i = 0 ; i < multiplication.length; i++){

            for(int j = 0 ; j < multiplication[i].length; j++){

                System.out.print( ( ( i+ 1)*(j+1) ) +  "\t");
            }
            System.out.println();
        }
    }

    /**
     * set default values in the given array
     * @param intArray
     */
    public static void initArray(int[][] intArray){
        for (int[] ints : intArray) {
            Arrays.fill(ints, 0);
        }
    }

    /**
     * reverse and then returns given array
     * @param intArray
     * @return
     */
    public static int[] reversedArray(int[] intArray){
        int[] newArray = new int[0];
        int number = 0;
        for(int i = intArray.length - 1; i >= 0 ; i--){
            number = intArray[i];
            newArray = add(newArray, number);
        }
        return newArray;
    }

    /**
     * given a two dimensional array and return the diagonal
     * in another array.
     * @param twoDimArray
     * @return
     */
    public static int[] diagonalArray(int[][] twoDimArray){
        int[] newArray = new int[0];
        int pos = 0;
        for (int i = 0 ; i < twoDimArray.length; i++){
            for (int j = 0; j < twoDimArray[i].length; j++){
                if(i == pos && j == pos){
                    newArray = add(newArray, twoDimArray[i][j]);
                }

            }
            pos++;

        }
        printArray(newArray);
        return newArray;

    }

}
