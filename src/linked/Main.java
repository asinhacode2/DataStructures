package linked;

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

        Singly<Integer> primes = new Singly<>();
        primes.insertAtFront(2);
        primes.insertAtFront(3);
        primes.insertAtFront(5);

        primes.display();



    }
}
