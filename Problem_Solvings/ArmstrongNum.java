import java.util.Scanner;

public class ArmstrongNum
{
    public static void main(String args[])
    {
        int arg, sum = 0, r;

        Scanner scanner = new Scanner (System.in);

        System.err.print("Enetr the Number: ");
        int n = scanner.nextInt();


        arg = n;
        for (int i = 1; i < n; i++)
        {
            while (n > 0)
            {
                r = n % 10;
                sum = sum + (r * r * r);
                n = n / 10;

            }

        }
        if (arg == sum)
        {
            System.out.println("Given number is armstrong number ");
        }
        else
        {
            System.out.println("Given number is not armstrong number ");
        }
    }

}
