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

    public Node minimum(Node cur){
        if(cur == null){
            return null;
        }
        else if(cur.left != null){
            return minimum(cur.left);
        }
        else{
            return cur;
        }
    }

    public int sumLeft(Node cur){
        if(cur == null){
            return 0;
        }

        int valLeftLeave = 0;
        if(cur.left != null && cur.left.left == null && cur.left.right == null){
            valLeftLeave = cur.left.val;
        }

        return valLeftLeave + sumLeft(cur.left) + sumLeft(cur.right);
    }

    public int sumLeaves(Node cur){
        if(cur == null){
            return 0;
        }

        int valLeave = 0;
        if(cur.left == null && cur.right == null){
            valLeave = cur.val;
        }

        return valLeave + sumLeaves(cur.left) + sumLeaves(cur.right);
    }

    public int sum(Node cur){
        if(cur == null){
            return 0;
        }

        return cur.val + sum(cur.left) + sum(cur.right);
    }

    public Node find(Node cur, int element){
        if(cur == null){
            return null;
        }

        if(cur.val == element){
            return cur;
        }
        else if(element < cur.val){
            return find(cur.left, element);
        }
        else{
            return find(cur.right, element);
        }
    }
}
