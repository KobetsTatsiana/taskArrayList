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
     * adding a random value (range from 0 to 100) to the end of the list
     */
    public void addedARandomElementToTheEndOfTheList() {
        myArrayList.add(newRandomNumber_Math);
        System.out.println("Added a random element to the end of the list: " + myArrayList);
    }

    /**
     * adding a random value (range from 0 to 100) to the list as the second element
     */
    public void addedRandomElementAtIndexOne() {
        myArrayList.add(1, newRandomNumber_Math);
        System.out.println("Added random element at index 1: " + myArrayList);
    }

    /**
     * getting an element at index 2 (third element of the list)
     */
    public void gettingElementAtIndexTwo() {
        int getElementByIndex = myArrayList.get(2);
        System.out.println("Getting element at index 2: " + getElementByIndex);
    }

    /**
     * replacing the element at index 1 (we change the second element of the list to the value 500)
     */
    public void replacingElementAtIndexOne() {
        myArrayList.set(1, 500);
        System.out.println("Replacing element at index 1: " + myArrayList);
    }

    /**
     * replacing the first element with the last one
     */
    public void replacingTheFirstElementWithTheLast() {
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
        myArrayList.remove(2);
        System.out.println("Remove element at index 2: " + myArrayList);
    }

    /**
     * quick sort
     */
    public void quickListSorting() {
        quickSort(myArrayList, 0, myArrayList.size() - 1);
        for (int i = 0; i < myArrayList.size(); i++) {
            myArrayList.get(i);
        }
        System.out.println("Quick list sorting: " + myArrayList);
    }

    /**
     * sort Ascending and sorting in descending order
     */
    public void sorting() {
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


