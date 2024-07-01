import java.util.*;
public class array_deque {
    public static void main(String[] args) {
        ArrayDeque <Integer> dq = new ArrayDeque<>();

        //QUEUE (FIFO)
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);
        dq.offerFirst(5);
        dq.offerFirst(6);
        dq.addFirst(1);

        dq.pollFirst();

        System.out.println(dq);    

        //STACK (LIFO)
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.offerLast(50);
        dq.offerLast(60);
        
        dq.pollFirst();

        System.out.println(dq);
    }
}
