package pl.coderslab.methods;

import java.util.Arrays;

public class Main15 {
    // zadanie domowe nr 3 Tablice
    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnUnique(new int [] {1,2,3,0,3,3,9,0})));
        System.out.println(Arrays.toString(returnUnique1(new int []{1,2,3,0,3,3,9,0})));
    }
    public static int[] returnUnique(int[] arr) {
        int [] arrTemp  = new int[arr.length];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!contains(arrTemp,arr[i],temp)){
                arrTemp[temp] = arr[i];
                temp++;
            }
        }
        return Arrays.copyOf(arrTemp,temp);
    }
    public static boolean contains (int[] arr, int element, int temporary){
        for (int i = 0; i < temporary; i++){
            if (arr[i] == element){
                return true;
            }
        }
        return false;
    }

    public static int [] returnUnique1(int [] arrn ){
        int [] arTem = new int[arrn.length];
        int tem = 0;
        //int [] unique = Arrays.copyOf(arTem,tem); z tym nie zadziała
        for(int i = 0; i< arrn.length; i++){
            if(!contains(arTem,arrn[i],tem )){
                arTem[tem] = arrn[i];
                tem++;
            }
        }
        return Arrays.copyOf(arTem,tem);
    }
}