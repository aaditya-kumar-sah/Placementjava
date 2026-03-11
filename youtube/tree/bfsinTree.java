package youtube.tree;
import arr.solve;
import graphs.dfs;

public class bfsinTree {

    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    // to traverse in BT
    public static void dfs(Node root){
        if(root == null) return;
        System.out.println(root.val);
        dfs(root.left);
        dfs(root.right);
    }
    public int solve(Node root){
        if(root == null) return 0;
        int sum = 0;
        sum += root.val;
        solve(root.left);
        solve(root.right);
        return sum;
    }
    public static void main(String args[]) {
        int targer = 4;

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(2);

        root.left.left = new Node(3);
        root.left.right = new Node(4);

        root.right.left = new Node(4);
        root.right.right = new Node(3);
        // dfs(root);
        solve(root);
    }
}