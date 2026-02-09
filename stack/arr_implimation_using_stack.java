package stack;

public class arr_implimation_using_stack {
    public static class Stack{
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x){
            arr[idx] = x;
            idx ++;
        }

        int peek(){
            if(idx == 0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }
        
        int pop(){
            
        }
    }

    public static void main(String args[]){
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(3);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();

    }
}
