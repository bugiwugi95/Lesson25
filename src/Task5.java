public class Task4 {
    //4.Создайте двумерный массив. Выведите его предпоследнюю строчку
    public static void main(String[] args) {
        int[][] superArr = {{1, 2, 3, 4, 5}, {11, 22, 33, 44, 55}, {10, 20, 30, 40, 50}};
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < superArr[i].length; j++) {
                System.out.print(superArr[i][j] + " ");
            }
        }

    }

}