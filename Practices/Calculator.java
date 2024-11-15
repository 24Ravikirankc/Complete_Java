public class Calculator
{
    int a;
    public int Add(int x, int y)
        {
            a = x + y;
            return a;
        }


public static void main(String[] args)
{
    int n1 = 2;
    int n2 = 4;
    Calculator sum = new Calculator();
    int r = sum.Add(n1, n2);
    System.out.println(r);
}
}