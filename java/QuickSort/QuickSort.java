package QuickSort;

public class QuickSort {

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
        sort(a, 0, a.length -1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        // rearrange the array to a[lo...j-1] a[j] and a[j+1...hi]
        // having a[lo...j-1] <= a[j] <= a[j+1...hi]
        Comparable v = a[lo];
        int i = lo, j = hi+1;
        while (true) {
            // scan from left
            while (less(a[++i], v)) if (i>=hi) break;
            while (less(v, a[--j])) if (j<=lo) break;
            if (i >= j) break;
            exchange(a, i, j);
        }
        exchange(a, lo, j);
        return j;
    }

    private static boolean less(Comparable i, Comparable j) {
        return i.compareTo(j) < 0;
    }
    private static void exchange(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
