package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> student1 = new TreeMap<>();
        student1.put("A17", "John");
        student1.put("D47", "Emily");
        student1.put("A08", "Alex");
        student1.put("B01", "Donald");
        student1.put("D35", "Joe");
        student1.put("D01", "Donald");
        student1.put("B02", "Donald");
        student1.put("D02", "Donald");
        student1.put("D03", "Donald");

        System.out.println(student1.size());
        System.out.println(student1);
        System.out.println(student1.get("B01"));
        student1.put("B01", "Trump");
        student1.put("D03", "Biden");
        System.out.println(student1);

        System.out.println(student1.get("B01"));

        student1.replace("D02", "Bush");
        System.out.println(student1);

        student1.remove("A08");
        System.out.println(student1);

        System.out.println(student1.containsKey("D02")); //true
        System.out.println(student1.containsKey("F02")); //false

        System.out.println(student1.containsValue("Joe")); //true
        System.out.println(student1.containsValue("Muhtar"));  //false

        System.out.println(student1.isEmpty()); //false
        System.out.println(student1.equals(student1)); //true

        student1.clear(); //clears everything
        System.out.println(student1);


    }

}
