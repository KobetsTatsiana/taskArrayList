package by.http;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * @autor Tatsiana Kobets
 */
public class MyArrayListTest {
    /**
     * Created an instance of the class that contains method
     */
    MethodsOfWorkingWithArrayList methodsOfWorkingWithArrayList = new MethodsOfWorkingWithArrayList();

    /**
     * Testing the method for creating an ArrayList
     */
    @Test
    public void testCreatedArrayList() {
        /**
         * We call the createdArrayList() method from the MethodsOfWorkingWithArrayList class, which we will test
         */
        methodsOfWorkingWithArrayList.createdArrayList();

        /**
         *  We get the result of the method execution and store the result in the resultArrayList variable
         */
        ArrayList<Integer> resultArrayList = methodsOfWorkingWithArrayList.getMyArrayList();

        /**
         * We define the expected result in the expectedArrayList variable,
         * which is a list with the same elements that should be added to the list using the createdArrayList() method
         */
        ArrayList<Integer> expectedArrayList = new ArrayList<>();
        expectedArrayList.add(15);
        expectedArrayList.add(115);
        expectedArrayList.add(555);
        expectedArrayList.add(68);
        expectedArrayList.add(17);

        /**
         * We check that the resulting result matches the expected one using assertEquals().
         * If they are equal, then the test will be successful.
         */
        assertEquals(expectedArrayList, resultArrayList);
    }

    /**
     * Testing the method of adding a number to the end of a list
     */
    @Test
    public void testAddedElementToTheEndOfTheList() {
        /**
         * We call the createdArrayList() method from the MethodsOfWorkingWithArrayList class, which we will test
         */
        methodsOfWorkingWithArrayList.addedElementToTheEndOfTheList();

        /**
         * Create an ArrayList and add a number to it
         */
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1000);

        /**
         * пet the last element of the ArrayList
         */
        int lastNumber = myArrayList.get(myArrayList.size() - 1);

        /**
         * сheck that the last element is 1000
         */
        assertEquals(1000, lastNumber);
    }

    /**
     * Testing the method of adding value to the list as the second element
     */
    @Test
    public void testAddedElementAtIndexOne() {
        /**
         * call the addedElementAtIndexOne() method from the MethodsOfWorkingWithArrayList class, which we will test
         */
        methodsOfWorkingWithArrayList.addedElementAtIndexOne();
        /**
         * add element 7 at index 1
         */
        methodsOfWorkingWithArrayList.myArrayList.add(1, 7);

        /**
         * сheck that the number was successfully added to the 1nd index
         */
        assertEquals(Integer.valueOf(7), methodsOfWorkingWithArrayList.myArrayList.get(1));
    }

    /**
     * Testing the method of getting an element at index 2 (third element of the list)
     */
    @Test
    public void testGettingElementAtIndexTwo() {
        methodsOfWorkingWithArrayList.gettingElementAtIndexTwo();
        /**
         * Call the method we want to test
         */
        int getElementByIndex = methodsOfWorkingWithArrayList.myArrayList.get(2);
        /**
         * We check that the method returned the expected result
         */
        assertEquals(4, getElementByIndex);
    }

    /**
     * Testing the method of replacing the element at index 1
     * (we change the second element of the list to the value 500)
     */
    @Test
    public void testReplacingElementAtIndexOne() {
        methodsOfWorkingWithArrayList.replacingElementAtIndexOne();
        /**
         * Call the method we want to test
         */
        methodsOfWorkingWithArrayList.myArrayList.set(1, 500);

        /**
         * We check that the method returned the expected result
         */
        assertEquals(Integer.valueOf(500), methodsOfWorkingWithArrayList.myArrayList.get(1));
    }

    /**
     * Testing the method of replacing the first element with the last one
     */
    @Test
    public void testReplacingTheFirstElementWithTheLast() {
        methodsOfWorkingWithArrayList.replacingTheFirstElementWithTheLast();
        assertEquals(Integer.valueOf(2), methodsOfWorkingWithArrayList.myArrayList.get(0));
        assertEquals(Integer.valueOf(0), methodsOfWorkingWithArrayList.myArrayList.get(methodsOfWorkingWithArrayList.myArrayList.size() - 1));
    }

    /**
     * Testing the method of deleting element at index 2 (third element of the list)
     */
    @Test
    public void testRemoveElementAtIndexTwo() {
        methodsOfWorkingWithArrayList.removeElementAtIndexTwo();
        methodsOfWorkingWithArrayList.myArrayList.remove(2);

        /**
         *  Check that the element at index 2 has been removed
         *  Check the size of the ArrayList
         */
        assertEquals(2, methodsOfWorkingWithArrayList.myArrayList.size());
        /**
         * Check element at index 0
         */
        assertEquals(Integer.valueOf(0), methodsOfWorkingWithArrayList.myArrayList.get(0));
        /**
         * Check element at index 1
         */
        assertEquals(Integer.valueOf(1), methodsOfWorkingWithArrayList.myArrayList.get(1));
    }

    /**
     * Testing the method of quick sort
     */
    @Test
    public void testQuickListSorting() {
        methodsOfWorkingWithArrayList.quickListSorting();

        /**
         * Define the expected sorted array
         */
        Integer[] expectedSortedArray = {1, 2, 4, 5, 9};

        /**
         * Convert the ArrayList to an array for comparison
         */
        Integer[] sortedArray = methodsOfWorkingWithArrayList.myArrayList.toArray(new Integer[0]);

        /**
         * Check that the ArrayList has been sorted correctly
         */
        assertArrayEquals(expectedSortedArray, sortedArray);
    }

    /**
     * Testing the method of deleting the entire collection
     */
    @Test
    public void testDeleteEntireCollection() {
        methodsOfWorkingWithArrayList.deleteEntireCollection();
        assertTrue(methodsOfWorkingWithArrayList.myArrayList.isEmpty());
    }
}







