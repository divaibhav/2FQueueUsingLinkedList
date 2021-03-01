package myinterface;

public interface QueueADT<E> {
    void enqueue(E data);
    E dequeue();
    E peek();
    boolean isEmpty();
    int size();

}
