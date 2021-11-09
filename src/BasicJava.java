import java.util.Scanner;

public class BasicJava {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 --> check odd or even");
        System.out.println("2 --->check prime or non-prime");
        System.out.println("3 ----> find factorial");
        System.out.println("4 ------> find fibonacci series");
        int n = sc.nextInt();
        switch (n){
            case 1:
                oddOrEven(sc);
                break;
            case 2:
                primeOrNonPrime(sc);
                break;

            case 3:
                fact(sc);
                break;

            case 4:
                fibbonacci(sc);
            default:
                System.out.println("enter the valid input");
        sc.close();
        }
    }

    private static void fact(Scanner sc) {
        System.out.println("enter the number");
        int num = sc.nextInt();
        int i =1;
        int result = 1;
        while(i<=num){
            result = (i * result);
            i++;
        }
        System.out.println("the factorial of number "+num+" is "+result);
    }

    private static void primeOrNonPrime(Scanner sc) {
        System.out.println("enter the number please");
        int num = sc.nextInt();
        int half = num/2;
        int i = 2;
        boolean flag = false;
        if (num==0 || num==1){
            System.out.println(num+"the number is not prime");
        }
        while (i<=half){
            if (num%i==0){
                System.out.println("the num "+num+" is not prime");
                flag = true;
                break;
            }
            i++;
        }
        if (flag == false){
            System.out.println(num+"is prime");
        }
    }

    private static void oddOrEven(Scanner sc) {
        System.out.println("enter the number which you want to check odd or even");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is even");
        }
        else{
            System.out.println(num+"is odd");
        }

    }

    public static void fibbonacci(Scanner s) {
        System.out.println("enter the number");
        int num = s.nextInt();
        int n1 =0;
        int n2=1;
        int n3;
        System.out.println(n1);
        System.out.println(n2);
        int i = 2;
        int result = 1;
        while (i<num){
            n3=n1+n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            i++;
        }
    }
}
