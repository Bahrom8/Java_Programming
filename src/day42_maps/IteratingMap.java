package day42_maps;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>(); //random order, does not accept null key & null values, Synchronized
        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Aaron", 89000);
        map.put("Jimmy", 87000);
        map.put("Brianna", 98000);

        System.out.println(map);

        //Iterating by the keys
        System.out.println("---------Keys-------------- ");

        for (String eachKey : map.keySet()) {
            System.out.println(eachKey);
        }
        /*
        for (String eachKey : map.keySet()) {
            map.replace(eachKey, map.get(eachKey) * 2);
        }
        System.out.println(map);

         */

        //Iterating mp by values
        System.out.println("---------Values-------------- ");

        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("----------Entries-------------------------");

        for( Map.Entry<String, Integer> eachEntry : map.entrySet() ){
            System.out.println(eachEntry);
        }

        System.out.println("--------------------------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();
            eachEntry.setValue(eachValue + 10000);

            System.out.println(eachKey + " : " + eachValue);
        }

        System.out.println(map);







    }

}
