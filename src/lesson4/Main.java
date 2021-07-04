package lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList<>();

        mll.insertFirst(5);
        mll.insertFirst(6);
        mll.insertFirst(2);
        mll.insertFirst(8);

        System.out.println(mll);

        mll.insertLast(77);
        mll.insertLast(88);
        System.out.println(mll);

//        System.out.println(mll.removeFirst());
//        System.out.println(mll.removeLast());
//        System.out.println(mll);

//        System.out.println(mll.removeFirst());
//        System.out.println(mll);

//        System.out.println(mll.indexOf(8));

        mll.insert(2, 55);
        System.out.println(mll);
//
        System.out.println(mll.remove(55));
        System.out.println(mll);

//        MyLinkedQueue<Integer> queue = new MyLinkedQueue<>();
//        queue.add(5);
//        queue.add(7);
//        queue.add(3);
//        queue.add(8);
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(queue.remove());
//        }

//        Iterator<Integer> iterator = mll.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for (Integer x : mll) {
            System.out.println(x);
        }


//        List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 5, 3, 2, 4, 5, 6, 3, 2, 6, 5, 43, 23));
//        System.out.println(list);
//        list.removeIf(x -> x % 2 == 0);
//        System.out.println(list);


    }
}
