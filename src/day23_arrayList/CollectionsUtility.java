package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 8, 9, 7, 5, 6, 10, 11, 4, 5, 3));

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("------------------------------------------");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Egg", "Potato", "Milk", "Rice", "Orange",
                "Strawberry", "Paper towels"));

        Collections.sort(items);

        System.out.println(items);

        System.out.println("------------------------------------------");

        Collections.reverse(items);
        System.out.println(items);

        System.out.println("------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Bakhrom", "Maryam", "Abdullah", "Bilal"));

        System.out.println(students);
        Collections.swap(students,1, 0);
        System.out.println(students);

        Collections.swap(students,0,students.size()-1);
        System.out.println(students);

        System.out.println("------------------------------------------");





    }

}
