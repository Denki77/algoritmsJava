package lesson4;

/**
 * Реализация стека на основе MyLinkedList
 *
 * @param <T>
 */
public class MyStack<T> {
    private MyLinkedList<T> list;

    public MyStack() {
        list = new MyLinkedList<T>();
    }

    public void push(T item) {
        list.insertLast(item);
    }

    public T pop() {
        return list.removeLast();
    }

    public T peek() {
        return list.getLast();
    }

    public boolean isFull() {
        return false;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }

}
