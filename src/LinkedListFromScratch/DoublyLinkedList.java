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

    DoublyLinkedList(int data){
        Node1 a = new Node1(data);
        head = a;
    }

    public void addBegining(Node1 node ){
        node.next = head;
        head.previous = node;
        head = node;
    }

    public void addEnd(Node1 node){
       Node1 temp = head;
       while(temp.next != null){
           temp = temp.next;
        }
       temp.next = node;
        node.previous = temp;
    }

    public void addWhereIWant(Node1 newNode, Node1 refNode ){
       Node1 temp = head;
       while(temp.next != refNode){
           temp = temp.next;
       }

      newNode.next =  refNode.next;
       refNode.next.previous = newNode;
       newNode.previous = refNode;
       refNode.next = newNode;
    }

    public void deleteWhereIWant(Node1 toBeDeletedNode ){
        if(toBeDeletedNode == head){
            head = toBeDeletedNode.next;
        } else {
            toBeDeletedNode.previous.next = toBeDeletedNode.next;
        }


    }
}
