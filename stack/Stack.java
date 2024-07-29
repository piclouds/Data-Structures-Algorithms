package stack;

public class Stack<T> {
    Element<T> top;

    public Stack() {
        this.top = null;
    }

    public T pop() {
        if (this.top == null) {
            return null;
        }

        T data = this.top.getData();
        this.top = this.top.getNext();
        return data;
    }

    public T peek() {
        if (this.top == null) {
            return null;
        }

        return this.top.getData();
    }

    public void push(T data) {
        Element<T> element = new Element<T>(data);

        if (this.top == null) {
            this.top = element;
            return;
        }

        element.setNext(this.top);
        this.top = element;

    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public void print() {
        Element<T> current = this.top;
        System.out.println(">>>Stack Data:");
        while (current != null) {
            System.out.println(">>>\t" + current.getData());
            current = current.getNext();
        }
    }
}
