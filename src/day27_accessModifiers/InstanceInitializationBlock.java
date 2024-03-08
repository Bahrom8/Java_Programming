package day27_accessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;

/*
    {
        name = "James";
        age = 20;
    }

 */

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

/*
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock();
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();

        System.out.println(obj1.name);
        System.out.println(obj2.name);

 */

        InstanceInitializationBlock obj = new InstanceInitializationBlock("James", 20);
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("Reece", 24);

        System.out.println(obj.name);
        System.out.println(obj1.name);

    }


}
