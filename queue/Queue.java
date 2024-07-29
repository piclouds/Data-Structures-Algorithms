package queue;

public class Queue<T> {
    Item<T> front;
    Item<T> rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public T dequeue() {
        if (this.front == null) {
            return null;
        }

        T data = this.front.getData();
        this.front = this.front.getNext();
        return data;
    }

    public T peek() {
        if (this.front == null) {
            return null;
        }

        return this.front.getData();
    }

    public void enqueue(T data) {
        Item<T> item = new Item<T>(data);

        if (this.front == null) {
            this.front = item;
            this.rear = item;
            return;
        }

        rear.setNext(item);
        this.rear = item;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    public void print() {
        Item<T> current = this.front;
        System.out.println(">>>Queue Data:");
        while (current != null) {
            System.out.println(">>>\t" + current.getData());
            current = current.getNext();
        }
    }
}
