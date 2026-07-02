package BASICRECURSION;

import java.util.Scanner;

public class sumoffirstnmumbers {
    public static void sum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sum(i+1, n, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        sum(1,n,0);
    }
}
