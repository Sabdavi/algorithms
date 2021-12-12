package source.stack;

import java.util.ArrayList;

public class MyStack<T> {
    private int initCapacity;
    private ArrayList<T> elements;
    private int top = -1 ;

    public MyStack(int initCapacity) {
        this.initCapacity = initCapacity;
        elements = new ArrayList<>(initCapacity);
    }

    public MyStack() {
        this(20);
    }

    public void push(T element){
        if(full()){
            throw new FullStackException("The stack is full");
        }
        top++;
        elements.add(top, element);
    }

    public T pop(){
        if(empty()){
            throw new EmptyStackException("The stack is empty");
        }
        T element = elements.get(top);
        top--;
        return element;
    }

    public int size(){
        return top+1;
    }

    public boolean empty(){
        return top == -1 ;
    }

    public boolean full(){
        return top+1 == initCapacity;
    }

    public T top(){
        return elements.get(top);
    }
}
