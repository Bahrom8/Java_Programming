package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender ", 'M');
        person1.put("age", 27);
        person1.put("job title", "Developer");
        person1.put("ID", "A17");
        person1.put("salary", 100000.5);
        person1.put("married", true);

        System.out.println(person1);
        System.out.println(person1.get("name"));
        System.out.println(person1.get("salary"));
        System.out.println(person1.get("job title"));




    }


}
