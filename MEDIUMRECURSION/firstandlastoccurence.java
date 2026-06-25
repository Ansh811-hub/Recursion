package MEDIUMRECURSION;

import java.util.Scanner;

public class firstandlastoccurence {
    public static int first = -1;
    public static int last = -1;

    public static void occurence(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println("first occurence");
            System.out.println(first);
            System.out.println("last occurence");
            System.out.println(last);
            return;
        }
        char curr =  str.charAt(idx);
        if(curr==element){
            if(first==-1) {
                first = idx;
                last = idx;
            }else{
                last = idx;
            }
        }
        occurence(str,idx+1,element);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        System.out.println("enter character to find occurence : ");
        char str1 = sc.next().charAt(0);
        occurence(str,0,str1);
    }
}
