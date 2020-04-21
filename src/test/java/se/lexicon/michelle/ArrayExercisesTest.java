package se.lexicon.michelle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayExercisesTest {

    /**
     * Tests the indexOf(): return the index of an element in the array.
     * If the element doesn’t exist it returns -1.
     */
    @Test
    public static void given_array_return_index_of_element_in_array(){
        int[] intArray = { 15, 32, 7, 42};
        int expected = 2,
            actual = ArrayExercises.indexOf(intArray, 7);
        assertEquals( expected, actual, 0);


    }
}
