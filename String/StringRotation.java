public class StringRotation {

    // Method to check if s2 is rotation of s1
    public static boolean isRotation(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length() || s1.length() == 0) return false;
        String temp = s1 + s1;
        return temp.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        String s3 = "bottlewaterx";

        System.out.println("Is \"" + s2 + "\" rotation of \"" + s1 + "\"? " + isRotation(s1, s2));
        System.out.println("Is \"" + s3 + "\" rotation of \"" + s1 + "\"? " + isRotation(s1, s3));
    }
}
