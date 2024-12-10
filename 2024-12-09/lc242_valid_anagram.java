/*
 * two strings: s, t
 * goal: to check if they have the same char
 * solution: 1) hashmap; 2) array for a better space complexity
 */

public class Solution {
    public boolean isAnagram(String s, String t) {
        
        //corner cases
        if (s.length() != t.length()) return false;


        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            arr[letter - 'a']++;
        }

        for (int j = 0; j < t.length(); j++) {
            char letter = t.charAt(j);
            arr[letter - 'a']--;
        }

        for (int num : arr) {
            if (num != 0) return false; 
        }

        return true;
            
    }
}
