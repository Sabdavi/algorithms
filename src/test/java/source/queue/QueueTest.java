package source.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void testEmptyQueue() {
        MyQueue<Integer> queue = new MyQueue();
        assertTrue(queue.empty());
    }

    @Test
    public void testEnqueue() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(10);
        assertFalse(queue.empty());
    }

    @Test
    public void testDequeue() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(10);
        Integer element = queue.dequeue();
        assertEquals(10, element);
        assertTrue(queue.empty());
    }

    @Test
    public void testFullQueueEnqueue() {
        MyQueue<Integer> queue = new MyQueue<>(3);
        queue.enqueue(10);
        queue.enqueue(20);
        assertThrows(FullQueueException.class, () -> queue.enqueue(30));

    }

    @Test
    public void testEmptyQueueDequeue() {
        MyQueue<Integer> queue = new MyQueue<>(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        assertThrows(EmptyQueueException.class, () -> queue.dequeue());
    }

    @Test
    public void testEnqueueDequeue() {
        MyQueue<Integer> queue = new MyQueue<>(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.empty());
        queue.enqueue(10);
        queue.enqueue(20);
        assertTrue(queue.full());
    }

    @Test
    public void testQueueSize() {
        MyQueue<Integer> queue = new MyQueue<>(3);
        assertEquals(0,queue.size());
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(2,queue.size());
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(2,queue.size());
    }
}
