package source.queue;

public class FullQueueException extends RuntimeException{
    public FullQueueException(String message) {
        super(message);
    }
}
