package day41_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<String, Integer> hashmap = new HashMap<>(); //random order, accept one null key & multiple null values
        hashmap.put("Daniel", 95000);
        hashmap.put("Emily", 100000);
        hashmap.put("Bella", 85000);
        //hashmap.put("Bella", 80000);
        hashmap.put("Aaron", 89000);
        hashmap.put("Chris", null);
        hashmap.put("Brianna", null);
        hashmap.put(null, 120000);
        hashmap.put(null, 99000);
        hashmap.put(null, 99000);
        System.out.println("HashMap = " + hashmap);
        
        System.out.println("----------------------------------------------------------------------------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); //insertion order, accept one null key & multiple null values
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        //linkedHashMap.put("Bella", 80000);
        linkedHashMap.put("Aaron", 89000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Brianna", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 99000);
        linkedHashMap.put(null, 99000);
        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("----------------------------------------------------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>(); //sorted order, does not accept null key but accepts null values
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        //treeMap.put("Bella", 80000);
        treeMap.put("Aaron", 89000);
        treeMap.put("Chris", null);
        treeMap.put("Brianna", null);
        //treeMap.put(null, 120000);
        //treeMap.put(null, 99000);
        //treeMap.put(null, 99000);
        System.out.println("treeMap = " + treeMap);

        System.out.println("----------------------------------------------------------------------------");

        Map<String, Integer> hashtable = new Hashtable<>(); //random order, does not accept null key & null values, Synchronized
        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        hashtable.put("Aaron", 89000);
        //hashtable.put("Chris", null);    //Value cannot be null
        //hashtable.put("Brianna", null);
        //hashtable.put(null, 120000);     //key cannot be null
        //hashtable.put(null, 99000);
        try {
            hashtable.put("null", 99000);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("hashtable = " + hashtable);







    }


}
