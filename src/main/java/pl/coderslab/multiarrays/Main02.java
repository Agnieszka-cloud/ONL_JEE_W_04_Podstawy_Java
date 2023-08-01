package pl.coderslab.multiarrays;

public class Main02 {

    public static void main(String[] args) {

		//int[][] task2Array = { { 2, 3, 4 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4, 5 }, { 5, 1, 6, 7, 8 } };
        int k = 0;
        int [][] tablica = new int[4][3];
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {

                tablica[i][j] = k;
                k++;
                System.out.print(tablica[i][j]);
            }
        }
    }
}


