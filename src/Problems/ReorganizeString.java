package Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {
    public static String reorganize(String s) {
        Map<Character, Integer> charCounts = new HashMap();
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> charCounts.get(b) - charCounts.get(a));
        // add distinct characters into maxHeap (keys)
        maxHeap.addAll(charCounts.keySet());

        // for each distinct character, place 
        StringBuilder result = new StringBuilder();
        while (maxHeap.size() > 1) {
            char current = maxHeap.remove();
            char next = maxHeap.remove();
            result.append(current);
            result.append(next);
            charCounts.put(current, charCounts.get(current) - 1);
            charCounts.put(next, charCounts.get(next) - 1);

            if (charCounts.get(current) > 0) maxHeap.add(current);
            if (charCounts.get(next) > 0) maxHeap.add(next);
        }

        if (!maxHeap.isEmpty()) {
            char last = maxHeap.remove();
            if (charCounts.get(last) > 1) {
                return "";
            }
            result.append(last);
        }

        return result.toString();
    }
}