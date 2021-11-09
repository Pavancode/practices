import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        int i =0;
        Scanner p = new Scanner(System.in);
        int row =p.nextInt();
        int column = p.nextInt();
        while(i<row){
             int j=0;
            while(j<column){
                System.out.print("$ ");
                j++;
            }
            column--;
            System.out.println();
            i++;
        }
    }
}
