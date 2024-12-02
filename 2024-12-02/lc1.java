//int[] nums; int target;
//goal: find two nums which add up to the target, return indices
//solution: 1) bruce force: Arrays.sort(), two pointers; 2) hashmap
//HashMap: nums = [2,7,11,15]
//key-value pair: num - index
//result: Time Complexity: O(n); Memory Complexity: O(n);


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;

            } 
            map.put(nums[i], i);

        }

        return result;

    }
    
}
