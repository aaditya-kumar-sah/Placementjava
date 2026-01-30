import java.util.Scanner;

public class recursion3{
    public static void printSum(int n, int i, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(n, i+1, sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSum(n, 1, 0);
    }
}
