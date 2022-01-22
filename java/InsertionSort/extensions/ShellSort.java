package InsertionSort.extensions;

public class ShellSort {

    public static void main(String[] args){
        Comparable[] a = {3, 5, 6, 0, 0, 8, 21, 11};
        sort(a);
        print(a);
    }

    public static void print(Comparable[] a){
        for(Comparable i : a) {
            System.out.print(i + " ");
        }
    }

    public static void sort(Comparable[] a) {
        int n = a.length;
        int h = 1;
        // finding a proper h by given an array
        while (h < n/3) h = 3*h +1;
        while (h>=1){
            for (int i = h; i < n; i ++) {
                for (int j = i; j >= h ; j -= h) {
                    if (less(a, j, j-h)) {
                        exchange(a, j, j-h);
                    }
                }
            }
            h = h/3;
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
