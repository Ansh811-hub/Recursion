package WITHOUTRECURSION;

import java.util.Scanner;

public class PalindromeStringWithoutRECURSION {
    public static boolean palindrome(String str) {
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--){
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        palindrome(str);
    }
}
