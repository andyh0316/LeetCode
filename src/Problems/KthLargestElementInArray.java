package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a, b) -> b - a);
        // negative: a < b
        // zero: a == b
        // positive: a > b

        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
        }
        
        // while (!maxHeap.isEmpty()) {
        //     System.out.println(maxHeap.poll());
        // }

        int result = 0;
        for (int i = 0; i < k; i++) {
            result = maxHeap.poll();
        }

        return result;
    }
}