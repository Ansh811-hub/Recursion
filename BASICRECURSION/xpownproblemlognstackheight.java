package BASICRECURSION;

public class xpownproblemlognstackheight {
    public static int problem1(int x, int n){
if(n==0){
    return 1;
}
if(n==0){
    return 0;
}
if(n%2==0){
    return problem1(x, n/2)*problem1(x,n/2);
}
else{
    return problem1(x,n/2)*problem1(x,n/2) * x;
}
    }
    public static void main(String [] args){
int x = 2, n =5;
int ans = problem1(x,n);
System.out.println(ans);
    }
}
