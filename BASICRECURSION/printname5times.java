package BASICRECURSION;

import java.util.Scanner;

public class printname5times {
    public static void print(String name, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(name);
        print(name, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter number of times you wanna print : ");
        int n = sc.nextInt();
        print(name, n);

    }
}