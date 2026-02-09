public class FirstNonRepeatingCharString {

    // Method to find index of first non-repeating character
    public static int firstNonRepeatingCharIndex(String s) {
        if (s == null) return -1;
        int[] count = new int[256]; // ASCII

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String input1 = "leetcode";
        String input2 = "aaaabb";

        System.out.println("Input: " + input1 + ", First non-repeating index: " + firstNonRepeatingCharIndex(input1));
        System.out.println("Input: " + input2 + ", First non-repeating index: " + firstNonRepeatingCharIndex(input2));
    }
}
