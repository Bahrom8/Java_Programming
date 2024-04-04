package day41_maps;

import day33_abstraction.EmployeeTask.Employee;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> l2 = new ArrayList<>();
        l2.addAll(Arrays.asList(7, 8, 9, 10, 11, 12));

        List<List<Integer>> lists = new ArrayList<>();

        lists.add(l1);
        lists.add(l2);

        System.out.println(lists);

        System.out.println(lists.get(1).get(3)); //10

        for ( List<Integer> eachList : lists ){
            for (Integer eachElement : eachList){
                System.out.println(eachElement);
            }
        }


        System.out.println("-----------------------------------------");

        List<Set<Integer>> listOfSets = new ArrayList<>();
        listOfSets.add(new LinkedHashSet<>()); //0
        listOfSets.add(new LinkedHashSet<>()); //1
        listOfSets.add(new LinkedHashSet<>()); //2
        listOfSets.add(new LinkedHashSet<>()); //3

        System.out.println(listOfSets);

        listOfSets.get(0).addAll(Arrays.asList(10, 5, 20, 10, 5, 20));
        listOfSets.get(1).addAll(Arrays.asList(30, 45, 20, 20, 5, 20));
        listOfSets.get(2).addAll(Arrays.asList(50, 55, 20, 20, 55, 20));
        listOfSets.get(3).addAll(Arrays.asList(70, 75, 20, 80, 75, 70));

        System.out.println(listOfSets);

        System.out.println("-----------------------------------------");
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9, 10};

        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        // System.out.println(listOfArrays); //hashcode

        System.out.println( Arrays.toString( listOfArrays.get(0)));
        System.out.println( Arrays.toString( listOfArrays.get(1)));

        listOfArrays.get(0)[2] = 35;
        System.out.println( Arrays.toString( listOfArrays.get(0)));

        // List<List<Employee>> teams = new ArrayList<>();




        // List<int[][]> l = new ArrayList<>();





    }



}
