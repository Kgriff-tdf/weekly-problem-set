//int[] nums, int k
//goal: return the k most frequent elements, return the elements
//solution1: max-heap, PQ, HashMap
//result: Time Complexity: O(n) for hashmap, O(k*logk) for heap; Space Complexity: O(n+k)???

//solution2: Bucket Sort(tbc)

import java.util.HashMap;
import java.util.concurrent.PriorityBlockingQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //save the num and frequency in a hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        //create a PriorityQueue of the hashmap key-value pair, with the order from big to small
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        //for loop, get the key of the ones with the value >= k
        for (Map.Entry entry : map.entrySet()) {
            pq.offer(entry);
        }

        int[] result = new int[k];

        for (int i = 0; i < k ; i++) {
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}
