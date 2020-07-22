package tree;

public class Tree {
    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;

    public Node getHead(){
        return head;
    }

    public void insert(int val){
        Node cur = head;
        Node newNode = new Node(val);

        while(true) {
            if (cur == null) {
                head = newNode;
                break;
            }
            else if (val < cur.val && cur.left == null) {
                cur.left = newNode;
                break;
            }
            else if (val < cur.val) {
                cur = cur.left;
            }
            else if(val >= cur.val && cur.right == null){
                cur.right = newNode;
                break;
            }
            else{
                cur = cur.right;
            }
        }
    }

    public void print(Node cur){
        if(cur == null){
            return;
        }

        System.out.print(cur.val + " ");

        print(cur.left);
        print(cur.right);
    }
}
