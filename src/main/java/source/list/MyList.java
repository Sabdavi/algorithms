package source.list;

public class MyList<T> {

    private int size = 0;
    private Node<T> first;
    private Node<T> last;

    public MyList() {
    }

    public boolean addFirst(T t){
        Node<T> node = first;
        Node<T> newNode = new Node<>(null ,t ,first);

        first = newNode;
        if(node == null){
            last = newNode;
        }else{
            node.prev = newNode;
        }
        size ++;
        return true;
    }

    public boolean addLast(T t){
        Node<T> node = last;
        Node<T> newNode = new Node<>(last, t, null);

        last = newNode;
        if(node == null){
            first = newNode;
        }else{
            node.next = newNode;
        }
        size++;
        return true;
    }

    public boolean add(T t, int index){
        return false;
    }

    private static class Node<T>{
        T element;
        Node<T> next;
        Node<T> prev;

        public Node(Node<T> prev , T element, Node<T> next ) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
