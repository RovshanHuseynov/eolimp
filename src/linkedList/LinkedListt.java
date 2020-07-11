package linkedList;

public class LinkedListt {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head;

    public void insert(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
        }
        else {
            Node cur = head;

            while (cur.next != null) {
                cur = cur.next;
            }

            cur.next = newNode;
        }
    }

    public void print(){
        Node cur = head;

        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }

        System.out.println();
    }

    public void printReverseRecursion(Node cur){
        if(cur.next != null) {
            printReverseRecursion(cur.next);
        }

        if(cur.next == null) {
            System.out.print(cur.val);
        }
        else{
            System.out.print(" " + cur.val);
        }
    }
}
