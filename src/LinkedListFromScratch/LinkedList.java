package LinkedListFromScratch;

public class LinkedList {
   public Node head;

   public LinkedList(int data){
       Node a = new Node(data);
       head = a;
   }

   public void traversal() {
       Node temp = head;
       while(temp.next != null){
           System.out.println(temp.data);
           temp = temp.next;
       }
       System.out.println(temp.data);
   }

  public void insertNodeInBegining(Node newNode){
       newNode.next = head;
       head = newNode;
   }

   public void insertNodeAtTheEnd(Node newNode) {
       Node temp = head;
       while (temp.next != null) {
         temp = temp.next;
         }
       temp.next = newNode;

       }

//Here we have to break up the current link list to accomate the new node we are adding
   public void  insertInAfter (Node a, Node newNode){
newNode.next = a.next;
a.next = newNode;
       }

       public void deleteNode(Node nodeTBD){
       Node temp = head;
       if(temp == nodeTBD){
           head = nodeTBD.next;
       }
  else{
      while(temp != null){
          if(temp.next == nodeTBD){
              temp.next = nodeTBD.next;
              break;
          }
          temp = temp.next;
      }
       }
       }


    public static void main(String args[]){
       LinkedList linkedList = new LinkedList(10);
       Node a,b,c;

       a = new Node(20);
       b = new Node(30);
       c = new Node(40);

       linkedList.head.next = a;
       a.next = b;
       b.next = c;


      Node z = new Node(0);

        linkedList.insertNodeAtTheEnd(z);



        linkedList.deleteNode(b);

        linkedList.insertNodeInBegining(b);
        linkedList.traversal();
    }
}
