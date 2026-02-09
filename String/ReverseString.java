public class ReverseString {

    // Method to reverse a string
    public static String reverseString(String s) {
        if (s == null) return null;
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String input1 = "hello";
        String input2 = "Interview";

        System.out.println("Input 1: " + input1);
        System.out.println("Reversed 1: " + reverseString(input1));

        System.out.println("Input 2: " + input2);
        System.out.println("Reversed 2: " + reverseString(input2));
    }
}


//Input 1: hello
// Reversed 1: olleh
// Input 2: Interview
// Reversed 2: weivretnI
