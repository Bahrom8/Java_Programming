package day21_multiDimentionalArray;

public class multiDimensionalArrayPractice3 {

    public static void main(String[] args) {

        int[][][] arr3D1 = { {{1, 2}, {3, 4, 5}},    {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}} };
        int[][][] arr3D2 = { {{1, 2}, {3, 4, 5}},    {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}} };
        int[][][] arr3D3 = { {{1, 2}, {3, 4, 5}},    {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}} };

        int[][][][] arr4D = { arr3D1, arr3D2, arr3D3 };

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int elements : each1D) {
                        System.out.println(elements);
                    }
                }
            }
        }


    }

}
