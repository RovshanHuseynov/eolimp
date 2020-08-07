package linkedList;

import java.util.HashMap;
import java.util.HashSet;

public class LinkedListt {

    static class Node {
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

    public Node addLast2(Node newNode){
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

        return newNode;
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

    public Node reverse(Node head){
        if(head == null) return null;

        Node cur = head.next;
        Node prev = head;
        prev.next = null;
        Node temp;

        while(cur != null){
            //System.out.println(prev.val + " " + cur.val);
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public Node merge(Node cur1, Node cur2){
        Node third, thirdHead;

        if(cur1 != null && cur2 != null){
            if(cur1.val < cur2.val) {
                thirdHead = cur1;
                cur1 = cur1.next;
            }
            else{
                thirdHead = cur2;
                cur2 = cur2.next;
            }
        }
        else if(cur1 != null){
            thirdHead = cur1;
            cur1 = cur1.next;
        }
        else if(cur2 != null){
            thirdHead = cur2;
            cur2 = cur2.next;
        }
        else{
            thirdHead = null;
        }

        if(thirdHead != null) thirdHead.next = null;
        third = thirdHead;

        while(cur1 != null || cur2 != null){
            if(cur1 != null && cur2 != null){
                if(cur1.val < cur2.val){
                    third.next = cur1;
                    cur1 = cur1.next;
                }
                else {
                    third.next = cur2;
                    cur2 = cur2.next;
                }
            }
            else if(cur1 == null){
                third.next = cur2;
                cur2 = cur2.next;
            }
            else{
                third.next = cur1;
                cur1 = cur1.next;
            }
            third = third.next;
            third.next = null;
        }

        return thirdHead;
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
        HashSet<Node> arr = new HashSet<>();

        while(cur != null) {
            if (arr.contains(cur))
                return 1;

            arr.add(cur);
            cur = cur.next;
        }

        return 0;
    }

    public int hasCycle2(Node head){
        if(head == null) return 0;

        Node slow = head;
        Node fast = head;

        while(true){
            slow = slow.next;

            if(fast.next == null) return 0;
            fast = fast.next.next;

            if(slow == null) return 0;
            if(fast == null) return 0;

            if(slow == fast){
                return 1;
            }
        }
    }

    public Node detectCycle(Node cur){
        java.util.HashSet<Object> arr = new java.util.HashSet<>();

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

    public Node intersection(Node cur1, Node cur2){
        java.util.HashSet<Node> s = new java.util.HashSet<>();

        while(cur1 != null){
            s.add(cur1);
            cur1 = cur1.next;
        }

        while(cur2 != null){
            if(s.contains(cur2)){
                return cur2;
            }
            cur2 = cur2.next;
        }

        return null;
    }
}