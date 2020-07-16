package linkedList;

public class Pr10041 {
    public static void main(String[] args) {
        LinkedListt ll = new LinkedListt();
        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);

        LinkedListt ll2 = new LinkedListt();
        ll2.addLast(2);
        ll2.addLast(6);
        ll2.addLast(8);

        ll.merge(ll.getHead(), ll2.getHead());
        System.out.println();
        ll.print();
//        ll.addLast(1);
//        ll.addLast(4);
//        ll.addLast(7);
//        ll.addLast(8);
//        ll.addLast(9);
//        ll.addLast(0);
//        ll.addLast(-1);
//        ll.addLast(-2);
//        ll.addLast(0);
//        ll.addLast(0);
//        ll.addLast(0);
//        ll.addLast(0);
//        ll.addLast(0);
//        ll.addLast(0);
//        ll.addLast(0);
//        ll.addLast(0);
//        ll.addLast(0);
//        ll.addLast(0);

        //ll.removeFirst();
        //ll.removeLast();
        //System.out.println(ll.getHead());
        //System.out.println(ll.getTail());

        //ll.print();
        //System.out.println(ll.size());
        //System.out.println(ll.isEmpty());
        //ll.reverse(ll.head);
        //ll.print();
        //System.out.println(ll.getHead());
    }
}
