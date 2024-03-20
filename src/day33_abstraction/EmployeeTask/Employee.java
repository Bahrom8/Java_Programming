package day33_abstraction.EmployeeTask;

public abstract class Employee {

    private String name, jobTitle, ID;
    private int age;
    private char gender;
    private double salary;

    public Employee(String name, int age, char gender, String jobTitle, String ID, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        setJobTitle(jobTitle);
        setID(ID);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work(); // abstract method (uncompleted method)

    public String toString() {
        return "\n" + getClass().getSimpleName() +
                " name: " + name +
                "\njob Title: " + jobTitle +
                "\nID: " + ID +
                "\nage: " + age +
                "\ngender: " + gender +
                "\nsalary: " + salary;
    }
}
