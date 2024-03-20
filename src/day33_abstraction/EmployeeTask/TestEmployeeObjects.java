package day33_abstraction.EmployeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        //we cannot create an object from an abstract class, Objects MUSt be created from a concrete class

        Teacher teacher = new Teacher("Muhtar", 30, 'M', "Java Teacher", "GOAT", 1000000);
        System.out.println(teacher);
        System.out.println();
        teacher.work();
        System.out.println("----------------------------");

        Developer developer = new Developer("Ronaldo", 38, 'M', "Java Developer", "The GOAT", 1200000, "Java");
        System.out.println(developer);
        System.out.println();
        developer.work();
        System.out.println("------------------------------");

        Tester tester = new Tester("Shukhrat", 27, 'M', "SDET", "A17", 150000);
        System.out.println(tester);
        System.out.println();
        tester.work();
        System.out.println("------------------------------");

        Driver driver = new Driver("Josh", 38, 'M', "Driver", "ABCD12", 100000);
        System.out.println(driver);
        System.out.println();
        driver.work();
        System.out.println("------------------------------");



    }

}
