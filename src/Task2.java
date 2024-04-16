public class Task1 {
    //Выведите таблицу умножения 1-9
    public static void main(String[] args) {
        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= 9; col++) {
                int res = row * col;
                if (res >= 10) {
                    System.out.print(res + " ");
                } else {
                    System.out.print(res + "  ");
                }

            }
            System.out.println();

        }
    }
}