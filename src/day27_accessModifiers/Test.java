package day27_accessModifiers;

public class Test {

    public static void main(String[] args) {

       // new StaticInitializationBlock();

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("-------------------------------");

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.protectedData);
        System.out.println(AccessModifiers.defaultData);
        //System.out.println(AccessModifiers.privateData);

        new AccessModifiers();
        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        //AccessModifiers.privateMethod();

    }

}
