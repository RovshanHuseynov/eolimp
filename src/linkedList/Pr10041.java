package linkedList;

public class Pr10041 {
    public static void main(String[] args) {
        LinkedListt ll = new LinkedListt();
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(10);
        ll.addFirst(10);
        //ll.removeFirst();
        //ll.removeLast();
        //System.out.println(ll.getHead());
        //System.out.println(ll.getTail());

        ll.print();
        System.out.println(ll.size());
        System.out.println(ll.isEmpty());
    }
}
