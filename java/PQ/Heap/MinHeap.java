package PQ.Heap;

public class MinHeap<Key extends Comparable<Key>> {
    private Key[] pq;
    private int n = 0;

    public MinHeap(int maxN) {
        pq = (Key[]) new Comparable[maxN + 1];
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void insert (Key v) {
        pq[++n] = v;
        swim(n);
    }

    public Key delMin() {
        Key min = pq[1];
        // exchange min with last item and decrement the size by 1
        exchange(1, n--);
        // set the previous last item position as null
        pq[n+1] = null;
        sink(1);
        return min;
    }

    private void swim (int k) {
        // if parent is greater than child, exchange
        while (k > 1 && less(k, k / 2)) {
            exchange(k, k / 2);
            k = k / 2;
        }
    }

    private void sink(int k) {
        // find smaller children and exchange with its parent
        while (2*k < n) {
            int j = 2*k;
            if (j < n && less(j+1, j)) j++;
            if (!less(j, k)) break;
            exchange(k, j);
            k = j;
        }


    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void exchange(int i, int j) {
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }
}
