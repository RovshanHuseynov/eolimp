package linkedList;

public class LinkedListt {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;

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

        int size = size(head);
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

    public boolean isEmpty(){
        return head == null;
    }

    public int size(Node cur){
        if(cur.next == null){
            return 1;
        }

        return 1 + size(cur.next);
    }

    public Node getTail(){
        Node cur = head;

        while(true){
            if(cur.next == null){
                return cur;
            }
            cur = cur.next;
        }
    }

    public Node getHead(){
        return head;
    }

    public void printReverseRecursion(Node cur){
        if(cur == null){
            return;
        }

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

    public Node reverse(Node cur){
        if(cur.next != null){
            reverse(cur.next);
            cur.next.next = cur;
        }

        return cur;
    }

    public Node merge(Node cur1, Node cur2){
        if(cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                merge(cur1.next, cur2);
                //System.out.print(cur1.val + " ");

                if(cur1.next != null && cur1.next.val >= cur2.val){
                    cur2.next = cur1.next;
                    cur1.next = cur2;
                }
                return cur1;
            } else {
                merge(cur1, cur2.next);
                //System.out.print(cur2.val + " ");

                if(cur2.next != null && cur2.next.val >= cur1.val){
                    cur2.next = cur1;
                }

                return cur2;
            }
        }
        else if(cur1 != null){
            merge(cur1.next, null);
            //System.out.print(cur1.val + " ");
            return cur1;
        }
        else if(cur2 != null){
            merge(null, cur2.next);
            //System.out.print(cur2.val + " ");
            return cur2;
        }
        else {
            return null;
        }
    }

    public int sum(Node cur){
        if(cur.next == null){
            return cur.val;
        }
        else{
            return cur.val + sum(cur.next);
        }
    }

    public int hasCycle(Node cur){
        java.util.ArrayList<Object> arr = new java.util.ArrayList<>();

        while(cur != null) {
            if (arr.contains(cur)) {
                return 1;
            } else {
                arr.add(cur);
            }

            cur = cur.next;
        }

        return 0;
    }

    public Node detectCycle(Node cur){
        java.util.ArrayList<Object> arr = new java.util.ArrayList<>();

        while(cur != null) {
            if (arr.contains(cur)) {
                return cur;
            } else {
                arr.add(cur);
            }

            cur = cur.next;
        }

        return null;
    }
}