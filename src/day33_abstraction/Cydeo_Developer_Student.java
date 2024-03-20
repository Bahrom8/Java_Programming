package day33_abstraction;

import day32_finalKeyword.PersonTask.Person;

import java.time.LocalDate;

public final class Cydeo_Developer_Student extends Person {

    private final String ID;
    private String batchName;
    private int batchNumber;
    public static final String programmingLanguage;

    public Cydeo_Developer_Student(String name, char gender, LocalDate dateOfBirth, String ID,
                                   String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        if(getAge() < 18){ //if age is set to less than 18
            System.err.println("Cydeo Developer student must be at least 18 years old");
            System.exit(1);
        }
        this.ID = ID;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    static {
        programmingLanguage = "Java";
    }

    public String getID() {
        return ID;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        if(batchName.equalsIgnoreCase("Zero to Hero") || batchName.equalsIgnoreCase("Alumni Dev")){
            this.batchName = batchName;
        }else{
            System.err.println("Invalid bath name: " + batchName + " \nNo such a batch at Cydeo");
            System.exit(1);
        }
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber <= 0){
            System.err.println("Invalid batch Number: " + batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating " + programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking " + programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " does not need to sleep");
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() +
                " name: " + getName() +
                "\ngender: " + getGender() +
                "\nage: " + getAge() +
                "\ndate Of Birth: " + getDateOfBirth() +
                "\nStudent ID: " + ID +
                "\nbatch number: " + batchNumber+
                "\nbatch name: " + batchName;
    }
}
