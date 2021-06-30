package lesson1;

public class Main {
    public static void main(String[] args) {
//
//        int b = 10;
//
//        System.out.println(a == b);

//

//        int a = 10;
//        inc(a);
//        System.out.println(a);


//        Person p1 = new Person("Ivan");
//        updateName(p1);
//        System.out.println(p1);


    }


    //O()
    public static int find7(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j < x/2; j++) {
                for (int k = 1; k < x/2; k++) {
                    sum += i + j + k;
                }
            }
        }
        return sum;
    }

    //O(N^2 * log n)
    public static int find6(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j < x; j++) {
                for (int k = 1; k < x; k *= 2) {
                    sum += i + j + k;
                }
            }
        }
        return sum;
    }

    //O(n^2)
    public static int find5(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j < x; j++) {
                sum += i * j;
            }
        }
        return sum;
    }

    // O( n * log (n))
    public static int find4(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j < x; j *= 2) {
                sum += i * j;
            }
        }
        return sum;
    }

    // O(n)
    public static int method2(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += x;
        }
        return sum;
    }

    // O( n^0.5)
    public static boolean isPrime(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    //O(log n)
    public static int find1(int x) {
        int i = 1;
        while (i <= x) {
            i *= 2;
        }
        return i;
    }

    // O(1)
    public static int method1(int[] arr) {
        return arr[arr.length - 1];
    }

    public static void updateName(Person p) {
        p.setName("Super " + p.getName());
    }

    public static int inc(int a) {
        return ++a;
    }


}
