package source.stack;

import java.util.ArrayList;

public class MyStack<T> {
    private int initCapacity;
    private ArrayList<T> elements;
    private int top = 0 ;

    public MyStack(int initCapacity) {
        this.initCapacity = initCapacity;
        elements = new ArrayList<>(initCapacity);
    }

    public MyStack() {
        this(20);
    }

    public void push(T element){
        top++;
        elements.add(top, element);
    }

    public T pop(){
        T element = elements.get(top);
        top--;
        return element;
    }

    public long size(){
        return top+1;
    }

    public boolean empty(){
        return size() == 0 ;
    }

    public T top(){
        return elements.get(top);
    }
}
