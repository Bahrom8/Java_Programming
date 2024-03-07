package day25_Constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee("Bakhrom",26,'M',"Java Developer", 170000, LocalDate.of(2024,9,15));
        Employee e2 = new Employee("Mohammad",29,'M',"Manager", 150000, LocalDate.of(2022,4,28));
        Employee e3 = new Employee("Shukhrat",27,'M',"SDET", 140000, LocalDate.of(2024,3,14));
        Employee e4 = new Employee("Dilnoza",29,'F',"Java Developer", 210000, LocalDate.of(2025,11,21));
        Employee e5 = new Employee("Alexandra",31,'F',"Data Analyst", 120000, LocalDate.of(2018,7,2));

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);


    }


}
