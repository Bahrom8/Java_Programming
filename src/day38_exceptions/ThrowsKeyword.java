package day38_exceptions;

import java.io.FileInputStream;

public class ThrowsKeyword {

    public static void main(String[] args)  throws InterruptedException {
/*
        System.out.println("program started");

        //System.out.println(100/0);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("program ended");

        System.out.println("-------------------------------");

        System.out.println("program2 started");

        //System.out.println(100/0);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("program2 ended");

 */

        System.out.println("program started");

            Thread.sleep(5000);

        System.out.println("program ended");

        System.out.println("---------------------------------");

        System.out.println("program2 started");

        Thread.sleep(5000);

        System.out.println("program2 ended");

        System.out.println("---------------------------------");

        System.out.println("program3 started");

        //FileInputStream file = new FileInputStream("");
        Thread.sleep(3000);

        System.out.println("program3 ended");






    }

}
