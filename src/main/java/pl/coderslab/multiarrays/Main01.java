package pl.coderslab.multiarrays;

import java.lang.reflect.Array;

public class Main01 {

    public static void main(String[] args) {

		int[][] task1Array = {
		        { 2, 3, 4 },
                { 12, 32, 12, 11 },
                { 3, 2, 1, 4, 5 },
                { 5, 1, 6, 7, 8 } };
        for (int i = 0; i < task1Array.length; i++) {
            for (int j = 0; j < task1Array[i].length; j++) {
                System.out.println(task1Array[i][j] + ",");
            }
        }
    }
}
