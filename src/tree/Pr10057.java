package tree;

public class Pr10057 {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(4);
        t.insert(2);
        t.insert(1);
        t.insert(3);
        t.insert(10);
        t.insert(9);
        t.insert(16);
//        t.insert(7);
//        t.insert(5);
//        t.insert(13);
//        t.insert(9);
//        t.insert(17);
        System.out.println(t.sumLeft(t.getHead()));
    }
}
