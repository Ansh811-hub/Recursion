package WITHRECURSION;

import java.util.Scanner;

public class BinarySearchRecursion {
    public int search(int[] nums, int target) {
        return helper(nums,target,0,nums.length);
    }
    public static int helper(int [] nums,int target,int low,int high){
        if(low>high){
            return -1;
        }
        int mid = low +(high-low)/2;
        while(low<high){
            if(target == nums[mid]){
                return mid;
            }else if(nums[mid] <target){
                helper(nums,target,mid+1,high);
            }else if(nums[mid] > target){
                helper(nums,target,low,mid-1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        BinarySearchRecursion bsr = new BinarySearchRecursion();
        int result = bsr.search(arr,target);
        System.out.println(result);
    }
}
