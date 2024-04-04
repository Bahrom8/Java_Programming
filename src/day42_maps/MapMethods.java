package day42_maps;

import java.util.LinkedHashMap;
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

        Map<String, String> employees = new TreeMap<>();
        employees.putAll(student1);
        System.out.println(employees);

        System.out.println(student1 == employees); //false
        System.out.println(student1.equals(employees)); // true



    }

}
