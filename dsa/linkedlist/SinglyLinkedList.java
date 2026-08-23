package linkedlist;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class LinkedList {
    Node head;

    void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    boolean delete(int value){
        if(head == null){
            return false;
        }
        if(head.data == value){
            head = head.next;
            return true;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.data == value){
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    void reverse(){
        Node prev = null;
        Node current = head;
        while(current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}

public class SinglyLinkedList {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.print();

        list.delete(20);
        list.print();

        list.reverse();
        list.print();
    }
}

// Practice: Add a method findMiddle() that returns the middle node's
// value using the fast/slow pointer technique (two pointers, one
// moving twice as fast as the other).
