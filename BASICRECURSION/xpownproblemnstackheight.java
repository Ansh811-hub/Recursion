package BASICRECURSION;

public class xpownproblemnstackheight {
    public static int problem(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xpown1 = problem(x,n-1);
        int xpown = x*xpown1;
        return xpown;
    }
public static void main(String args []){
int x = 2, n =5;
int ans = problem(x,n);
System.out.println(ans);
}
}
