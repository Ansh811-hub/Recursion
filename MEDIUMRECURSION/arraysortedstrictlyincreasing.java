package MEDIUMRECURSION;

import java.util.Scanner;

public class arraysortedstrictlyincreasing {
    public static boolean sorted(int [] arr, int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return sorted(arr,idx+1);
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println((sorted(arr,0)));
    }
}
