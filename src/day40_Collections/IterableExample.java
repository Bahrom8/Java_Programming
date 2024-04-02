package day40_Collections;

import java.util.*;

public class IterableExample {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 4, 7, 8, 9, 10));
        /*
        for (Integer each : list) {
            if(each < 5){
                list.remove(each);
            }
        }

         //----------------------------------------------------------------

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 5){
                list.remove(i);
            }

        }

        System.out.println(list);

         */

        System.out.println("-----------------------------------------------------------------");

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            Integer each = it.next();
            if(each < 5){
                it.remove();
            }
        }

        System.out.println(list);

        System.out.println("------------------------------------------------------------");

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 4, 7, 8, 9, 10));

        for (Iterator<Integer> i = list2.iterator(); i.hasNext(); ) {
            Integer each =  i.next();
            if(each < 5){
                i.remove();
            }
        }
        System.out.println(list2);

        System.out.println("------------------------------------------------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 4, 7, 8, 9, 10));

        list.removeIf(each -> each < 5);
        System.out.println(list3);

        System.out.println("------------------------------------------------------------");

        List<Integer> list4 = new LinkedList<>();
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 4, 7, 8, 9, 10));
        list4.removeIf(p-> p < 5);
        System.out.println(list4);




    }


}
