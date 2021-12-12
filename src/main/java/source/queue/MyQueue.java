package source.queue;

import java.util.ArrayList;

public class MyQueue<T> {

    private int initCapacity;
    private int head;
    private int tail;
    private int size;
    ArrayList<T> elements;

    public MyQueue(int initCapacity) {
        this.initCapacity = initCapacity;
        elements = new ArrayList<>(initCapacity);
        head = tail = size = 0;

    }

    public MyQueue() {
        this(20);
    }

    public void enqueue(T element){
        if(full()){
            throw new FullQueueException("The queue is full");
        }
        size++;
        elements.add(element);
        if(tail == elements.size()){
            tail = 0 ;
        }
        tail = (tail + 1) % initCapacity;
    }

    public T dequeue(){
        if(empty()){
            throw new EmptyQueueException("the queue is empty");
        }
        T element = elements.get(head);
        if(head == elements.size()){
            head = 0;
        }
        size--;
        head = (head + 1) % initCapacity;
        return element;
    }

    public boolean empty(){
        return head == tail ;
    }

    public boolean full(){
        return head == (tail + 1) % initCapacity;
    }

    public T top(){
        return elements.get(head);
    }

    public int size(){
        return size;
    }
}
