package queue;

public class Item<T> {
    private T data;
    private Item<T> next;

    public Item(T data) {
        this.data = data;
        this.next = null;
    }

    public Item(T data, Item<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return this.data;
    }

    public Item<T> getNext() {
        return this.next;
    }

    public void setNext(Item<T> next) {
        this.next = next;
    }

}
