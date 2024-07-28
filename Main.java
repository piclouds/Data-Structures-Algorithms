import LinkedList.*;

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
    }
}
