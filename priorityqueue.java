import java.util.*;
public class priorityqueue {
    public static void main(String[] args){

    Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
    queue.offer(3.0);
    queue.offer(1.5);
    queue.offer(4.3);
    queue.offer(2.0);
    queue.offer(2.5);

    while(!queue.isEmpty()){
    System.out.println(queue.poll());
    }
}
}
