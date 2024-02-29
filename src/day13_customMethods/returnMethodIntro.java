package day13_customMethods;

public class returnMethodIntro {
    public static void main(String[] args) {

       // int total = sum(25,50); // sum is a void method, does not return any data
        int total = addition(10,20);
        System.out.println(total);
        System.out.println(square(5));
        System.out.println(cube(3));

    }

    /*
    public static void sum(int n1, int n2){

        int result = n1 + n2;
        System.out.println(result);

     */

    public static int addition(int n1, int n2){

        int result = n1 + n2;
        return result;
    }

    public static int square (int num){
        int square = num * num;
        return square;
    }

    public static int cube(int num){
        int cube = square(num) * num;
        return cube;
    }


}
