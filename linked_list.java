public class linked_list {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(9);
        list.insertFirst(7);
        list.insertAtIndex(12, 3);
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());

        list.display();
      }
}

 class LL{

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }


    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }

      
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node =new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertAtIndex(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;

    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
            size--;
            return val;
    }

    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

        Node secondlast=get( size-2);
        int val=tail.value;
        tail=secondlast;
        tail.next=null;
        return val;
    }
    


    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }



    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}