//Problem: Given a string s, return it reversed.
import java.util.Arrays;

class Solution {
    public String reverseString(String s) {
        if (s == null) return null;
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        String test1 = "hello";
        String test2 = "Java";
        String test3 = null;
        
        System.out.println("Original: " + test1 + " -> Reversed: " + solution.reverseString(test1));
        System.out.println("Original: " + test2 + " -> Reversed: " + solution.reverseString(test2));
        System.out.println("Original: null -> Reversed: " + solution.reverseString(test3));
    }
}
