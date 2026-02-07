package stack;
import java.util.*;

public class copy_elems{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();

        System.out.println("enter the number of elems you want to insert");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i ++){
            System.out.println("enter the elems:");
            int x = sc.nextInt();
            st.push(x);
        }

        Stack<Integer> ct = new Stack<>();
        while(st.size() > 0){
            int c = st.peek();
            ct.push(c);
            st.pop();
        }
        System.out.println(st);
        System.out.println(ct);
    }
}