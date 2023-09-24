package DoublyLinkedList;

public class DoublyLinkedList <T>{
    private class Node <T>
    {
        T data;
        Node<T> prev;
        Node<T> next;
        String name;

        Node(T data, String name)
        {
            this.data = data;
            this.name = name;
            this.prev = null;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private Node<T> CreateNode(T data,String name)
    {
        Node<T> node = new Node<T>(data,name);
        return node;
    }
    public void addFirst(T data, String name)
    {
        Node<T> node = new Node<T>(data, name);
        if(head == null)
        {
            head = node;
            tail = head;
            size++;
        }
        else {
            node.next = head;
            head.prev = node;
            head = node;
            size++;
        }
    }
   

    private void printDeleteMsg(String name)
    {
        System.out.println("Removed "+ name+ " from contacts successfully 😎");
    }

    public void addLast(T data, String name)
    {
        Node<T> node = CreateNode(data, name);
        if(head == null)
        {
            head = node;
            tail = head;
            size++;
        }
        else {
            node.prev = tail;
            tail.next = node ;
            tail = node;
            size ++;
        }
    }


    public void removeContact(String name)
    {
       Node<T> it = head;
       while(it!=null)
       {
        if(it.name == name)
        {
            if(it == head && size==1)
            {
                head = null;
                tail = null;
                size--;
                printDeleteMsg(name);
                return;
            }
            else if(it==head)
            {
               
                head = it.next;
                head.prev = null;
                size--;
                printDeleteMsg(name);
                return;
            }
            else if(it == tail)
            {
                tail = it.prev;
                tail.next = null;
                size--;
                 printDeleteMsg(name);
                 return;
            }
            else{
                
               it.prev.next = it.next ;
               it.next.prev = it.prev; 
               size--;
                printDeleteMsg(name);
               return;
            }
        }
        it = it.next;
       }
       System.out.println("Contact not found 😒");
    }

    public void traverseForward(){
        printList();
    }

    public void traverseBackward()
    {
        Node<T> it = tail;
        while (it!=null)
        {
            System.out.println(it.name+" : " + it.data);
            it = it.prev;
        }
    }

    public void printList()
    {
        Node<T> it = head;
        for(int i=0;i<size;i++)
        {
            System.out.println(it.name+" : "+ it.data);
            it = it.next;
        }
        System.out.println("null");
    }

    public void Total_Contacts()
    {
        System.out.println("Total contacts are : "+size);
    }
}
