import java.util.*;
public class priority_queue {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(7);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(6);
        System.out.println(pq);
        System.out.println("The peak element is : " +pq.peek());

        pq.poll();
        System.out.println(pq);
    }
}
