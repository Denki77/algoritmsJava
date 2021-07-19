package lesson2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        long timestamp = System.currentTimeMillis();
        System.out.println("Старт программы " + timestamp);
        Random random = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>();
        for (int i = 0; i < 100000; i++) {
            mal.add(random.nextInt(77));
        }
        System.out.println("Массив создан и заполнен за " + (System.currentTimeMillis() - timestamp) + "мс");

        timestamp = System.currentTimeMillis();
        System.out.println("Начинаю сортировку выбором");
        mal.selectionSort();
        System.out.println("Сортировка выбором завершена за " + (System.currentTimeMillis() - timestamp) + "мс");

        timestamp = System.currentTimeMillis();
        System.out.println("Начинаю перемешивать массив");
        mal.shuffle(100000);
        System.out.println("Массив перемешан за " + (System.currentTimeMillis() - timestamp) + "мс");

        timestamp = System.currentTimeMillis();
        System.out.println("Начинаю сортировку втавками");
        mal.insertionSort();
        System.out.println("Сортировка втавками завершена за " + (System.currentTimeMillis() - timestamp) + "мс");

        timestamp = System.currentTimeMillis();
        System.out.println("Начинаю перемешивать массив");
        mal.shuffle(100000);
        System.out.println("Массив перемешан за " + (System.currentTimeMillis() - timestamp) + "мс");


        timestamp = System.currentTimeMillis();
        System.out.println("Начинаю сортировку пузырьком");
        mal.bubbleSort();
        System.out.println("Сортировка пузырьком завершена за " + (System.currentTimeMillis() - timestamp) + "мс");

    }
}
