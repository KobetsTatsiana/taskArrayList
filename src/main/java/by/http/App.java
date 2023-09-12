package by.http;

import java.util.*;

import static by.http.QuickSort.quickSort;

/**
 * Training class using randomness and exception handling
 * @author Tatsiana Kobets
 *
 * 1. User input number, size of initial list
 * + exception handling for incorrect data entry.
 * 2. Filling a list of specified length with random values (range from 0 to 100).
 * + step-by-step filling of the “List of lists”
 * 3. Working with ArrayList:
 * - adding a random value (range from 0 to 100) to the end of the list;
 * - adding a random value (range from 0 to 100) to the list as the second element;
 * - getting an element at index 2 (third element of the list);
 * - replacing the element at index 1 (we change the second element of the list to the value 500);
 * - replacing the first element with the last one;
 * - deleting element at index 2 (third element of the list);
 * - quick sort;
 * - sort Ascending;
 * - sorting in descending order;
 * - built-in sorting using Comparable;
 * - external sorting using Comparator;
 * - deleting the entire collection.
 */
public class App {
    public static void main(String[] args) {
        System.out.print("What array size do you need?: ");
        Scanner scanner = new Scanner(System.in);
        int sizeNumArray = 0;
        try {
            sizeNumArray = scanner.nextInt();
            System.out.println("Your number: " + sizeNumArray);
        } catch (Exception e) {
            System.out.println("Ooo, this is not an integer. Let's try again!");
        }
        scanner.close();

        ArrayList<List> lists = new ArrayList<>();

        ArrayList<Integer> myArrayList = new ArrayList<>();
        int randomNumber = 0;
        while (myArrayList.size() < sizeNumArray) {
            Random myRandomNumber = new Random();
            randomNumber = myRandomNumber.nextInt(100);
            myArrayList.add(randomNumber);
        }
        System.out.println("Primary array: " + myArrayList);
        lists.add(new List("Primary array", myArrayList.size()));

        System.out.println("List Size: " + myArrayList.size());

        int newRandomNumber_Math = (int) (Math.random() * 100) + 0;
        myArrayList.add(newRandomNumber_Math);
        System.out.println("Added a random element to the end of the list: " + myArrayList);
        lists.add(new List("Added a random element to the end of the list", myArrayList.size()));

        myArrayList.add(1, newRandomNumber_Math);
        System.out.println("Added random element at index 1: " + myArrayList);
        lists.add(new List("Added random element at index 1", myArrayList.size()));

        int getElementByIndex = myArrayList.get(2);
        System.out.println("Getting element at index 2: " + getElementByIndex);

        myArrayList.set(2, 500);
        System.out.println("Replacing element at index 1: " + myArrayList);

        int lastIndex = myArrayList.size() - 1;
        int temp = myArrayList.get(0);
        myArrayList.set(0, myArrayList.get(lastIndex));
        myArrayList.set(lastIndex, temp);
        System.out.println("Replacing the first element with the last: " + myArrayList);

        myArrayList.remove(2);
        System.out.println("Remove element at index 2: " + myArrayList);
        lists.add(new List("Remove element at index 2", myArrayList.size()));

        quickSort(myArrayList, 0, myArrayList.size() - 1);
        for (int i = 0; i < myArrayList.size(); i++) {
            myArrayList.get(i);
        }
        System.out.println("Quick list sorting: " + myArrayList);

        Collections.sort(myArrayList);
        System.out.println("Sort Ascending: " + myArrayList);

        Collections.reverse(myArrayList);
        System.out.println("Sort in descending order: " + myArrayList);

        Collections.sort(lists);
        System.out.print("Sorting using Comparable: ");
        for (List list : lists) {
            System.out.println(list);
        }

        Comparator<List> byNameList = Comparator.comparing(List::getNameList);
        Collections.sort(lists, byNameList);
        for (List list : lists) {
            System.out.println("Sorting using Comparator (по byNameList):" + list);
        }

        myArrayList.removeAll(myArrayList);
        System.out.println("Delete entire collection:)");
    }
}

