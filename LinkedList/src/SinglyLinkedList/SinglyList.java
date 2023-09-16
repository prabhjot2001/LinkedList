package SinglyLinkedList;

public class SinglyList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyList() {
        this.size = 0;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null && tail == null) {
            head = node;
            tail = head;
            size++;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            insertFirst(val);
        } else {
            node.next = head;
            head = node;
            size++;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        } else {
            head = head.next;
            size--;
            if(head == null)
            {
                tail = head;
            }
        }
    }

    public void deleteLast()
    {
        if(tail == null)
        {
            return;
        }
        else if(head == tail)
        {
            head = null;
            tail = null;
            size--;
        }
        else{
            Node iterator = head;
            for(int i=1;i<getSize()-1;i++)
            {
                iterator = iterator.next;
            }
            tail = iterator;
            tail.next = null;
            size--;
        }
    }

    public int search(int val)
    {
        Node iterator = head;
        for(int i=1;i<=getSize();i++)
        {
             if(iterator.val == val)
             {
                return i;
             }
             iterator = iterator.next;
        }
        return -1;
    }

    public void insert(int val , int index)
    {
        if(index <= getSize()){

            Node node = new Node(val);
            Node nxt = null;
            Node iterator = head;
            for(int i=1; i<index-1;i++){
                iterator = iterator.next;
            }
            nxt = iterator.next;
            iterator.next = node;
            node.next = nxt;
        }
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("null\n");
    }
}