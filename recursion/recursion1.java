public class recursion1{
    public static void int clacPow(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int xpow1 = clacPow(x, n - 1);
        int xPown = x * xpow1;
        return xPown;
    }
    public static void main(String args[]){
        int x = 5, n = 5;
        System.out.println(clacPow(x, n));
    }
}