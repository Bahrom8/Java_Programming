package day17_customClass;

public class testDogObjects {

    public static void main(String[] args) {

       Dog dog1 = new Dog();
        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1. size = "Large";
        dog1. color = "Gray";


        Dog dog2 = new Dog();

        dog2.name = "Loki";
        dog2.breed = "German Shepherd";
        dog2.gender = 'F';
        dog2.age = 3;
        dog2.size = "S" +
                "mall";
        dog2.color = "Black";

        Dog dog3 = new Dog();
        dog3.setInfo("loki", "Chow chow", "Medium", 'M', 3, "Gold");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

    }

}
