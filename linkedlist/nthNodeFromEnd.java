package linkedlist;
public class nthNodeFromEnd {

    public static Node nthNode(Node head, int n){
        int size = 0;
        Node temp = head;

        // calculate size
        while(temp != null){
            size++;
            temp = temp.next;
        }

        // position from start
        int pos = size - n;

        temp = head;
        for(int i = 0; i < pos; i++){
            temp = temp.next;
        }

        return temp;
    }

    public static class Node{
        int data;
        Node next; 
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[]){
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node result = nthNode(a, 2); // 2nd from end
        System.out.println(result.data); // output: 12
    }
}