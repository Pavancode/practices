package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(56);
//        list.add(587);
//        list.add(854);
//        list.add(7);
//        list.add(58);
//        list.add(57);
//        list.set(0,1);
//        list.remove(2);
         int i =0;
         while (i<5){
             System.out.println("ENTER THE NUMBERS");
             list.add(in.nextInt());
             i++;
         }

         boolean p = list.contains(7895);
        System.out.println();


        System.out.println(list);




    }
}
