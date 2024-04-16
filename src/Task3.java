public class Task2 {
    //Выведите таблицу умножения 1-20
    public static void main(String[] args) {
        for (int row = 1; row <= 20; row++) {
            for (int col = 1; col <= 20; col++) {
                int res = row * col;
                if (res >= 100) {
                    System.out.print(res + " ");
                } else if (res >= 10) {
                    System.out.print(res + "  ");
                } else {
                    System.out.print(res + "   ");
                }

            }
            System.out.println();

        }
    }
}