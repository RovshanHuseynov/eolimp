import java.util.Scanner;

public class Pr4003 {
    public static void main(String[] args) {
        Pr4003 a = new Pr4003();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree t = new Tree();

        for(int i=0; i<n; i++) {
            t.insert(in.nextInt());
        }

        System.out.println(t.sumLeft(t.head));
    }

    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    class Tree {
        Node head;

        public void insert(int val){
            Node newNode = new Node(val);

            if(head == null){
                head = newNode;
            }
            else{
                Node cur = head;

                while(true){
                    if(val < cur.val) {
                        if(cur.left == null) {
                            //System.out.println("sol put");
                            cur.left = newNode;
                            break;
                        }
                        else{
                            //System.out.println("sol");
                            cur = cur.left;
                        }
                    }
                    else{
                        if(cur.right == null) {
                            //System.out.println("sag put");
                            cur.right = newNode;
                            break;
                        }
                        else{
                            //System.out.println("sag");
                            cur = cur.right;
                        }
                    }
                }
            }
        }

        public int sumLeft(Node cur){
            if(cur == null){
                return 0;
            }
            else if(cur.left != null && cur.left.left == null && cur.left.right == null){
                return cur.left.val + sumLeft(cur.right);
            }

            return sumLeft(cur.left) + sumLeft(cur.right);
        }
    }
}
