package SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        Comparable[] a = {5, 2 ,1, 19, 97, 32, 8, 6};
        sort(a);
        print(a);

        Comparable[] b = {'a', 'j', 'h', 'G', 't'};
        sort(b);
        print(b);

        Comparable[] c = {"nd", "ALSKDFJ", "as", "b"};
        sort(c);
        print(c);
    }

    public static void print(Comparable[] a) {
        for (Comparable i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sort(Comparable[] a) {
        for(int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (less(a, j, min)){
                    min = j;
                }
            }
            exchange(a, i, min);
        }
    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private static boolean less(Comparable[] a, int i, int j) {
        return a[i].compareTo(a[j]) < 0;
    }
}
