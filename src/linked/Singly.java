package linked;

public class Singly<T> {

    // having a head and tail to start with
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    // constructor
    public Singly(){

    }

    // get size
    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    // increment and decrement the size
    public void increment(){
        this.size++;
    }

    public void decrement(){
        this.size--;
    }

    // return the first
    public T getFirst(){
        if(isEmpty()){
            return null;
        }

        return this.head.getData();
    }

    // return the last
    public T getLast(){
        if(isEmpty()){
            return null;
        }

        return this.tail.getData();
    }

    // insert at the front
    public void insertAtFront(T data){
        this.head = new Node<>(data, head);

        if (isEmpty()){
            tail = head;
        }
        increment();

    }

    // display
    public void display(){
        Node<T> temp = this.head;
        while(temp != null){
            System.out.print(temp.getData() + " --> ");
            temp = temp.getNext();
        }
    }

}
