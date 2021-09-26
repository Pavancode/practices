package Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner p = new Scanner(System.in);
        int i =0;
        while (i< arr.length){
            arr[i] = p.nextInt();
        }
        while (i< arr.length){
            System.out.println(arr[i]);
        }

    }
}
