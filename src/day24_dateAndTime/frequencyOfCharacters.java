package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class frequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbbbcccccdddddd"; //a3b4c5d6
        String result = "";

        for (String each : str.split("")) {
            int frequency =  Collections.frequency(Arrays.asList( str.split("")), each );

            if(!result.contains(each)){
                result +=each + frequency;
            }

        }
        System.out.println(result);




    }

}
