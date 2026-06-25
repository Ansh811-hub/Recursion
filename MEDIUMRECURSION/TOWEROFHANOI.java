package MEDIUMRECURSION;

import java.util.Scanner;

public class TOWEROFHANOI {
    public static void hanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        hanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        hanoi(n - 1, helper, src, dest);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n, "A", "B", "C");
    }
}
