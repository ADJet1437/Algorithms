package MergeSort;

public class MergeSort {

    public static void main(String[] args){
        Comparable[] a = {3, 5, 6, 0, 0, 8, 21, 11};
        sort(a);
        print(a);

        Comparable[] b = {'h', 'J', 'B', 'z', 'D'};
        sort(b);
        print(b);
    }

    public static void print(Comparable[] a){
        for(Comparable i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi<=lo) return;
        // find the mid
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid+1, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        // merge the two halves: a[lo:mid+1] and a[mid+1:hi]

        int i = lo, j = mid+1;

        // make an auxiliary array
        Comparable[] aux = new Comparable[a.length];
        for(int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        // merge back to a
        for (int k = lo; k<= hi; k++) {
            // if left half exhausted, take from the right
            if (i>mid) a[k] = aux[j++];
            // if right half exhausted, take from the left
            else if (j>hi) a[k] = aux[i++];
            // current key on the left half is less than the current key on the right half, take from left
            else if (less(aux[i], aux[j])) a[k] = aux[i++];
            // current key on the right half is less than the current key on the left half, take from right
            else a[k] = aux[j++];
        }
    }

    private static boolean less(Comparable i, Comparable j) {
        return i.compareTo(j) < 0;
    }
}
