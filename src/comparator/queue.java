package comparator;

import java.util.PriorityQueue;

public class queue {

    public static void main(String args[]){
        PriorityQueue pq=new PriorityQueue();
        pq.add("A");
        pq.add("B");
        pq.add("D");
        pq.add("C");
        pq.add("E");
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
