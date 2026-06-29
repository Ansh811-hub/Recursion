package WITHRECURSION;

import java.util.Scanner;

public class Palindromestring {
    public static void palindrome(String str) {
        int n = str.length();
        Boolean ans = helper(str, 0, n - 1);
        System.out.println(ans);
    }

    static Boolean helper(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return helper(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        palindrome(str);
    }
}