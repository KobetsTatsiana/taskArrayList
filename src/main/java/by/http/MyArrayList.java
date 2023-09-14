package by.http;

import java.util.Arrays;

/**
 * @param <T>
 * @author Tatsiana Kobets
 * The class provides an implementation of its own ArrayList and methods for working with it.
 */
public class MyArrayList<T> {
    private static final int STARTING_SIZE = 5;
    private Object[] data;
    private int size;

    /**
     * Constructor to create an instance of the MyArrayList class with an initial
     * empty array of objects and a size of zero.
     */
    public MyArrayList() {
        this.data = new Object[STARTING_SIZE];
        this.size = 0;
    }

    /**
     * Return the current size of the MyArrayList.
     * Returns the value of the variable size, which keeps track of the number of elements in the list.
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * Checking if MyArrayList is empty.
     * Returns true if size (number of elements) is 0, false otherwise.
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * We check if the list is as full as possible and increases the size if necessary.
     */
    private void ensureCapacity() {
        if (size == data.length) {
            int newCapacity = data.length * 2;
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    /**
     * Public method add
     * The element is added to the end of the list.
     * We call the size check and its increase, if necessary, "ensureCapacity()".
     * The code adds element element to the array at position size
     * and then increments size by 1 to indicate the new size of the list.
     *
     * @param element
     */
    public void add(T element) {
        ensureCapacity();
        data[size++] = element;
    }

    /**
     * We get an element from the list at a given index.
     * Check if the index value is within the acceptable range. If the index is less than zero or
     * is greater than or equal to the current size of the list, then an IndexOutOfBoundsException is thrown.
     * If the index is within the valid range, the method returns the element
     * located inside the data array (by index).
     *
     * @param index
     * @return
     */

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return (T) data[index];
    }

    /**
     * Replace an element in a list at a given index.
     * If the index is within the valid range,
     * replace the element in the data array (at index) with a new element "element".
     *
     * @param index
     * @param element
     */
    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        data[index] = element;
    }

    /**
     * Add an element by index.
     * Increase the array size if necessary.
     * Shift elements to the right, starting from the end of the array.
     * Insert an element at the specified index
     */
    public void addingElementByIndex(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        ensureCapacity();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
        size++;
    }

    /**
     * Remove an element from the list at a given index.
     * If the index is within the valid range, copy the elements from the data array,
     * starting from position "index + 1", to the array "data", starting from position "index".
     * Thus, we remove the element with index "index" from the list,
     * and move the remaining elements one position to the left.
     *
     * @param index
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
    }

    /**
     * We change the first element with the last place.
     * We check that there are at least two elements in the list (otherwise replacement is impossible :) ).
     * Store the first element in the temporary variable "firstElement".
     * Replace the first element with the last element.
     * Replace the last element with the saved first element.
     */
    public void replacingTheFirstElementWithTheLast() {
        if (size >= 2) {
            T firstElement = (T) data[0];
            data[0] = data[size - 1];
            data[size - 1] = firstElement;
        }
    }

    /**
     * Getting a string with the contents of the "data" array up to the "size" index as an array,
     * enclosed in square brackets and separated by commas
     * Arrays.toString() converts this new array to a string,
     * Arrays.copyOf(data, size) creates a new array by copying elements from the data array,
     * but only the first size elements. That is, it creates a new array containing
     * only elements with indexes from 0 to size-1 from the data array.
     *
     * @return
     */
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, size));
    }

    /**
     * Set the list size to zero
     */
    public void clear() {
        size = 0;
    }
}
