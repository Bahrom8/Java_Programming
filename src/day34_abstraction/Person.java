package day34_abstraction;

import day34_abstraction.animalTask.Playable;
import day34_abstraction.animalTask.Swimmable;

public class Person implements Swimmable, Playable {

    @Override
    public void play() {
        System.out.println("Can play");
    }

    @Override
    public void swim() {
        System.out.println("can swim");
    }
}
