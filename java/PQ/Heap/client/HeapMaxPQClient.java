package PQ.Heap.client;

import PQ.Heap.MinHeap;

import java.util.Scanner;
import java.util.Stack;

public class HeapMaxPQClient {

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        MinHeap<Integer> pq = new MinHeap<Integer>(m + 1);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            pq.insert((Integer) scanner.nextInt());
            if(pq.size() > m) {
                pq.delMin();
            }
        }
        Stack<Integer> stack = new Stack<Integer>();
        while (!pq.isEmpty()) {
            stack.push(pq.delMin());
        }
        for (Integer i : stack) {
            System.out.println(i);
        }
    }
}
