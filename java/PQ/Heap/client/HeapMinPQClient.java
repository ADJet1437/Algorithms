package PQ.Heap.client;

import PQ.Heap.MaxHeap;

import java.util.Scanner;
import java.util.Stack;

public class HeapMinPQClient {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        MaxHeap<Integer> pq = new MaxHeap<Integer>(m+1);
        while (scanner.hasNext()) {
            pq.insert((Integer) scanner.nextInt());
            if(pq.size() > m) {
                pq.delMax();
            }
        }

        Stack<Integer> stack = new Stack<Integer>();
        while (!pq.isEmpty()) {
            stack.push(pq.delMax());
        }

        for (Integer i : stack) {
            System.out.println(i);
        }

    }
}
