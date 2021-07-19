package lesson3;

public class MyDeque<T> extends MyQueue<T> {
    @Override
    public void insert(T item) {
    }

    @Override
    public T remove() {
        return null;
    }

    public void insertRight(T item) {
        super.insert(item);
    }

    public T removeLeft() {
        return super.remove();
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new RuntimeException("queue is full");
        }
        setSize(getSize() + 1);
        setIntoList(nextIndexLeft(getBegin()), item);
        setBegin(nextIndexLeft(getBegin()));
    }

    public T removeRight() {
        T temp = getList()[getEnd() - 1];
        setSize(getSize() - 1);
        setIntoList(nextIndexLeft(getEnd()), null);
        setEnd(nextIndexLeft(getEnd()));
        return temp;
    }

    private int nextIndexLeft(int index) {
        if (index == 0) {
            return  getList().length - 1;
        }
        return index - 1;
    }

}
