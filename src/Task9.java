public class Task8 {
    //Создайте матрицу char[][], проинициализируйте ее латинским алфавитом,
    // выведите его. Подсказка -можно получить первую букву как char ch = ‘a’, следующую -как ch + 1, и так далее.
    public static void main(String[] args) {
        char[][] superArr = new char[4][7];
        char ch = 'a';
        int count = 0;
        for (int i = 0; i < superArr.length; i++) {
            for (int j = 0; j < superArr[i].length; j++) {
                if (i == 0) {
                    superArr[i][j] = (char) (ch + j);
                    count = superArr[i][j];
                }else if (i == 1) {
                    superArr[i][j] = (char) (count + j + 1);
                }else if (i == 2) {
                    superArr[i][j] = (char) ((count + j + 7));
                } else   {
                    superArr[i][j] = (char) (count + j + 13);
                }


                System.out.print(superArr[i][j] + " ");

            }
            System.out.println();
        }

    }
}