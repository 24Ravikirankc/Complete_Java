package Practice;
class AssignmentOperator {
    public static void main(String[] args) {
        int x = 29;
        //x += 5; // x = x + 5 output is 10
        //x -= 5; // x = x - 5 output is 0
        // x *= 5; // x = x * 5 output is 25
        // x /= 5; // x = x / 5 output is 1
        x %= 13; // x = x % 13 output is 5 and
        System.out.println(x);
    }
}