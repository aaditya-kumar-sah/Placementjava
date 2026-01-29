public class FactorialNumber{
    public static int Calculatefact(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        int fact_num = Calculatefact(n - 1);
        int factorial = n * fact_num;
        return factorial;
    }
    public static void main(String args[]){
        int n = 5;
        int ans = Calculatefact(n);
        System.out.println(ans);
    }
}