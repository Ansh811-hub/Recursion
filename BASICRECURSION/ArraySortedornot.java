package BASICRECURSION;
import java.util.Scanner;

public class ArraySortedornot {
    public static boolean sorted(int [] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return sorted(arr,index+1);
    }
    public static boolean main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean r = sorted(arr,0);
        return r;
    }
}
