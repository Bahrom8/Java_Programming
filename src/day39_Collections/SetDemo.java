package day39_Collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>(); // accepts duplicates and keeps insertion order and has index
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list);

        System.out.println("-------------HashSet-----------------------");

        Set<Integer> set1 = new HashSet<>(); //order is random, accepts null key
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(null, null, null, null));

        System.out.println(set1);

        System.out.println("\n-------------LinkedHashSet-----------------------");

        Set<Integer> set2 = new LinkedHashSet<>(); // keeps insertion order, accepts null key
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null, null, null, null));

        System.out.println(set2);

        System.out.println("\n-------------TreeSet-----------------------");

        Set<Integer> set3 = new TreeSet<>(); // keeps sorted order, does not accept duplicated
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //set3.addAll(Arrays.asList(null, null, null, null));

        System.out.println(set3);

        System.out.println("\n-----------------------------------------");

        String[] words = {"Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#", "C#"};
        Set<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList( words));

        System.out.println(result);

        System.out.println( new ArrayList<>(result).get(1));

        words = result.toArray(new String[0]); // converting Set to Array
        System.out.println("words array " + Arrays.asList(words));

        System.out.println("\n-----------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 22, 22, 30, 30, 50 ,50, 5, 5, 5, 1, 1, 1, 1, 100));

        Set<Integer> n = new TreeSet<>(numbers); // List to Set
        System.out.println(n);






    }


}
