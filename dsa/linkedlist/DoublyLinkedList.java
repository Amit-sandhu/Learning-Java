package linkedlist;

class DNode {
    int data;
    DNode prev;
    DNode next;

    DNode(int data){
        this.data = data;
    }
}

class DoublyList {
    DNode head;
    DNode tail;

    void addLast(int data){
        DNode newNode = new DNode(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    void printForward(){
        DNode current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    void printBackward(){
        DNode current = tail;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.prev;
        }
        System.out.println();
    }
}

public class DoublyLinkedList {
    public static void main(String[] args){
        DoublyList list = new DoublyList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        list.printForward();
        list.printBackward();
    }
}

// Practice: Add a deleteLast() method that removes the tail node in
// O(1) time using the prev pointer (no traversal needed).
