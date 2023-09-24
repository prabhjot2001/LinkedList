import DoublyLinkedList.DoublyLinkedList;
import SinglyLinkedList.SinglyList;

public class Main {
    public static void main(String[] args) {
        SinglyList list = new SinglyList();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(60);
        list.insertLast(3420);
        list.insertLast(660);

        list.insertFirst(99);
        list.insertFirst(199);
        list.insertFirst(299);

        System.out.println("list size is: "+ list.getSize());
        list.printList();

        list.insert(80, 3);

        int x = list.search(80);

        if(x!=-1)
        {
            System.out.println("element found at index: "+ x );
        }else{
            System.out.println("element not found in the list");
        }


        

        list.deleteFirst();
        list.printList();

        list.deleteFirst();
        list.printList();

        System.out.println("list size is: "+ list.getSize());


        list.deleteLast();
        System.out.println("list size is: "+ list.getSize());
        list.printList();

        list.deleteLast();
        System.out.println("list size is: "+ list.getSize());
        list.printList();

        list.deleteLast();
        System.out.println("list size is: "+ list.getSize());
        list.printList();

        list.deleteLast();
        list.printList();

        list.deleteLast();
        list.printList();

        list.deleteLast();
        list.printList();

        list.deleteLast();
        list.printList();

        list.getSize();
        list.printList();





        DoublyLinkedList<Long> dll = new DoublyLinkedList<Long>();
        dll.addFirst(9115266L,"user2");
        dll.addFirst(9869L,"user3");
        dll.addFirst(94570L,"user6");

        dll.addLast(12343242L , "user1");
        dll.Total_Contacts();

        dll.printList();
        dll.traverseBackward();

    }
}