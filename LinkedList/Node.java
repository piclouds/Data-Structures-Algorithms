package linkedlist;

public class Node<T> {
    // Holds the data stored in this node
    private T data;
    // Holds the reference to the next node in the list
    private Node<T> next;

    // Constructor
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return this.data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
