package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

    public static void show(){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        var front = queue.remove();
        System.out.println(front);
    }
}
