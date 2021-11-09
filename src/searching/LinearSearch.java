package searching;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {10,52,45,45,487,454,88,784};
        searching(arr);
    }

    public static void searching(int[] a) {
        Scanner in = new Scanner(System.in);
        int i =0;
        boolean b = false;
        System.out.println("enter the number which you want to search");
        int ser = in.nextInt();
        while (i<a.length){
            if (a[i] == ser){
                System.out.println("waw your number "+ser+" found in array at index "+i);
                b = true;
            }
            i++;
        }
        if (b!= true){
            System.out.println("oops sorry "+ser+" is not in array");
        }
    }

}
