import java.util.Scanner;

public class NoPositiveOrNegative {
     static String result;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(checknumber(in.nextInt()));


    }

    static String checknumber(int a){
        if(a>0){
            result = "Positive";
            return result;
        }
        if (a<0){
            result = "negative";
            return result;
        }
        if (a ==0){
            result = "zero";
            return result;
        }
        String S = "YOU NOT ENTERED THE RIGHT NUMBER";
        return S;
    }
}
