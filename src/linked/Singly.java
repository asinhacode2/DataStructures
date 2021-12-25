package linked;

public class Singly<T> {

    // having a head and tail to start with
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    // constructor
    public Singly() {

    }

    // get size
    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    // increment and decrement the size
    // no one should access this out of this class
    private void increment() {
        this.size++;
    }

    private void decrement() {
        this.size--;
    }

    // return the first
    public T getFirst() {
        if (isEmpty()) {
            return null;
        }

        return this.head.getData();
    }

    // return the last
    public T getLast() {
        if (isEmpty()) {
            return null;
        }

        return this.tail.getData();
    }

    // insert at the front
    public void insertAtFront(T data) {
        this.head = new Node<>(data, head);

        if (isEmpty()) {
            tail = head;
        }
        increment();

    }

    public void insertAtEnd(T data) {
        Node<T> new_node = new Node<>(data, null);

        if (isEmpty()) {
            head = new_node;
        } else {
            tail.setNext(new_node);
        }

        tail = new_node;
        increment();
    }

    // add at an index
    public void insertAtIndex(int index, T data) {
        if (index < 1 || index > getSize()) {
            throw new IllegalArgumentException("No such index");
        }

        // add at the front
        else if (index == 1) {
            insertAtFront(data);
        }

        // add at the end
        else if (index == getSize()) {
            insertAtEnd(data);
        }

        //
        else {
            Node<T> previous = this.head;
            int tracker = 1;
            while (tracker < index - 1) {
                previous = previous.getNext();
                tracker++;
            }
            Node<T> current = previous.getNext();
            Node<T> new_node = new Node<>(data, current);
            previous.setNext(new_node);
            increment();
        }
    }

    // remove from front
    public T removeFromFront() {
        if (isEmpty()) {
            return null;
        } else {
            T obtained = this.head.getData();
            this.head = this.head.getNext();
            decrement();
            if (isEmpty()) {
                this.tail = null;
            }

            return obtained;
        }
    }

    // remove the last
    public T removeLast() {
        if (isEmpty())
            return null;

        else {
            Node<T> current = head;
            Node<T> prev = null;

            // while the next of current exists, keep moving

            while (current.getNext() != null) {
                prev = current;
                current = current.getNext();
            }

            prev.setNext(null);
            return current.getData();

        }
    }

    // remove at a given index
    public T removeAtIndex(int target) {
        if (isEmpty())
            return null;

        if (target == 1) {
            return removeFromFront();
        } else if (target == getSize()) {
            return removeLast();
        } else {
            Node<T> prev = this.head;
            int count = 1;

            while (count < target - 1) {
                prev = prev.getNext();
                count++;
            }

            Node<T> current = prev.getNext();
            T data = current.getData();
            prev.setNext(current.getNext());
            return data;
        }


    }

    // search
    // linear search - O(n)
    public boolean search(T target) {
        if (isEmpty())
            return false;
        else {
            Node<T> temp = this.head;
            while (temp != null) {
                if (temp.getData() == target) {
                    return true;
                }
                temp = temp.getNext();
            }

            return false;

        }
    }

    // display
    public void display() {
        Node<T> temp = this.head;
        while (temp != null) {
            System.out.print(temp.getData() + " --> ");
            temp = temp.getNext();
        }

        System.out.println();
    }

}
