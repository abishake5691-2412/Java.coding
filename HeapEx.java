import java.util.PriorityQueue;

public class HeapEx {
    public static void main(String[] args) {
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        minHeap.add(50);
        minHeap.add(20);
        minHeap.add(40);
        minHeap.add(10);
        System.out.println(minHeap.peek());
        System.out.println(minHeap);
    }
}
