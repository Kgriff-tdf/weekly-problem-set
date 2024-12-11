/*goal: to check if the characters matches as a pair
solution: stack

1) if ( [ {, add ) ] } to stack. 
2) else, .peek to check, if not equal, return false; if equals, pop()
3) check if the stack.isEmpty();
4) Time complexity: O(n)；space complexity: O(n) <= since the worst case we will have to add all the element to the stack

e.g. （{}
stack: )} => ) not empty, return false

scenarios: 
1) left more than right; => !stack.isEmpty()
2) right more than left;  
3) same amount, the types dont matches
4） corner case: s.length() == 1 return false;


 * 
 */


class Solution {
    public boolean isValid(String s) {

        if (s.length() == 1) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == '{') {
                stack.push('}');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            } else {
                if (stack.charAt(i) != stack.peek()) return false;

                stack.pop();
            }
        }

        return stack.isEmpty();

    }
    
}
