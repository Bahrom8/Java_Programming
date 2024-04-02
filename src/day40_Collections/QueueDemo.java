package day40_Collections;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue.addAll(Arrays.asList(10, 200, 300, 40, 90));
       // queue.addAll(Arrays.asList(10, 200, 300, 40, 90, null ,null));

        System.out.println(queue);
        int num1 = queue.poll(); //FIFO

        System.out.println(queue);
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue);

        //System.out.println(queue.get(4));

        System.out.println("--------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>(); //insertion order, does not accept null
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        // queue2.addAll(Arrays.asList(10, 200, 300, 40, 90, null ,null));

        System.out.println(queue2);

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println(queue2);

        //System.out.println(queue2.get(4));

        System.out.println("-----------------------------------");

        Queue<Integer> queue3 = new LinkedList<>(); // insertion order
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90, null ,null));

        System.out.println(queue3);

        queue3.poll();

        System.out.println(queue3);

        System.out.println(  ((LinkedList<Integer>) queue3).get(4)  );


        System.out.println("------------------------------------");

        List<Integer> list = new LinkedList<>();

        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list.get(1));
        System.out.println(list);
         ((LinkedList<Integer>) list).poll(); //FIFO

        System.out.println(list);

       //  ((Stack) list).pop(); //LIFO
        System.out.println(list);


    }


}
