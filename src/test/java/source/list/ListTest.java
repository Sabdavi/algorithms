package source.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListTest {

    @Test
    public void testInitialList(){
        MyList<Integer> myList = new MyList<>();
        assertTrue(myList.size()==0);
        assertTrue(myList.isEmpty());
    }

    @Test
    public void testAddFirst(){
        MyList<Integer> myList = new MyList<>();
        myList.addFirst(10);
        assertTrue(myList.size()==1);
        assertFalse(myList.isEmpty());
    }

    @Test
    public void testAddLast(){
        MyList<Integer> myList = new MyList<>();
        myList.addLast(10);
        assertTrue(myList.size()==1);
        assertFalse(myList.isEmpty());

    }
}
