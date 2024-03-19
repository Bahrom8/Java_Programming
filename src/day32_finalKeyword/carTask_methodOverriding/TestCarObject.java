package day32_finalKeyword.carTask_methodOverriding;

public class TestCarObject {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "Black",  2020, 28000);

        Honda honda = new Honda("Accord", "White", 2017, 21000);

        Audi audi = new Audi("A4", "Silver", 2020, 36000);

        BMW bmw = new BMW("X7", "Black", 2023, 70000);

        Tesla tesla = new Tesla("Model X", "Gray", 2024, 80000);

        System.out.println(toyota);
        System.out.println("------------------");
        System.out.println(honda);
        System.out.println("------------------");
        System.out.println(audi);
        System.out.println("------------------");
        System.out.println(bmw);
        System.out.println("------------------");
        System.out.println(tesla);

        System.out.println("------------------");
        toyota.start();
        honda.start();
        audi.start();
        bmw.start();
        tesla.start();
        tesla.autoPilot();

        System.out.println("------------------");

        //tesla.setPrice(30000);
        //tesla.setModel("Model z");
        //tesla.setYear(2000);
        //tesla.setColor("Pink");

        System.out.println(tesla);


    }

}
