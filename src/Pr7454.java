import java.util.Scanner;

public class Pr7454 {
    public static void main(String[] args) {
        Pr7454 a = new Pr7454();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        Long p = in.nextLong();
        Long a = in.nextLong();
        Long b = in.nextLong();
        Long c = in.nextLong();
        Long m = in.nextLong();
        Long n = in.nextLong();

        List l = new List();
        Long temp = p;
        l.addToTail(temp);

        for(int i=1; i<n; i++){
            temp = (a * temp * temp + b * temp + c) % m;
            l.addToTail(temp);
        }

        Long k = (a * temp * temp + b * temp + c) % n;
        l.action(k);

        if(k < m/2){
            System.out.println(1);
        }
        else{
            System.out.println(l.hasCycle());
        }
    }

    class Node {
        Long data;
        Node next;

        public Node(Long data) {
            this.data = data;
        }
    }

    class List {

        Node head, tail;

        public void addToTail(Long val) {
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
            if(head == null) return 0;

            Node slow = head;
            Node fast = head;

            while(true){
                slow = slow.next;

                if(fast.next == null) return 0;
                fast = fast.next.next;

                if(slow == null) return 0;
                if(fast == null) return 0;

                if(slow == fast) return 1;
            }
        }

        public void action(Long k){
            Node cur = head;
            int cnt = 0;

            while(cnt < k){
                cur = cur.next;
                cnt++;
            }

            tail.next = cur;
        }
    }
}