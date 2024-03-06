package day23_arrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasya");
        names.add("Anton");
        names.add("Sasha");
        names.add("Anton");
        names.add("Peter");
        names.add("Vasya");
        names.add("Ali");
        names.add("Sofia");
        names.add("Ali");

        for (String each : names) {
            if(names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);
            }
        }


    }

}
