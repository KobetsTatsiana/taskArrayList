package by.http;

import java.util.*;
/**
 * @author Tatsiana Kobets
 * Methods of working with ArrayList
 */
import static by.http.QuickSort.quickSort;

public class MethodsOfWorkingWithArrayList {
    ArrayList<Integer> myArrayList = new ArrayList<>();
    int newRandomNumber_Math = (int) (Math.random() * 100) + 0;

    /**
     * Filling the list with values.
     */
    public void createdArrayList() {
        myArrayList.add(15);
        myArrayList.add(115);
        myArrayList.add(555);
        myArrayList.add(68);
        myArrayList.add(17);
        System.out.println("Primary array: " + myArrayList);
    }

    /**
     * adding a value to the end of the list
     */
    public void addedElementToTheEndOfTheList() {
        myArrayList.add(1000);
        System.out.println("Added element (1000) to the end of the list: " + myArrayList);
    }

    /**
     * adding value to the list as the Second element
     */
    public void addedElementAtIndexOne() {
        myArrayList.add(5);
        System.out.println("\nBefore adding: " + myArrayList);
        myArrayList.add(1, 7);
        System.out.println("Added element 7 at index 1: " + myArrayList);
    }

    /**
     * getting an element at index 2 (third element of the list)
     */
    public void gettingElementAtIndexTwo() {
        myArrayList.add(5);
        myArrayList.add(5);
        myArrayList.add(4);
        int getElementByIndex = myArrayList.get(2);
        System.out.println("Getting element at index 2: " + getElementByIndex);
    }

    /**
     * replacing the element at index 1 (we change the second element of the list to the value 500)
     */
    public void replacingElementAtIndexOne() {
        myArrayList.add(5);
        myArrayList.add(5);
        myArrayList.add(4);
        System.out.println("\nBefore replacement : " + myArrayList);
        myArrayList.set(1, 500);
        System.out.println("Replacing element at index 1 on 500: " + myArrayList);
    }

    /**
     * replacing the first element with the last one
     */
    public void replacingTheFirstElementWithTheLast() {
        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        System.out.println("\nBefore replacement : " + myArrayList);

        int lastIndex = myArrayList.size() - 1;
        int temp = myArrayList.get(0);
        myArrayList.set(0, myArrayList.get(lastIndex));
        myArrayList.set(lastIndex, temp);
        System.out.println("Replacing the first element with the last: " + myArrayList);
    }

    /**
     * deleting element at index 2 (third element of the list)
     */
    public void removeElementAtIndexTwo() {
        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.remove(2);
        System.out.println("Remove element at index 2: " + myArrayList);
    }

    /**
     * quick sort
     */
    public void quickListSorting() {
        myArrayList.add(5);
        myArrayList.add(2);
        myArrayList.add(9);
        myArrayList.add(1);
        myArrayList.add(4);
        System.out.println("\nBefore quick sort : " + myArrayList);

        quickSort(myArrayList, 0, myArrayList.size() - 1);
        for (int i = 0; i < myArrayList.size(); i++) {
            myArrayList.get(i);
        }
        System.out.println("\nQuick list sorting: " + myArrayList);
    }

    /**
     * sort Ascending and sorting in descending order
     */
    public void sorting() {
        ArrayList<Integer> myArrayList = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
        Collections.sort(myArrayList);
        System.out.println("Sort Ascending: " + myArrayList);
        Collections.reverse(myArrayList);
        System.out.println("Sort in descending order: " + myArrayList);
    }

    /**
     * created ArrayList and step-by-step filling of the “List of lists”
     * +
     * built-in sorting using Comparable
     * external sorting using Comparator
     */
    public void createdListAndSortComparableWithComparator() {
        ArrayList<List> lists = new ArrayList<>();
        lists.add(new List("Primary array", myArrayList.size()));
        lists.add(new List("Added a random element to the end of the list", myArrayList.size()));
        lists.add(new List("Added random element at index 1", myArrayList.size()));
        lists.add(new List("Remove element at index 2", myArrayList.size()));

        Collections.sort(lists);
        System.out.print("Sorting using Comparable: ");
        for (List list : lists) {
            System.out.println(list);
        }

        Comparator<List> bySizeList = Comparator.comparing(List::getSizeList);
        Collections.sort(lists, bySizeList);
        for (List list : lists) {
            System.out.println("Sorting using Comparator (по bySizeList):" + list);
        }
    }

    /**
     * deleting the entire collection
     */
    public void deleteEntireCollection() {
        myArrayList.removeAll(myArrayList);
        System.out.println("Delete entire collection:)");
    }

    public ArrayList<Integer> getMyArrayList() {
        return myArrayList;
    }

}


