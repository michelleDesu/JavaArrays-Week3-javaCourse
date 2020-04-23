package se.lexicon.michelle;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayExercisesTest {

    /**
     * Tests the indexOf(): return the index of an element in the array.
     * If the element doesn’t exist it returns -1.
     */
    @Test
    public void given_array_return_index_of_element_in_array(){
        int[] intArray = { 15, 32, 7, 42};
        int number = 7,
                expected = 2,
                actual = ArrayExercises.indexOf(intArray, 7);
        assertEquals( expected, actual, 0);

    }
    @Test
    public void given_array_return_non_existing_element(){
        int[] intArray = { 15, 32, 7, 42};
        int number = 50,
                expected = -1,
                actual = ArrayExercises.indexOf(intArray, number);
        assertEquals( expected, actual, 0);
    }

    @Test
    public void given_array_print_average(){
        double[] doubleArray = { 43, 5 ,23, 17, 2, 14 };
        double quantity = 6,
                sumArray = 104,
                expectedAverage = 17.333,
                actualAverage = ArrayExercises.calculatePrintAverage(doubleArray);
        assertEquals(expectedAverage, actualAverage, 0.01);
    }

    @Test
    public void given_array_print_uneven_numbers(){
        int[] intArray = { 1, 2, 4, 7, 9, 12 },
            expectedUnevenArray = { 1, 7, 9},
            actualUnevenArray = ArrayExercises.unevenArray( intArray);
        assertArrayEquals(expectedUnevenArray, actualUnevenArray);


    }
    @Test
    public void given_array_add_integer_value_to_array(){
        int addValue = 60;
        int[] values = { 10, 20, 30, 40, 50},
        expectedAddedArray = {10, 20, 30, 40, 50 , 60},
        actualAddedArray = ArrayExercises.add(values , addValue);
        assertArrayEquals(expectedAddedArray, actualAddedArray);

    }

    @Test
    public void given_two_arrays_add_integer_value_to_array(){
        int[] intArray = { 10, 20, 30},
                addedArray = { 40, 50, 60},
                expected = {10, 20, 30, 40, 50, 60},
                actual = ArrayExercises.add(intArray, addedArray);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void given_array_remove_duplicates(){
        Integer[] intArray = {20, 20, 40, 20, 30, 40, 50, 60, 50},
                expected = {20,40,30,50,60},
                actualArray = ArrayExercises.removeDuplicates(intArray);
                assertArrayEquals(expected, actualArray);
    }

    @Test
    public void given_array_return_reversed_array(){
        int[] intArray = { 1, 2, 3, 4},
                expected = {4, 3, 2, 1},
                actual = ArrayExercises.reversedArray(intArray);

        assertArrayEquals(expected, actual);

    }

    @Test
    public void given_twoDimensionalArray_print_diagonal_elements(){
        int[][] twoDimArray =
                {
                        { 1 , 2, 3},
                        { 2 , 4, 6},
                        { 3 , 6, 9}
                };

          int[]  expected = {1 , 4 , 9},

                actual = ArrayExercises.diagonalArray( twoDimArray);
          assertArrayEquals(expected,actual);
    }

    @Test
    public void given_two_arrays_return_Even_odd_sorted_array(){
        int[] intArray = {1, 12, 7, 16},
                arrayToBeSorted = new int[0],
                expected = {12, 16, 1 , 7},
                actual = ArrayExercises.evenOddSorted(intArray, arrayToBeSorted);
        assertArrayEquals(expected, actual);

    }


}
