package pratice.week2.first;

import java.util.PriorityQueue;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-18 10:40
 */
public class SmallestK {

    public int[] smallestK(int[] arr, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();


        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }

        int[] res = new int[k];

        for (int i = 0; i < k; i++){
            res[i] = heap.poll();
        }

        return res;
    }
}
