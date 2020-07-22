package tree;

public class Pr10057 {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(5);
        t.insert(3);
        t.insert(1);
        t.insert(10);
        //t.insert(11);
//        Tree t2 = new Tree();
//        t2.insert(4);
//        t2.insert(2);
//        t2.insert(1);
//        t2.insert(3);
//        t2.insert(10);
//        t2.insert(9);
//        t2.insert(16);
        System.out.println(t.invert(t.getHead()));
    }
}
