package source.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void testInitValues(){
        MyStack<Integer> stack = new MyStack<>();
        assertTrue(stack.empty());
        assertTrue(stack.size()==0);
    }

    @Test
    public void testPush(){
        MyStack<Integer> stack = new MyStack();
        stack.push(124);
        assertFalse(stack.empty());
        assertTrue(stack.size() == 1);
    }

    @Test
    public void testPop(){
        MyStack<Integer> stack = new MyStack();
        stack.push(124);
        int element = stack.pop();
        assertEquals(124,element);
        assertTrue(stack.empty());
        assertTrue(stack.size()==0);
    }

    @Test
    public void testPush1(){
        MyStack<Integer> stack = new MyStack();
        stack.push(124);
        stack.push(125);
        assertFalse(stack.empty());
        assertTrue(stack.size() == 2);
    }

    @Test
    public void testPop1(){
        MyStack<Integer> stack = new MyStack();
        stack.push(124);
        stack.push(125);
        int element1 = stack.pop();
        assertEquals(125,element1);
        assertFalse(stack.empty());
        int element2 = stack.pop();
        assertEquals(124,element2);
        assertTrue(stack.empty());
    }

    @Test
    public void testEmptyStack(){
        MyStack<Integer> stack = new MyStack();
        assertThrows(EmptyStackException.class,() -> stack.pop());
    }

    @Test
    public void testFullStack(){
        MyStack<Integer> stack = new MyStack(2);
        stack.push(1);
        stack.push(2);
        assertThrows(FullStackException.class,() -> stack.push(3));
    }
}
