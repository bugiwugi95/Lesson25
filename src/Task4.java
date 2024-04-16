public class Task3 {
    //.Создайте двумерный массив, задайте для него значения, выведите его элементы.
    public static void main(String[] args) {
        // int[][] superArr = {{1, 2, 3, 4, 5},{1, 2, 3, 4, 5},{1, 2, 3, 4, 5}};
        int[][] superArr = new int[3][3];
        superArr[0][0] = 1;
        superArr[0][1] = 2;
        superArr[0][2] = 3;

        superArr[1][0] = 1;
        superArr[1][1] = 2;
        superArr[1][2] = 3;

        superArr[2][0] = 1;
        superArr[2][1] = 2;
        superArr[2][2] = 3;

        for (int i = 0; i < superArr.length; i++) {
            for (int j = 0; j < superArr[i].length; j++) {
                System.out.print(" " + superArr[i][j] + " ");
            }
            System.out.println();
        }

    }

}