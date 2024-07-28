package LinkedList;

public class LinkedList<T> {
    private Node<T> head;

    // Constructor
    public LinkedList() {
        this.head = null;
    }

    public LinkedList(T data) {
        this.head = new Node<T>(data);
    }

    public void add(T data) {
        // Create a new node
        Node<T> node = new Node<T>(data);

        // If the list is empty, set the new node as the head
        if (this.head == null) {
            this.head = node;
            return;
        }

        Node<T> current = this.head;
        // Traverse the list to find the last node
        while (current.getNext() != null) {
            current = current.getNext();
        }

        // Set the new node as the next node of the last node
        current.setNext(node);
    }

    // Remove node at index
    public void remove(int index) {
        // Check if the index is negative
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        // Check if the list is empty
        if (this.head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        // If the index is 0, remove the head
        if (index == 0) {
            this.head = this.head.getNext();
            return;
        }

        Node<T> current = this.head;
        Node<T> previous = null;
        int i = 0;
        while (current != null && i < index) {
            previous = current;
            current = current.getNext();
            i++;
        }

        // Check if the index is out of bounds
        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        previous.setNext(current.getNext());
    }

    public void print() {
        Node<T> current = this.head;
        System.out.println(">>>Linked List Data:");
        while (current != null) {
            System.out.println(">>>\t" + current.getData());
            current = current.getNext();
        }
    }

}