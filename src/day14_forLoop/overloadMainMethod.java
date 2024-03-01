package day14_forLoop;

import java.sql.SQLOutput;

public class overloadMainMethod {
    public static void main(String[] args) {
        System.out.println("A");
        main(25);
        main(1.5);
        main(true);
    }
    public static void main(int args){
        System.out.println("B");
    }
    public static void main(double args){
        System.out.println("C");
    }
    public static void main(boolean args){
        System.out.println("D");
    }
}
