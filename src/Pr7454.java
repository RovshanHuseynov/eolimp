import java.util.Scanner;

public class Pr7454 {
    public static void main(String[] args) {
        Test1 a = new Test1();
        a.calc();
    }
}

class Test1 {
    public void calc(){
        Scanner in = new Scanner(System.in);
        long p = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long m = in.nextLong();
        long n = in.nextLong();

        //List l = new List();
        //l.addToTail(temp);

        for(int i=1; i<n; i++){
            p = (a * p * p + b * p + c);
            System.out.print(p + " ");
            p = p % m;
            //if(p < 0) p += m;
            //l.addToTail(temp);
            System.out.println(p);
        }

        p = (a * p * p + b * p + c);
        p = p % n;
        //if(p < 0) p += n;

        if(p < m/2){
            //l.action(k);
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    class List {

        Node head, tail;

        public void addToTail(int val) {
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
            }
            else{
                Node cur = head;
                while(cur.next != null){
                    cur = cur.next;
                }
                cur.next = newNode;
            }

            tail = newNode;
        }

        public int hasCycle() // Returns 1 if a List has a cycle, and 0 otherwise
        {
            return 1;
        }

        public void action(int k){
            Node cur = head;
            int cnt = 1;

            while(cnt < k){
                cur = cur.next;
                cnt++;
            }

            tail.next = cur;
        }
    }
}