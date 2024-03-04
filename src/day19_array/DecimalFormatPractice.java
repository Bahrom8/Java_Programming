package day19_array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.000");

        double n1 = 10.5898745;

        System.out.println( df.format(n1) );

    }
}
