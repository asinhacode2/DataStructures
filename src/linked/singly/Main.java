package linked.singly;

public class Main {

    public static void main(String[] args) {
//        Node<String> tail = new Node<>("Happy", null);
//        Node<String> second = new Node<>("Holidays", tail);
//        Node<String> head = new Node<>("!!!", second);
//
//        Node<String> temp = head;
//        while(temp != null){
//            System.out.print(temp.getData() + " --> ");
//            temp = temp.getNext();
//        }
//
//        System.out.println(" null");

//        Singly<Integer> primes = new Singly<>();
//        primes.insertAtFront(2);
//        primes.insertAtFront(3);
//        primes.insertAtFront(5);
//        primes.display();
//
//        primes.insertAtIndex(1, -2);
//        primes.display();
//
//        primes.insertAtIndex(primes.getSize(), 7);
//        primes.display();
//
//        System.out.println("CURRENT NODE NUMBER:\t " + primes.getSize());

        // testing insertion at any index
//

//        Singly<Integer> even = new Singly<>();
//
//        for (int i = 0; i < 10; i++){
//            even.insertAtEnd(i*2);
//        }
//
//        even.display();
//        System.out.println(even.getSize());
//
//        even.insertAtIndex(3,-300);
//        even.display();
//
//        even.insertAtIndex(3,-3000);
//        even.display();
//
//        System.out.println(even.removeFromFront());
//        System.out.println(even.removeFromFront());
//
//        System.out.println(even.removeLast());
//        even.display();
//
//        System.out.println(even.removeAtIndex(5));
//        even.display();
//

        Singly<Integer> randoms = new Singly<>();
        for (int i = 0; i < 5; i++)
        {
            randoms.insertAtEnd((int)(Math.random() * 100));
        }

        randoms.display();
        randoms.reverse();
        randoms.display();

    }
}
