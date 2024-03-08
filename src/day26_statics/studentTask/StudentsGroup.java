package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { // StudentsGroup HAS a Student

    public String groupName;
    public int groupID;
    public ArrayList<Student> students;

    public StudentsGroup(String groupName, int groupID) { //creates the StudentsGroup object by setting the groupName and GroupID
        this.groupName = groupName;
        this.groupID = groupID;
        students = new ArrayList<>(); //size: 0
    }

    public void addStudent(Student student){
        students.add(student);
    }// takes one student object, and adds it to the arraylist of students

    public void addStudents(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }

    public void addStudent(String name, int age, char gender, String ID){
       // Student student = new Student(name, age, gender, ID);
        students.add(new Student(name, age, gender, ID));
    } // takes, name, age, gender, ID of student info, creates student object by using the given ifo, then adds to student object of the arraylist

    public void removeStudent(String ID){
        students.removeIf( p-> p.ID.equals(ID) );
    } // takes the ID and then removes the student object with the specified ID from arraylist of students

    public String toString() {
        return "\n\tStudentsGroup" +
                "\ngroupName: " + groupName +
                "\ngroupID: " + groupID +
                "\nnumber of students: " + students.size();

    }
}
