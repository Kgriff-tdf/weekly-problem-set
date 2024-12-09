//encode: Input: ["neet","code","love","you"]
// 4/neet4/code4/love4/you
//decode: loop in the string, loop to i, find the first number before /, save as length
//premium problem, free on Neetcode: https://neetcode.io/problems/string-encode-and-decode

class Solution {

    public String encode(List<String> strs) { //Input: ["neet","code","love","you"]
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length() + "/" + str); // 4/neet4/code4/love4/you
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
        //save the result to a list
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int slashIndex = str.indexOf("/", i); 
            String sub = str.substring(i, slashIndex); // subString(0, 1);
            int length = Integer.valueOf(sub); //can also directly convert the string to number, valueOf also works
            // int length = Integer.parseInt(sub); 

            String word = str.substring(slashIndex + 1, slashIndex + length + 1);

            result.add(word);

            i = slashIndex + length + 1;

        
        }

        return result;


    }
}
