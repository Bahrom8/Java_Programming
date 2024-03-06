package day23_arrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list1.addAll(1,numbers);

        System.out.println(list1);

        System.out.println("--------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75, 85, 95, 70, 80));

        System.out.println(scores);

        System.out.println("--------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Bakhrom", "Maryam", "Abdullah", "Bilal"));

        System.out.println(students);

        students.addAll(2, Arrays.asList("Yasin", "Yahya", "Yusuf"));
        System.out.println(students);

        System.out.println("--------------------------------------------");

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8 ,9};
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList( nums ));
                                               // ( ) it needs to be empty if we use another way of solution
       // l1.addAll(Arrays.asList( nums ) ); // another way


        System.out.println(l1);

        System.out.println("--------------------------------------------");

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll( Arrays.asList("Alena", "Muhtar", "Jamal", "Kuzzat") );

        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");
        System.out.println("hasAlena = " + hasAlena);

        boolean hasEmployees = employeesList.containsAll( Arrays.asList("Alena", "Muhtar"));
        System.out.println("hasEmployees = " + hasEmployees);

        boolean hasGadirAliKuzzat = employeesList.contains(Arrays.asList("Muhtar", "Ali", "Kuzzat"));
        System.out.println("hasMuhtarAliKuzzat = " + hasGadirAliKuzzat);

        System.out.println("--------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20, 20));

        list.removeAll(Arrays.asList(10, 20));

        System.out.println(list);

        System.out.println("--------------------------------------------");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena", "Muhtar", "Jamal", "Kuzzat", "Ali", "Bakhrom", "Muhtar", "Muhtar" ));
        developers.retainAll(Arrays.asList("Alena", "Bakhrom","Muhtar"));
        System.out.println(developers);

        System.out.println("--------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(Arrays.asList("Egg", "Potato", "Milk", "Rice", "Orange",
                "Strawberry", "Paper towels" ));

           groceriesList.retainAll(Arrays.asList("Egg", "Potato", "Milk", "Rice"));
        // groceriesList.removeAll(Arrays.asList("Orange", "Strawberry", "Paper towels"));
        System.out.println(groceriesList);



    }

}
