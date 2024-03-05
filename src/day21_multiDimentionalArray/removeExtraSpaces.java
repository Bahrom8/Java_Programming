package day21_multiDimentionalArray;

import java.util.Arrays;

public class removeExtraSpaces {

    public static void main(String[] args) {

        String str = "  Hello  world       I      love    Java     ";

        String[] words = str.split(" ");

        str = "";

        for (String each : words) {
            if(!each.isEmpty()){
                str += each + " ";
            }
        }

        str = str.trim(); //to remove the last space

        System.out.println(str);

    }
}
