package se.lexicon.michelle;

import java.util.Arrays;

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

      /*  for (int i = 0 ; i < intArray.length; i++){
           System.out.print(intArray[i] + " ");
        }*/
    }

    /**
     * which takes in an array of type ‘char’ and print it out.
     *
     * @param charArray
     */
    public static void printArray(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
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
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
                if (j == twoDimArray[i].length - 1) {
                    System.out.println();
                }
            }

        }
    }

    public static double calculatePrintAverage(double[] doubleArray) {
        int totalNumberOfValues = 0;
        double sum = 0;

        for (int i = 0; i < doubleArray.length; i++) {
            totalNumberOfValues++;
            sum += doubleArray[i];
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
        for (int i = 0; i < intArray.length; i++) {

            if ((intArray[i] % 2) >= 1) {
                unevenNumbersArray = add(unevenNumbersArray, intArray[i]);
            }
        }
        System.out.print(Arrays.toString(unevenNumbersArray));

        return unevenNumbersArray;
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

}
