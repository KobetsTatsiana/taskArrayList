package by.http;

/**
 * @autor Tatsiana Kobets
 */
public class Main {

    public static void main(String[] args) {

        /**
         * Filling the list with values and working with ArrayList.
         */
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(3);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(9);
        System.out.println("Primary array: " + myArrayList);

        myArrayList.add(1000);
        System.out.println("Replacement element (1000) to the end of the list: " + myArrayList);

        myArrayList.set(1, 7);
        System.out.println("Added element 7 at index 1: " + myArrayList);

        System.out.println("Size list: " + myArrayList.size());

        System.out.println("Getting element at index 2: " + myArrayList.get(2));

        myArrayList.remove(2);
        System.out.println("Remove element at index 2: " + myArrayList);

        myArrayList.replacingTheFirstElementWithTheLast();
        System.out.println("Replacing the first element with the last: " + myArrayList);

        myArrayList.clear();
        System.out.println("List after clearing: " + myArrayList);

        System.out.println("Sorting");
        SortMyArrayList<Integer> list = new SortMyArrayList<>();
        list.add(10);
        list.add(3);
        list.add(7);

        System.out.print("Original List: ");
        list.display();
        list.quickSort();
        System.out.print("Sorted List: ");
        list.display();
        list.reverseSort();
        System.out.print("Sorted reverse List: ");
        list.display();
    }
}
