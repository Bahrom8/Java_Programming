package day26_statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 22, 'M', "A16");

        Student student2 = new Student("Gregor", 26, 'M', "B42");
        Student student3 = new Student("Sumeyye", 21, 'F', "C77");
        Student student4 = new Student("Mansur", 27, 'M', "D34");
        Student student5 = new Student("Fatima", 23, 'F', "E77");

        Student[] students = {student2, student3, student4, student5};

        StudentsGroup group1 = new StudentsGroup("TechTitans", 2);

        group1.addStudent(student1);

        group1.addStudents(students);

        group1.addStudent("Bakhrom", 26, 'M', "B17");

        System.out.println(group1);

        group1.removeStudent("D34");
        group1.removeStudent("B42");

        System.out.println(group1);

        System.out.println("--------------------------------------------------------");

        for (Student each : group1.students) {
            System.out.println(each.name + " and Student ID is " + each.ID);
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");

        StudentsGroup group2 = new StudentsGroup("Group2", 2);

        StudentsGroup group3 = new StudentsGroup("Group3", 3);

        StudentsGroup group4 = new StudentsGroup("Group4", 4);



        StudentsGroup[] groups = {group1, group2, group3, group4};



    }

}
