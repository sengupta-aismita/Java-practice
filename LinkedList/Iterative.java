import java.util.LinkedList;

public class Iterative {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList {
        Node head;

        boolean search(int key) {
            Node temp = head;

            while (temp != null) {
                if (temp.data == key)
                    return true;
                temp = temp.next;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        System.out.println(list.search(20)); // true
        System.out.println(list.search(50));
    }
}
