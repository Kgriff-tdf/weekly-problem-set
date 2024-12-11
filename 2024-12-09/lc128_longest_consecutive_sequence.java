/*
 * goal: find the smallest number in the consecutive sequence, then count all the connected numbers, find the max of the count
 * 
 * solution: hashset, loop in the set to find the smallest num-1, count++
 * 
 * Time complexity: O(n); space complexity: O(n) <= hashset
 * 
 */

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums.length;
        
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxCount = Integer.MIN_VALUE;

        for (int num : set) {
        
            if (!set.contains(num-1)) {
                int count = 1;
                int currentNum = num;

                while (set.contains(currentNum+1)) {
                    count++;
                    currentNum++;
                }

                maxCount = Math.max(maxCount, count);


            }
        }

        return maxCount;

  
    }

}