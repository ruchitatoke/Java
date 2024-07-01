public class circular_LL {
    public static void main(String[] args) {
        CLL list=new CLL();
        list.insert(5);
        list.insert(4);
        list.insert(8);
        list.insert(9);
        list.display();
    }
}
 
class CLL{
 
    private Node head;
    private Node tail;

    public CLL(){
        this.head=null;
        this.head=null;
    }

    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;

    }

public void display(){
    Node node=head;
    if(head != null){
        do{
            System.out.print(node.val + "-> ");
            node=node.next;
        }while(node != head);
    }
    System.out.println("HEAD");
}
       
    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val; 
        }
    }
}