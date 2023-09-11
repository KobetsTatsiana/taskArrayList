package by.http;

import java.util.ArrayList;

/**
 * @author Tatsiana Kobets
 * Quicksort class.
 * Includes three stages:
 * 1. A reference element is selected from the array, in the middle of the array.
 * 2. The other elements of the array are distributed in such a way that the smaller ones are placed before it,
 * and the larger ones are placed after it.
 * 3. Next, the first steps are recursively applied to the subarrays,
 * which are divided by the support element into two parts - to the left and to the right of it.
 */
public class QuickSort {

    public static void quickSort(ArrayList<Integer> myArrayList, int low, int high) {
        if (myArrayList.size() == 0 || low >= high) return;

        int middle = low + (high - low) / 2;
        int border = myArrayList.get(middle);

        int i = low, j = high;
        while (i <= j) {
            while (myArrayList.get(i) < border) i++;
            while (myArrayList.get(j) > border) j--;
            if (i <= j) {
                int swap = myArrayList.get(i);
                myArrayList.set(i, myArrayList.get(j));
                myArrayList.set(j, swap);
                i++;
                j--;
            }
        }

        if (low < j) quickSort(myArrayList, low, j);
        if (high > i) quickSort(myArrayList, i, high);
    }
}

