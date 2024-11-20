package Practice;
class Ternary {
    public static void main(String[] args) {
        //int x = 8;
       // System.out.println(++x); output is 9. ++x = 1 + x
        int number = 0; /*  https://studyeasy.org/course-articles/s02l07-ternary-operator/  */
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println("The number is: " + result);
    }
}