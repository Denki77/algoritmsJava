package lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        MyTreeMap<Integer, String> map = new MyTreeMap<>();
//        map.put(3, "five");
//        map.put(4, "three");
//        map.put(5, "nine");
//        map.put(6, "four");
//        map.put(7, "seven");
//        System.out.println(map);
//        System.out.println(map.deep());
//        System.out.println(map.isBalance());

//        map.delete(4);
//        System.out.println(map);

//        map.deleteMin();
//        System.out.println(map.minKey());
//        System.out.println(map.get(4));
//        System.out.println(map.contains(9));

        // построим 1000 деревьев
        int countBalancedTrees = 0;
        int countTrees = 20000;
        int maxDeepForTrees = 6;
        Random random = new Random();
        for (int i = 0; i < countTrees; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            int valueForMap = 1;
            for (int j = 0; j < maxDeepForTrees; ) {
                map.put(random.nextInt(200) - 100, valueForMap++);
                j = map.deep();
            }
            if (map.isBalance()) {
                countBalancedTrees++;
            }
        }
        System.out.printf("Количество деревьев %1d из них сбалансированно %2d", countTrees, countBalancedTrees);
    }
}
