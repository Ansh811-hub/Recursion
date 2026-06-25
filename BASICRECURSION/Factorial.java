package BASICRECURSION;

public class Factorial {
    public static int number(int n){
        if(n==0 || n == 1) {
            return 1;
        }
        int factn = number(n-1);
        int factm = n *  factn;
        return factm;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = number(n);
        System.out.println(ans);
    }
}
