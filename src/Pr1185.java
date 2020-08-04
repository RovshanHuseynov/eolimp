import java.util.Scanner;

public class Pr1185 {
    public static void main(String[] args) {
        Pr1185 a = new Pr1185();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree t = new Tree();
        int sum = 0;

        for(int i=0; i<n; i++) {
            sum += t.insert(in.nextInt());
        }

        System.out.println(sum);
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

        public int insert(int val){
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

            return val;
        }
    }
}
