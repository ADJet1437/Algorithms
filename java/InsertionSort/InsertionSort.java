package InsertionSort;

public class InsertionSort {

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
        for(int i = 0; i < a.length; i++) {
            for(int j = i; j > 0; j--) {
                if (less(a, j, j-1)) exchange(a, j, j - 1);
            }
        }
    }

    private static boolean less(Comparable[] a, int i, int j) {
        return a[i].compareTo(a[j]) < 0;
    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
