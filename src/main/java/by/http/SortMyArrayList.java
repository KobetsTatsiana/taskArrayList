package by.http;

import java.util.Arrays;

/**
 * @param <E>
 * @author Tatsiana Kobets
 * The class provides many methods for working with the array and sorting it.
 */
public class SortMyArrayList<E extends Comparable<E>> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size;

    /**
     * Constructor of the SortMyArrayList class.
     */
    public SortMyArrayList() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;

    }

    /**
     * Method for adding an element to an array.
     *
     * @param element
     */
    public void add(E element) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = element;
    }

    /**
     * Recursive quick sort.
     */
    public void quickSort() {
        quickSort(0, size - 1);
    }

    /**
     * Recursive part of quick sorting.
     *
     * @param low
     * @param high
     */
    private void quickSort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSort(low, pivotIndex - 1);
            quickSort(pivotIndex + 1, high);
        }
    }

    /**
     * Divider for quick sorting.
     *
     * @param low
     * @param high
     * @return
     */
    private int partition(int low, int high) {
        E pivot = (E) elements[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (getElementAt(j).compareTo(pivot) <= 0) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    /**
     * Getting an element by index.
     *
     * @param index
     * @return
     */
    private E getElementAt(int index) {
        return (E) elements[index];
    }

    /**
     * Swap two elements in an array.
     *
     * @param i
     * @param j
     */
    private void swap(int i, int j) {
        Object temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }

    /**
     * Double the array capacity.
     */
    private void increaseCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    /**
     * Outputting array elements to the console.
     */
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    /**
     * Sort in reverse order.
     */
    public void reverseSort() {
        Arrays.sort(elements, 0, size, (a, b) -> ((E) b).compareTo((E) a));
    }
}
