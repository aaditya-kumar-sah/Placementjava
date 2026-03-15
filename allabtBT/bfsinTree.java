package allabtBT;
public class bfsinTree {

    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static void printuptonthnode(Node root, int n){
        if(root == null) return;
        if(n == 1) System.out.println(root.val);
        printuptonthnode(root.left, n - 1);
        printuptonthnode(root.right, n - 1);
    }
    public static int height(Node root){
        if(root == null) return -1;  // height of empty tree = -1
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void main(String args[]) {
dfadfa
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(2);

        root.left.left = new Node(3);
        root.left.right = new Node(4);

        root.right.left = new Node(4);
        root.right.right = new Node(3)
        printuptonthnode(root, 2);
        

    }
}
