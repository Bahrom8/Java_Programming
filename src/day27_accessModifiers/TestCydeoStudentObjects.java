package day27_accessModifiers;

public class TestCydeoStudentObjects {

    public static void main(String[] args) {

        CydeoStudents student1 = new CydeoStudents("Ekaterina", 29, 'F');
        CydeoStudents student2 = new CydeoStudents("Alena", 28, 'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(student2.magicWord);
        System.out.println(student1.magicWord);




    }


}
