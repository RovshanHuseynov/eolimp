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

    public void addLast(int val){
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

    public void addFirst(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public boolean removeFirst(){
        if(head == null){
            return false;
        }

        head = head.next;
        return true;
    }

    public boolean removeLast(){
        if(head == null){
            return false;
        }

        int size = size();
        int cnt = 1;
        Node cur = head;

        while(cur.next != null){
            if(cnt + 1 == size){
                cur.next = null;
                break;
            }

            cnt++;
            cur = cur.next;
        }

        return true;
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

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        if(head == null){
            return 0;
        }

        int cnt = 0;
        Node cur = head;
        while(cur.next != null){
            cnt++;
            cur = cur.next;
        }

        return cnt + 1;
    }

    public int getTail(){
        if(head == null){
            return 0;
        }

        Node cur = head;

        while(true){
            if(cur.next == null){
                return cur.val;
            }
            cur = cur.next;
        }
    }

    public int getHead(){
        if(head == null){
            return 0;
        }

        return head.val;
    }
}
