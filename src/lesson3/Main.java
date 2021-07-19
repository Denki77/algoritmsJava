package lesson3;

public class Main {
    public static void main(String[] args) {

        String string = "meeeeeeeeeerttffdss";
        System.out.println("Original: " + string);
        System.out.print("Reverse:  ");
        new ReverseString(string);
        System.out.println();

        MyDeque<Integer> deque = new MyDeque<>();

        deque.insertRight(1);
        deque.insertRight(2);
        deque.insertRight(3);
        deque.insertRight(4);

        System.out.println(deque);

        System.out.println(deque.removeRight());
        System.out.println(deque.removeRight());

        System.out.println(deque);

        deque.insertLeft(500);

        System.out.println(deque);

        System.out.println(deque.removeRight());

        System.out.println(deque);

        deque.insertRight(11);
        deque.insertRight(12);
        deque.insertRight(13);
        deque.insertRight(14);
        deque.insertRight(15);
        deque.insertRight(16);

        System.out.println(deque);

        deque.insertRight(17);
        deque.insertRight(18);

        System.out.println(deque);

        System.out.println(deque.removeRight());

        deque.insertRight(19);

        System.out.println(deque);

        System.out.println(deque.removeLeft());
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeLeft());

        System.out.println(deque);

    }
}
