package LinkedListFromScratch;


 class Node1{
    int data;
    public Node1 next;
    public Node1 previous;

     public Node1(int data){
        this.data = data;
        next = null;
        previous = null;
     }
 }


public class DoublyLinkedList {
    public Node1 head;
    public Node1 tail;

    DoublyLinkedList(int data){
        tail= null;
        Node1 a = new Node1(data);
        head = a;
    }

    public void addBegining(Node1 node ){
        node.next = head;
        head.previous = node;
        head = node;



    }
}
