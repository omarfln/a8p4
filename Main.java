import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Marketing> myMarketingArrList = new ArrayList<>();

        // Add objects to the list
        myMarketingArrList.add(new Marketing("Omar", "Product one", 25000));
        myMarketingArrList.add(new Marketing("Reena", "Product two", 82000));
        myMarketingArrList.add(new Marketing("Zahraa", "Product three", 129000));
        myMarketingArrList.add(new Marketing("May", "Product four", 1233200));

        System.out.println("Initial list:");
        System.out.println(myMarketingArrList);
        System.out.println("List size: " + myMarketingArrList.size());

        // Remove an object from the list
        Marketing toRm = new Marketing("Sara", "Product two", 3332221);
        myMarketingArrList.remove(toRm);

        System.out.println("\nList after removing " + toRm + ":");
        System.out.println(myMarketingArrList);
        System.out.println("List size: " + myMarketingArrList.size());

        // Sorting the list by salesAmount using Comparator
        myMarketingArrList.sort(new MyComparator());

        System.out.println("\nSorted list by salesAmount:");
        System.out.println(myMarketingArrList);

        // Retrieve a list of employees with salesAmount > $1000 and sort by employeeName
        List<Marketing> moreThan1000List = listMoreThan1000(myMarketingArrList);
        moreThan1000List.sort(new MyComparator());


    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> myList = new ArrayList<>();
        for (Marketing m : list) {
            if (m.getSalesamount() > 1000)
                myList.add(m);

        }
        return myList;
    }

}