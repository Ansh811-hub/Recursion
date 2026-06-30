package BASICRECURSION;

import java.util.Scanner;

public class FibonacciNumber {
    public static int fibonacci(int n) {
        if(n <= 1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Number cannot be negative.");
            return;
        }

        int res = fibonacci(n);
        System.out.println(res);
    }
}
