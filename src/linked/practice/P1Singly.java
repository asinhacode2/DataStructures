package linked.practice;

public class P1Singly<E> {

    private P1Node<E> head;
    private P1Node<E> tail;
    private int size;

    public P1Singly(){

    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }



    public E getFirst(){
        if (isEmpty())
            return null;

        else
            return this.head.getData();
    }

    public E getLast(){
        if (isEmpty())
            return null;

        else
            return this.tail.getData();
    }

    private void increment(){
        this.size++;
    }

    private void decrement(){
        this.size--;
    }

    public void addFirst(E data){
        this.head = new P1Node<>(data, this.head);

        if (isEmpty())
            this.tail = this.head;

        this.increment();
    }

    public void addLast(E data){
        P1Node<E> new_node = new P1Node<>(data, null);
        if (isEmpty())
            this.head = new_node;

        else
            this.tail.setNext(new_node);

        this.tail = new_node;
        this.increment();
    }

    public void addAtPosition(int position, E data){
        if(position < 0 || position > this.getSize()) {
            String message = "Not a valid position, please have the number between 0 and " +
                    this.getSize();
            throw new IllegalArgumentException(message);
        }

        if (position == 0)
            this.addFirst(data);

        else if(position == this.getSize())
            this.addLast(data);

        else{
            int start = 1;
            P1Node<E> temp = this.head;

            while(start < position - 1){
                temp = temp.getNext();
                start++;
            }

            P1Node<E> tempNext = temp.getNext();
            P1Node<E> newNode = new P1Node<>(data, tempNext);
            temp.setNext(newNode);
        }

    }

    // from the front
    public E removeFirst(){
        if (isEmpty())
            return null;

        E data = this.head.getData();
        this.head = this.head.getNext();

        this.decrement();

        if (isEmpty())
            this.tail = null;

        return data;
    }

    // remove from the end
    public E removeLast(){

        if (isEmpty())
            return null;

        else{
           P1Node<E> current = head;
           P1Node<E> prev = null;

           while(current.getNext() != null){
               prev = current;
               current = current.getNext();
           }

           prev.setNext(null);
           this.tail = prev;
           return current.getData();
        }
    }

    public E deleteFromPosition(int position){
        if (isEmpty())
            return null;

        else if(position < 1 || position > this.getSize()){
            throw new IllegalArgumentException("No such position!");
        }

        else if(position == 1){
            return removeFirst();
        }

        else if(position == getSize()){
            return removeLast();
        }

        else{
            int tracker = 1;
            P1Node<E> temp = this.head;

            while(tracker < position - 1){
                temp = temp.getNext();
                tracker++;
            }

            P1Node<E> toBeRemoved = temp.getNext();
            temp.setNext(toBeRemoved.getNext());
            this.decrement();

            return toBeRemoved.getData();
        }
    }

    public void display(){
        P1Node<E> temp = this.head;

        System.out.print("HEAD -> ");
        while(temp != null){
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println(" NULL");
    }
}
