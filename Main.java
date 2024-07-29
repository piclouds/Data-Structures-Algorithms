import linkedlist.*;
import stack.*;
import queue.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Data Structures start here!");
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("LinkedList created");

        System.out.println("Adding 1, 2, and 3 to the linked list, then print");
        list.add(1);
        list.add(2);
        list.add(3);

        list.print();

        System.out.println("Removing the node at index 1, then print");
        list.remove(1);
        list.print();

        System.out.println("Creating a stack");
        Stack<Integer> stack = new Stack<>();
        System.out.println("Stack created");

        System.out.println("Pushing 1, 2, and 3 to the stack, then print");
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.print();

        System.out.println("Popping from the stack, then print");
        System.out.println("Popped: " + stack.pop());
        stack.print();

        System.out.println("Peeking from the stack");
        System.out.println("Peeked: " + stack.peek());

        System.out.println("Creating a queue");
        Queue<Integer> queue = new Queue<>();
        System.out.println("Queue created");

        System.out.println("Enqueuing 1, 2, and 3 to the queue, then print");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.print();

        System.out.println("Dequeuing from the queue, then print");
        System.out.println("Dequeued: " + queue.dequeue());
        queue.print();

        System.out.println("Enqueuing 4 to the queue, then print");
        queue.enqueue(4);
        queue.print();

        System.out.println("Peeking from the queue");
        System.out.println("Peeked: " + queue.peek());

    }
}
