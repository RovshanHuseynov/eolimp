package linkedList;

public class Pr10041 {
    public static void main(String[] args) {
       /* LinkedListt ll = new LinkedListt();
        ll.addLast(1);
        ll.addLast(3);*/
//        ll.addLast(5);
//        ll.addLast(7);
//        ll.addLast(9);

       /* System.out.println(ll.hasCycle(ll.getHead()));

        LinkedListt ll2 = new LinkedListt();
        ll2.addLast(1);
        ll2.addLast(2);
        ll2.addLast(4);
        ll2.addLast(6);
        ll2.addLast(8);
        ll2.addLast(10);
        ll2.addLast(12);
        ll2.addLast(12);
        ll2.addLast(13);*/

//        ll.merge(ll.getHead(), ll2.getHead());
//        System.out.println();
//        ll.print();
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

        LinkedListt l = new LinkedListt();
        LinkedListt.Node temp = l.addLast2(new LinkedListt.Node(1));
        LinkedListt.Node temp2 = l.addLast2(new LinkedListt.Node(2));
        l.addLast2(new LinkedListt.Node(3));
        l.addLast2(temp);
        System.out.println(l.hasCycle2(l.getHead()));

        LinkedListt ll = new LinkedListt();
        for(int i=1; i<=100; i++){
            ll.addLast(i);
        }

        ll.addLast(101);
        //System.out.println(ll.hasCycle(ll.getHead()));
    }
}
