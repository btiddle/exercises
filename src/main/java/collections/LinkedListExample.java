package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String args[]) {
        // Variables
        LinkedList<String> food1 = new LinkedList<>(List.of("eggplant", "fig"));
        LinkedList<String> food2 = new LinkedList<>(List.of("garlic", "honeydew"));
        boolean boolResult;
        int intResult;
        String strResult;

        // Instantiate
        LinkedList<String> obj = new LinkedList<>();

        // add(Object o)
        // Add value to end of LinkedList.
        obj.add("apple");
        obj.add("banana");
        System.out.println(obj);

        // add(int index, Object o)
        // Adds Object o to the LinkedList at index.
        obj.add(0, "carrot");
        obj.add(1, "date");
        System.out.println(obj);

        // addAll(LinkedList<>);
        // Add a collection to end of LinkedList
        obj.addAll(food2);

        // addAll(int index, Collection c );
        // Add a collection to LinkedList at index
        obj.addAll(4, food1);

        // boolean contains(Object o)
        // Checks if Object o is present in LinkedList.
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
        // Check if LinkedList is empty and return true or false.
        boolResult = obj.isEmpty();

        // lastIndexOf

        // iterator

        // remove(Object o)
        // Remove Object o from the LinkedList.
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
        // Returns the size of the LinkedList
        System.out.println("Size of obj is " + obj.size());

        // sort()
        // Sort LinkedList
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
        // Remove all elements of the LinkedList.
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
