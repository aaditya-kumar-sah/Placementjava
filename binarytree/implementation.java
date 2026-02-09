package binarytree;
public class implementation{

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;

        }
    }

    public static void display(Node root){
        if(root == null) return;
        System.out.println(root.val + " -> ");
        System.out.println(root.left.val + " ,");
        System.out.println(root.right.val);
        display(root.left);
        display(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(2);

        Node a = new Node(4);
        Node b = new Node(10 );
        root.left = a;
        root.right = b;

        Node c = new Node(6);
        Node d = new Node(5);
        a.right = c;
        b.left = d;

        Node e = new Node(11);
        b.right = e;
        
        display(root);
    }
}