import java.util.*;
public class Linked{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static int size = 0;

    public void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
        
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
       temp.next = newnode;
        newnode.next = null;
    }

    public void addMiddle(int idx, int data){
        Node newnode = new Node(data);
         size++;
        if(head == null){
            head =  newnode;
            return;
        }
        Node temp = head;
        int i = 0;
        while(i < idx-1){
           temp = temp.next;
           i++;
        }
         newnode.next =temp.next ;
        temp.next = newnode;
    }

    public int removeFirst(){
        if(head == null){
            System.out.print("No node exists");
            return -1;
        }else if(size == 1){
            int val = head.data;
            size--;
            head = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
    }
    

    public void print(){
        if(head == null){
           System.out.println("No node exists");
           return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Linked ll = new Linked();
        ll.addFirst(1);
        ll.addFirst(15);
        ll.addLast(69);
        ll.addMiddle(2, 20);
        ll.print();
         
        
    }
}

