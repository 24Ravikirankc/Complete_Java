import java.util.HashMap;
import java.util.Map;

public class CharFrequencyString {

    // Method to compute frequency of each character
    public static Map<Character, Integer> charFrequency(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        if (s == null) return freq;
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        String input = "bananas";

        System.out.println("Input: " + input);
        Map<Character, Integer> freqMap = charFrequency(input);

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "'" + " -> " + entry.getValue());
        }
    }
}

// Output:
// Input: bananas
// Character frequencies:
// 'a' -> 3
// 'b' -> 1
// 's' -> 1
// 'n' -> 2
