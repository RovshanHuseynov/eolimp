package tree;

public class Pr10057 {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(5);
        t.insert(3);
        t.insert(2);
        t.insert(3);
        t.insert(4);
        t.insert(7);
        t.insert(6);
        t.insert(8);
        t.insert(10);
        Tree t2 = new Tree();
        t2.insert(4);
        t2.insert(2);
        t2.insert(1);
        t2.insert(5);
        t2.insert(6);
        System.out.println(t2.isSymmetric(t.getHead()));
    }
}
