package by.http;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * @autor Tatsiana Kobets
 * Testing the method for creating an ArrayList
 */
public class MyArrayListTest {
    @Test
    public void testCreatedArrayList() {
        /**
         * Create an instance of the class that contains your method
         */
        MethodsOfWorkingWithArrayList methodsOfWorkingWithArrayList = new MethodsOfWorkingWithArrayList();

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
}
