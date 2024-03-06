package day23_arrayList;

import java.util.ArrayList;

public class removeDuplicates {

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

        System.out.println(names);
        // [Vasya, Anton, Sasha, Anton, Peter, Vasya, Ali, Sofia, Ali]

        ArrayList<String>nonDup = new ArrayList<>();
        for (String each : names) {
            if(nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);

        }

        names = nonDup;

        System.out.println(names);
        //[Vasya, Anton, Sasha, Peter, Ali, Sofia]

    }

}
