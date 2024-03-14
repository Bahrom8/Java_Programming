package day29_Inheritance.animalTask;

public class Cat extends Animal {// Cat Is An Animal

    public void meow(){
        System.out.println(getName() + " is meowing");
    }

    public void scratch(){
        System.out.println(getName() + " is scratching");
    }
}
