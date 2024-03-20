package day33_abstraction.EmployeeTask;

public class Driver extends Employee{

    public Driver(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving");
    }
}
