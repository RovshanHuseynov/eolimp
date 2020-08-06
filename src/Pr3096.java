import java.util.Scanner;

public class Pr3096 {
    public static void main(String[] args) {
        Pr3096 a = new Pr3096();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        Tree t = new Tree();
        while(in.hasNextInt()){
            t.insert(in.nextInt());
        }
        t.postOrder(t.head);
    }

    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    class Tree{
        Node head;

        public void insert(int val){
            Node newNode = new Node(val);

            if(head == null){
                //System.out.println("head");
                head = newNode;
            }
            else{
                Node cur = head;

                while(true) {
                    if (val < cur.val) {
                        if (cur.left == null) {
                            //System.out.println("sol put");
                            cur.left = newNode;
                            break;
                        } else {
                            //System.out.println("sol");
                            cur = cur.left;
                        }
                    } else {
                        if (cur.right == null) {
                            //System.out.println("sag put");
                            cur.right = newNode;
                            break;
                        } else {
                            //System.out.println("sag");
                            cur = cur.right;
                        }
                    }
                }
            }
        }

        public void postOrder(Node cur){
            if(cur == null) return;

            postOrder(cur.left);
            postOrder(cur.right);

            System.out.println(cur.val);
        }
    }
}