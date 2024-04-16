public class Task77 {
    //7.Создайте матрицу int[][],
    // заполните ее календарем на текущий месяц:пн вт ср чт пт сб вс1   2   3  4   56   7   8   9 10 11  12
    public static void main(String[] args) {
        int[][] superArr = new int[5][7];
        String[] arr = {"пн", "вт", "ср", "чт", "пт", "сб", "вс"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < superArr.length; i++) {
            for (int j = 0; j < superArr[i].length; j++) {
                if (i == 0) {
                    superArr[i][j] = j + 1;
                    count = superArr[i][j];
                } else if (i == 1) {
                    superArr[i][j] = count + (j + 1);
                } else if (i == 2) {
                    superArr[i][j] = count + (j + 1) + count;
                } else if (i == 3) {
                    superArr[i][j] = count + (j + 1) + count + count;
                } else {
                    superArr[i][j] = count + (j - 3) + count + count + count;
                }

                if (superArr[i][j] >= 10) {
                    System.out.print(superArr[i][j] + "  ");
                } else {
                    System.out.print(superArr[i][j] + "   ");
                }


            }
            System.out.println();
        }

    }

}