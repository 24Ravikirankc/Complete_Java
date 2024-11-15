import java.util.Scanner;

class Bino {
    int p, m, e, w;
    int comb;
    Scanner sc = new Scanner(System.in);

    // Constructor to initialize p and m
    Bino() {
        p = 0;
        m = 0;
        e = 0; // Initialize e
        w = 0; // Initialize w
    }

    void input() {
        System.out.print("Enter the first number (p): ");
        p = sc.nextInt();
        System.out.print("Enter the second number (m): ");
        m = sc.nextInt();
        System.out.print("Enter the highest power (w): ");
        w = sc.nextInt();
        System.out.print("Enter the lowest power (e): ");
        e = sc.nextInt();
    }

    int fact(int x) {
        int s = 1;
        for (int i = 1; i <= x; i++) {
            s *= i; // Simplified multiplication
        }
        return s;
    }

    int compute() {
        int a = fact(p);
        int b = fact(m);
        int k = fact(p - m);
        comb = a / (b * k);
        return comb;
    }

    void bmial() {
        // Loop to compute and print the binomial expression
        for (int i = 0; i <= w; i++) { // Loop for each power from highest to lowest
            int d = compute();
            System.out.print(d + " * " + Math.pow(p, w - i) + " * " + Math.pow(m, e + i)); // Corrected power usage
            if (i < w) { // Add "+" between terms except for the last term
                System.out.print(" + ");
            }
            // Update powers after each term
            e++;
        }
        System.out.println(); // Print new line at the end
    }

    public static void main(String[] args) {
        Bino ob = new Bino();
        ob.input();
        ob.bmial();
    }
}