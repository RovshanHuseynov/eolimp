package tree;

import java.util.LinkedList;
import java.util.Queue;

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

    public boolean isSame(Node cur1, Node cur2){
        if(cur1 == null && cur2 == null){
            return true;
        }
        else if(cur1 != null && cur2 == null){
            return false;
        }
        else if(cur2 != null && cur1 == null){
            return false;
        }

        if(cur1.val != cur2.val){
            return false;
        }

        return isSame(cur1.left, cur2.left) && isSame(cur1.right, cur2.right);
    }

    public int minDepth(Node cur){
        if(cur == null){
            return 0;
        }

        int minLeft = minDepth(cur.left);
        int minRight = minDepth(cur.right);

        if(minLeft == 0){
            return 1 + minRight;
        }
        else if(minRight == 0){
            return 1 + minLeft;
        }

        return 1 + Math.min(minLeft, minRight);
    }

    public int maxDepth(Node cur){
        if(cur == null){
            return 0;
        }

        int maxLeft = maxDepth(cur.left);
        int maxRight = maxDepth(cur.right);

        if(maxLeft == 0){
            return 1 + maxRight;
        }
        else if(maxRight == 0){
            return 1 + maxLeft;
        }

        return 1 + Math.max(maxLeft, maxRight);
    }

    public Node invert(Node cur){
        if(cur == null){
            return null;
        }

        Node temp = cur.left;
        cur.left = cur.right;
        cur.right = temp;

        invert(cur.left);
        invert(cur.right);
        return cur;
    }

    public boolean isSymmetric(Node cur){
        Queue<Node> q = new LinkedList<Node>();

        q.add(cur.left);
        q.add(cur.right);

        while (!q.isEmpty())
        {
            Node tempLeft = q.remove();
            Node tempRight = q.remove();

            if (tempLeft==null && tempRight==null)
                continue;

            if (tempLeft == null || tempRight == null)
                return false;

            q.add(tempLeft.left);
            q.add(tempRight.right);
            q.add(tempLeft.right);
            q.add(tempRight.left);
        }

        return true;
    }

    public boolean isBalanced(Node cur){
        if(cur.left == null && cur.right == null) {
            return true;
        }
        else if(cur.left == null){
            if(cur.right.left == null && cur.right.right == null)
                return true;
            else
                return false;
        }
        else if(cur.right == null){
            if(cur.left.left == null && cur.left.right == null)
                return true;
            else
                return false;
        }

        return isBalanced(cur.left) && isBalanced(cur.right);
    }
}
