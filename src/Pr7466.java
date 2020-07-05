import java.util.Scanner;

public class Pr7466 {
    public static void main(String[] args) {
        Pr7466 a = new Pr7466();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree tree = new Tree();
        for(int i=0; i<n; i++){
            tree.insert(in.nextInt());
        }
        System.out.println(tree.isBalanced());
    }
}

class Tree {
    Node head;

    void insert(int newVal){
        Node cur = head;

        while(true) {
            if(cur == null){
                head = new Node(newVal);
                //System.out.println("ready!");
                break;
            }
            else if (newVal < cur.val) {
                //System.out.println("go left");
                if(cur.left == null){
                    cur.left = new Node(newVal);
                    //System.out.println("ready!");
                    break;
                }
                else {
                    cur = cur.left;
                }
            }
            else{
                //System.out.println("go right");
                if(cur.right == null){
                    cur.right = new Node(newVal);
                    //System.out.println("ready!");
                    break;
                }
                else {
                    cur = cur.right;
                }
            }
        }
    }

    int isBalanced(){
        return height(head) == -1 ? 0 : 1;
    }

    int height(Node cur){
        if(cur == null){
            return 0;
        }

        int left = height(cur.left);
        int right = height(cur.right);

        if(left == -1 || right == -1 || Math.abs(left - right) > 1){
            return -1;
        }
        else{
            return Math.max(left , right) + 1;
        }
    }

}

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }
}