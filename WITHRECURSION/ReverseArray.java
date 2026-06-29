package WITHRECURSION;

import java.util.Scanner;

public class ReverseArray {
        public static void helper(int[] arr, int low, int high) {
            if (low >= high) {
                return;
            }
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            helper(arr, low + 1, high - 1);
        }

        public static void reverse(int[] arr) {
            helper(arr, 0, arr.length - 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter size:");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            reverse(arr);

            System.out.println("Reversed array:");
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }
    }

