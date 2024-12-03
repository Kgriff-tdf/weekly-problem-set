// int[] nums;
// boolean: count >= 2, return true;n
// solution: 1) Bruce force: Arrays.sort(); 2) HashSet
// Time Complexity: O(n); Space Complexity: O(n)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            
            if (set.contains(nums[i])) return true;

            set.add(nums[i]);
        }

        return false;

    }
}