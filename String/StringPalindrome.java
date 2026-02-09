public class StringPalindrome {

    // Method to check if a string is palindrome
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input1 = "racecar";
        String input2 = "hello";

        System.out.println("Input: " + input1 + ", isPalindrome: " + isPalindrome(input1));
        System.out.println("Input: " + input2 + ", isPalindrome: " + isPalindrome(input2));
    }
}


// Output:
// Input: racecar, isPalindrome: true
// Input: hello, isPalindrome: false
