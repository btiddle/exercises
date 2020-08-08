package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // Variables
        ArrayList<String> food1 = new ArrayList<>(List.of("eggplant", "fig"));
        ArrayList<String> food2 = new ArrayList<>(List.of("garlic", "honeydew"));
        boolean boolResult;
        int intResult;
        String strResult;

        // Instantiate
        ArrayList<String> obj = new ArrayList<>();

        // add(Object o)
        // Add value to end of ArrayList.
        obj.add("apple");
        obj.add("banana");
        System.out.println(obj);

        // add(int index, Object o)
        // Adds Object o to the ArrayList at index.
        obj.add(0, "carrot");
        obj.add(1, "date");
        System.out.println(obj);

        // addAll(ArrayList<>);
        // Add a collection to end of ArrayList
        obj.addAll(food2);

        // addAll(int index, Collection c );
        // Add a collection to ArrayList at index
        obj.addAll(4, food1);

        // boolean contains(Object o)
        // Checks if Object o is present in ArrayList.
        boolResult = obj.contains("banana");     // true
        boolResult = obj.contains("watermelon");   // false

        // containsAll(Collection c);
        boolResult = obj.containsAll(food1);

        // Object get(int index)
        // Get Object o at index
        strResult = obj.get(0);

        // int indexOf(Object o)
        // Gives the index of the Object o. Returns -1 if not found.
        intResult = obj.indexOf("garlic");
        intResult = obj.indexOf("zucchini");

        // boolean isEmpty(Object o)
        // Check if ArrayList is empty and return true or false.
        boolResult = obj.isEmpty();

        // lastIndexOf

        // iterator

        // remove(Object o)
        // Remove Object o from the ArrayList.
        obj.remove("eggplant");

        // remove(int index)
        // Removes Object o at a given index.
        obj.remove(0);

        // boolean removeIf(Predicate filter)
        // Remove element that match Predicate filter.
        obj.removeIf(n -> (n.length() <= 5));

        // removeAll

        // replaceAll

        // retainAll

        // set(int index, Object o)
        // Replace the element present at the specified index with Object o.
        obj.set(0, "lemon");

        // int size()
        // Returns the size of the ArrayList
        System.out.println("Size of obj is " + obj.size());

        // sort()
        // Sort ArrayList
        Collections.sort(obj);
        System.out.println(obj);

        // spiliterator

        // sublist

        // toArray

        // stream

        // parallelStream

        // Loop: for loop
        for (int index = 0; index < obj.size(); index++)
            System.out.print(obj.get(index) + " ");
        System.out.println();

        // Loop: for each
        for (String value : obj)
            System.out.print(value + " ");
        System.out.println();

        // forEach

        // clear()
        // Remove all elements of the ArrayList.
        obj.clear();

        // TODO: Add remainder of methods into list
    }
}


/*
Output:

[apple, banana]
[carrot, date, apple, banana]
Size of obj is 3
[garlic, honeydew, lemon]
garlic honeydew lemon
garlic honeydew lemon
*/
