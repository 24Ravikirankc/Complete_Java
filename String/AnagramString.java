public class AnagramString {

    // Method to check if two strings are anagrams (assuming lowercase a-z)
    public static boolean areAnagrams(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        int[] count = new int[26]; // for 'a' to 'z'

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        String s3 = "hello";

        System.out.println("Are \"" + s1 + "\" and \"" + s2 + "\" anagrams? " + areAnagrams(s1, s2));
        System.out.println("Are \"" + s1 + "\" and \"" + s3 + "\" anagrams? " + areAnagrams(s1, s3));
    }
}


// Output:
// Are "listen" and "silent" anagrams? true
// Are "listen" and "hello" anagrams? false
