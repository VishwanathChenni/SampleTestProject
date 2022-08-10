package practicejava;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueuePractice{
    public static void main(String args[]){
        System.out.println("QueuePractice");
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.offer(4);
        priorityQueue.offer(5);
        priorityQueue.offer(6);
        priorityQueue.offer(5);

        Iterator iterator=priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Polled Element:-"+priorityQueue.peek());
        System.out.println("Polled Element2:-"+priorityQueue.peek());

        System.out.println("Header Element"+priorityQueue.peek());
        System.out.println("Sample");


    }
}