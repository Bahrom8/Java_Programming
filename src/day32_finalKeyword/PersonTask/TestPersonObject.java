package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M', LocalDate.of(1991,1,25) );
        System.out.println(person);

        System.out.println("-----------------------------");

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1997, 4, 8), "Accountant", 90000);
        System.out.println(employee);

        employee.breath();


    }

}
