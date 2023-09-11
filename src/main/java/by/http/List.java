package by.http;

/**
 * @author Tatsiana Kobets
 *This is the List of Lists entity.
 * Displays the name of the list (what exactly happened to the ArrayList) and the length of the current list.
 */
public class List implements Comparable<List> {
    private String nameList;
    private int sizeList;

    public List(String nameList, int sizeList) {
        this.nameList = nameList;
        this.sizeList = sizeList;
    }

    public String getNameList() {
        return nameList;
    }

    public int getSizeList() {
        return sizeList;
    }

    @Override
    public int compareTo(List otherList) {
        return Integer.compare(this.sizeList, otherList.sizeList);
    }

    @Override
    public String toString() {
        return "List{" +
                "nameList='" + nameList + '\'' +
                ", sizeList=" + sizeList +
                '}';
    }
}

