package se.lexicon.michelle;

public class ArrayExercises {

    public static void printArray(int[] intArray){

        for (int i = 0 ; i < intArray.length; i++){
           System.out.print(intArray[i] + " ");
        }
    }

    public static void printArray(char[] charArray){
        for (int i = 0 ; i < charArray.length; i++){
            System.out.print(charArray[i] + " ");
        }
    }
    public static int indexOf( int[] intArray, int number){
        for (int i = 0; i < intArray.length ; i++){
            if(intArray[i] == number){
                return i;
            }
        }
        return -1;
    }

}
