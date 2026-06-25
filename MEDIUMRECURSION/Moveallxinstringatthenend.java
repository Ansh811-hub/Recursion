package MEDIUMRECURSION;

import java.util.Scanner;

public class Moveallxinstringatthenend {
    public static void solve(String str, int idx, int count, String str1){
        if(idx == str.length()){
            for(int i = 0; i < count; i++){
                str1 = str1 + 'x';
            }
            System.out.println("after sending all x at the end");
            System.out.println(str1);
            return;
        }
        char curr = str.charAt(idx);
        if(curr != 'x'){
            str1 = str1 + curr;
            solve(str, idx+1, count, str1);
        }else{
            count++;
            solve(str, idx+1, count, str1);
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string that contains x ");
        String str=sc.nextLine();
        int count = 0;
        String str1 = new String();
        solve(str,0,count,"");


    }
}
