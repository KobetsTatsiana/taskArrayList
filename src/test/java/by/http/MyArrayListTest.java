package by.http;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @autor Tatsiana Kobets
 */
public class MyArrayListTest {
    MyArrayList myArrayList = new MyArrayList();
    SortMyArrayList sortMyArrayList = new SortMyArrayList();

    @Test
    public void testSize() {
        myArrayList.add(3);
        int result = myArrayList.size();
        int expectedSize = 1;
        assertEquals(expectedSize, result);
    }

    @Test
    public void testIsEmptyWhenEmpty() {
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testIsEmptyWhenNotEmpty() {
        myArrayList.add(33);
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void testAdd() {
        myArrayList.add(5);
        assertEquals(1, myArrayList.size());
        assertEquals(5, myArrayList.get(0));
    }

    @Test
    public void testGet() {
        myArrayList.add(20);
        myArrayList.add(2);
        assertEquals(20, myArrayList.get(0));
        assertEquals(2, myArrayList.get(1));
    }

    @Test
    public void testSet() {
        myArrayList.add(2);
        myArrayList.add(22);
        myArrayList.set(0, 5);
        myArrayList.set(1, 55);
        assertEquals(5, myArrayList.get(0));
        assertEquals(55, myArrayList.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetInvalidIndex() {
        myArrayList.set(-1, 100);
    }

    @Test
    public void testRemove() {
        myArrayList.add(5);
        myArrayList.add(35);
        int indexToRemove = 1;
        myArrayList.remove(indexToRemove);
        assertEquals(1, myArrayList.size());
        assertEquals(5, myArrayList.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveInvalidIndex() {
        int indexToRemove = -1;
        myArrayList.remove(indexToRemove);
    }


    @Test
    public void testReplacingTheFirstElementWithTheLast() {
        myArrayList.replacingTheFirstElementWithTheLast();
        myArrayList.add(5);
        myArrayList.add(35);
        myArrayList.add(555);
        myArrayList.add(3565);
        assertEquals(Integer.valueOf(5), myArrayList.get(0));
        assertEquals(Integer.valueOf(3565), myArrayList.get(myArrayList.size() - 1));
    }

    @Test
    public void testClear() {
        myArrayList.clear();
        assertTrue(myArrayList.isEmpty());
    }
}