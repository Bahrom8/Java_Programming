package day33_abstraction.EmployeeTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is testing");
    }
}
