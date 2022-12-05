package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {

    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        result.add(firstQueue.poll());
        result.add(firstQueue.poll());
        result.add(secondQueue.poll());
        result.add(secondQueue.poll());
        while (!firstQueue.isEmpty() & !secondQueue.isEmpty()) {
                firstQueue.offer(result.pollLast());
                if (firstQueue.size() >= 2)
                    result.add(firstQueue.poll());
                result.addLast(firstQueue.poll());

            if (!secondQueue.isEmpty()) {
                secondQueue.offer(result.pollLast());
                if(secondQueue.size() >= 2)
                    result.addLast(secondQueue.poll());
                result.add(secondQueue.poll());
            }
        }
        return result;
    }
}
