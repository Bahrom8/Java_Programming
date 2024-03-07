package day25_Constructor;

public class ConstructorIntro {

    public ConstructorIntro(){
        System.out.println("Objects is created bu using no argument constructor");
    }

    public ConstructorIntro(int a){
        System.out.println("Objects is created bu using int argument constructor");
    }
/*
    public ConstructorIntro(String str){
        System.out.println("Objects is created bu using int argument constructor");
    }

 */

    public void add(){

    }

    public static void main(String[] args) {

        ConstructorIntro obj1 = new ConstructorIntro( 7);
        ConstructorIntro obj2 = new ConstructorIntro( );
       // ConstructorIntro obj3 = new ConstructorIntro( "Java");


    }

}

