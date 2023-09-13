package by.http;

import java.util.Arrays;

/**
 * @author Tatsiana Kobets
 * The class provides an implementation of its own ArrayList and methods for working with it.
 * @param <T>
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
     * Private method add
     * Declaration of a private method that is intended for testing and,
     * if necessary, increase the capacity of the list.
     * We check whether the current size of the list "size")" is equal to its capacity "data.length".
     * If this condition is met, it means that the list is full and its size needs to be increased.
     * If the current size is full, then we calculate the new capacity by doubling the current value.
     * Increasing list capacity.
     * The Arrays.copyOf method creates a new data array "data" with a new capacity "newCapacity"
     * and copies all elements from the current data array into it.
     */
    private void add() {
        if (size == data.length) {
            int newCapacity = data.length * 2;
            data = Arrays.copyOf(data, newCapacity);
        }
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
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
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
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        data[index] = element;
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
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
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
     *
     * @return Arrays.toString() converts this new array to a string,
     * Arrays.copyOf(data, size) creates a new array by copying elements from the data array,
     * but only the first size elements. That is, it creates a new array containing
     * only elements with indexes from 0 to size-1 from the data array.
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
