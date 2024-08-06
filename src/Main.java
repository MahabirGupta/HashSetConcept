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

    }
}
