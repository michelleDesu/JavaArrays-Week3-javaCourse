package se.lexicon.michelle;

public class ArrayExercises {

    /**
     * which takes in an array of type ‘int’ and print it out.
     * @param intArray
     */
    public static void printArray(int[] intArray){

        for (int i = 0 ; i < intArray.length; i++){
           System.out.print(intArray[i] + " ");
        }
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

}
