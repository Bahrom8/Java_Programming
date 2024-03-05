package day21_multiDimentionalArray;

import java.util.Arrays;

public class multiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"Muhammad", "Yasin", "Yahya", "Yusuf"};
        String[] group2 = {"Madina", "Rustam", "Michelle"};
        String[] group3 = {"Assiya", "Bizhan", "Emanuel", "Nazgul", "Farah"};
        String[] group4 = {"Bakhrom", "Maryam"};

        String[][] groups = {group1, group2, group3, group4};

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println((eachStudent));
            }
        }

        System.out.println("------------------------------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString( eachGroup) );
            for (String eachStudents : eachGroup) {
                System.out.println(eachStudents);
            }
        }

        System.out.println("------------------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroups = groups[i];
            System.out.println(Arrays.toString(eachGroups));

            /*
            for (int j = eachGroups.length - 1; j >= 0; j--) {
                String eachStudents = eachGroups[j];
                System.out.println(eachStudents);
            }

             */

            for (String eachStudents : eachGroups) {
                System.out.println(eachStudents);
            }

        }

        System.out.println("------------------------------------------------");

        System.out.println(Arrays.toString( groups)); //toString() --> for single dimensional arrays ONLY

        System.out.println(Arrays.deepToString(groups));



    }

}
