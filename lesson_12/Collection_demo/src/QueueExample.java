import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
//        Queue<Integer> linkedList = new LinkedList<>();
//        linkedList.add(3);
//        linkedList.add(5);
//        linkedList.add(1);
//        linkedList.offer(8);
//        linkedList.offer(4);
//        linkedList.offer(9);
//
//        System.out.println(linkedList);
//
//        System.out.println("Phần tử đầu tiên: " + linkedList.element());
//        System.out.println("Phần tử đầu tiên: " + linkedList.peek());
//
//        linkedList.remove();
//        System.out.println(linkedList);
//
//        linkedList.poll();
//        System.out.println(linkedList);



        // PriorityQueue sẽ ưu tiên sắp xếp phần tử có gtri bé nhất lên trước.
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(7);
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(5);
        priorityQueue.add(2);

        System.out.println(priorityQueue);

        System.out.println("Phần tử đầu tiên: " + priorityQueue.element());

        priorityQueue.remove();
        System.out.println(priorityQueue);
        System.out.println("Phần tử đầu tiên: " + priorityQueue.element());

    }
}
