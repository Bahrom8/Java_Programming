package day17_customClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setInfo("John", 32, 'M', "Java Developer", 125000, "A7895");

        Employee employee2 = new Employee();
        employee2.setInfo("Alex", 26,'M',"Back-end Developer", 12000, "B1245");

        Employee employee3 = new Employee();
        employee3.setInfo("Lilly", 29, 'F', "Front-end Developer", 13000, "D1324");


        employee2.age = 39;

        employee3.name = "Lucy";
        employee3.gender = 'F';


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();

    }

}
