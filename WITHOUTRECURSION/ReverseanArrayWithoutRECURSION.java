package WITHOUTRECURSION;

import java.util.Scanner;

public class ReverseanArrayWithoutRECURSION {
    public static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n / 2; i++) {
            if (i < n / 2) {
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
    }
}