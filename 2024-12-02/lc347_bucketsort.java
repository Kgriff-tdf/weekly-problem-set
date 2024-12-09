//solution 2: bucket sort
//int[] nums, target: int k
//1) set up an array int[] frequency with the length of nums
//2) count the frequency, map.put()
//3) return the result in the most k columns
//important:  
// 1）for (int key : map.keySet()) 
// 2）The loop condition: result.size() < k

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1); //e.g.: num(key) = 3, frequency(value) = 3;
        }
 
        // List<int[]> frequency = new ArrayList<>(); wrong structre!!
        List<Integer>[] list = new List[nums.length+1];  //注意+1

        for (int key : map.keySet()) {

            int frequency = map.get(key); //frequency = 3

            //save the frequency to the List
            if (list[frequency] == null) {
                list[frequency] = new ArrayList<>();
            } 
            list[frequency].add(key);  
        }

       List<Integer> result = new ArrayList<>();

        // for (int i = 0; i < Math.min(list.length, k); i++) {//should be backwards!!
        for (int i = list.length -1; i >= 0 && result.size() < k; i--) { //Pay attention: result.size()<k
            if (list[i] != null) {
                for (int num : list[i]) {
                    result.add(num);
                    // if (result.size() == k) break; <== this doesn't work becuz it can't break the outer loop!
                }
            }
        }

        int[] resultArr = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            resultArr[i] = result.get(i);
   
        }

        return resultArr;
    
    }

}


