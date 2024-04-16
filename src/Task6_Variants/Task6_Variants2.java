package Task6_Variants;

public class Task6 {
    //6.создайте матрицу(двумерный массив) int[][], заполните ее таблицей умножения 1-9. Выведите ее.
    public static void main(String[] args) {
        int[][] superArr = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9,10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9,10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9,10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9,10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9,10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9,10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9,10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9,10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9,10},
        };

        for (int i = 1; i < superArr.length; i++) {
            for (int j = 1; j < superArr[i].length; j++) {
                int res = i * j;
                superArr[i][j] = res;
                if (res >= 10){
                    System.out.print(superArr[i][j] + " ");
                }else {
                    System.out.print(superArr[i][j] + "  ");
                }

            }
            System.out.println();
        }

    }

}