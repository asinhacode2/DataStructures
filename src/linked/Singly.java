package linked;

public class Singly<T> {

    private Node<T> head;

    public Singly(){
        this.head = null;
    }

    public void insertAtFront(T data){
        Node<T> new_node = new Node<>(data, null);
        new_node.setNext(this.head);
        this.head = new_node;
    }

    public void display(){
        Node<T> temp = this.head;
        while(temp != null){
            System.out.print(temp.getData() + " --> ");
            temp = temp.getNext();
        }
    }

}
