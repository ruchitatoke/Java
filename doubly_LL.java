public class doubly_LL {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(12);
        list.insertLast(77);
        list.delete(6);
        list.display();
    }
}
class DLL{

       private Node head;
       private Node tail;

//insert into linked list at First index
         
       public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head != null){
            head.prev = node;
        }
        head=node;
       }

// insert at last index'

       public void insertLast(int val){
        Node node=new Node(val);
        Node last =head;
        node.next=null;

        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(last.next != null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
       }

public void delete(int val){
    Node node=head;
    if(node==null){
        return;
    }
    if(node.val==val){
        head=head.next;
        tail.next=head;
        return;
    }
do{
    Node n =node.next;
    if(n.val==val){
        node.next=n.next;
        break;
    }
    node=node.next;
}while(node != head);

}


//display function

    public void display(){
        Node node=head;
        Node last=null;
        while( node != null){
            System.out.print(node.val + " -> ");
            last=node;
            node=node.next;
        }
        System.out.println("END ");


//Reverse linked list

        while(last != null){
            System.out.print(last.val + " -> ");
            last=last.prev;
        }
        System.out.println("START");
    }


    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
        }
        public Node(int val, Node next, Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;

        }
    }
}