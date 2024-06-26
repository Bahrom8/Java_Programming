package day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        
        String str = "bbcccaaaaa";

        Map<Character, Integer> map = new LinkedHashMap<>(); //line 14
        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            map.put(each.charAt(0), frequency); //one way
            //map.put(each, frequency); //another way but we need to change Character to String in line 14



        }
        System.out.println(map);
        
        
    }
    
}
