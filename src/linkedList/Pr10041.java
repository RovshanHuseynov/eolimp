package linkedList;

public class Pr10041 {
    public static void main(String[] args) {
        LinkedListt ll = new LinkedListt();
        ll.insert(5);
        ll.insert(6);
        ll.insert(1);
        ll.insert(3);

        ll.print();
        ll.printReverseRecursion(ll.head);
    }
}
