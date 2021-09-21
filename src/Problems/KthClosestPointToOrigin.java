package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class KthClosestPointToOrigin {
    public static int[][] kClosest(int[][] points, int k) {
        HashMap<int[], Integer> hashMap = new HashMap<int[], Integer>();

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];

            int distance = x * x + y * y;

            hashMap.put(points[i], distance);

            // System.out.println(points[i][0] + " " + points[i][1]);
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((a, b) -> hashMap.get(a) - hashMap.get(b));
        maxHeap.addAll(hashMap.keySet());

        ArrayList<int[]> resultList = new ArrayList<int[]>();

        for (int i = 0; i < k; i++) {
            resultList.add(maxHeap.poll());
        }

        int[][] resultArray = new int[resultList.size()][];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}