package Practice;
class Arthmatic
{
    public static void main(String args[])
    {
        int a = 7;
        int b = 12;
        int c = a*b;
        float e = a/b;
        int f = a%b;
        int g = 2 + 3 * 6;
        int h = 3 * 6 + 2;
        String text = "Ravi" + " Kiran";

        System.out.println(text);
        System.out.println(c);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(--a);

        System.out.println(a = b);
        System.out.println(a > b);
        System.out.println(a == b);
        System.out.println(a <= b);
    }
}