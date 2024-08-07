import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        Declare a HashSet
        HashSet hashSet = new HashSet<>();//default capcity 16 and load factor 0.75

//        HashSet hs = new HashSet<>(100); // initial capacity 100
//
//        HashSet hashSet1 = new HashSet<>(100, 0.80F);// initial capacity 100 and loadFactor 0.80
//
////        Creating a homogeneous HastSet
//        HashSet<String> stringHashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add(30.67);
        hashSet.add('B');
        hashSet.add(true);
        hashSet.add(null);
        hashSet.add(56);
        hashSet.add("Apple"); //duplicates not allowed
        System.out.println(hashSet); //Insertion order not preserved

//        remove a particular element from the HashSet
        hashSet.remove('B'); //it must a value not an index
        System.out.println(hashSet); //Insertion order not preserved

//        verify if the HashSet contains a particular element
        hashSet.contains(30.67);
        System.out.println(hashSet.contains(30.67));
        System.out.println(hashSet.contains(4));

//        check if the HashSet is empty
        System.out.println(hashSet.isEmpty());
        System.out.println();

//        reading elements from HashSet using for..each loop
        for (Object i:hashSet){
            System.out.println(i);
        }

        System.out.println();
        //        reading elements from HashSet using iterators
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(0);
        System.out.println(evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
//        using addAll() method
        numbers.addAll(evenNumbers);
        numbers.add(10);
        System.out.println(numbers);

// using removeAll() method to remove a group of element
        numbers.removeAll(evenNumbers);
        System.out.println(numbers);

//        union of 2 sets
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println(set1);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
//        set2.add(9);
//        set2.add(10);
        System.out.println(set2);

//        union of 2 sets to remove duplicates
//        set1.addAll(set2);
//        System.out.println(set1);

//        intersection of 2 sets to get the common element
//        set1.retainAll(set2);
//        System.out.println(set1);

//        finding the different elements in Set 1 and Set 2
//        set1.removeAll(set2);
//        System.out.println(set1);

//        getting the subset of the set
        set1.containsAll(set2); //set2 is a subset of set1
        System.out.println(set1.containsAll(set2));
//        System.out.println(set1);



    }
}
