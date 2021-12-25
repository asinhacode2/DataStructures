package linked.practice;

public class P1Node<E> {

    private E data;
    private P1Node<E> next;

    public P1Node(E data, P1Node<E> next){
        this.data = data;
        this.next = next;
    }

    // getters and setters
    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public P1Node<E> getNext() {
        return next;
    }

    public void setNext(P1Node<E> next) {
        this.next = next;
    }
}
