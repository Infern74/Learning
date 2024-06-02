public class Multidimensional_arrays {
    public static void main(String[] args) {
        int [] numbers = {1,2,3};
        int[][] matrix = {{1,2,3,123,19},
                          {4},
                          {7,8,9}};
        System.out.println(matrix[2][1]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[0][3]);

        String[][] strings = new String[2][3];
        strings[0][1] = "Hello";
        System.out.println(strings[0][1]);

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
