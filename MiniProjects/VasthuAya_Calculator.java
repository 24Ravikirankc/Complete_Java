import java.util.Scanner;


//  Author: Ravikiran K C //
class VasthuAya_Calculator 
{
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner (System.in);

        System.err.print("Enetr the Lenght: ");
        int Lenght = scanner.nextInt();

        System.err.print("Enetr the Width: ");
        int Width = scanner.nextInt();

        int mult = Lenght * Width;
        int reminder = mult % 8;

        switch (reminder) 
        {
            case 1:
                       System.err.println("Dhwajaya");
                       break;
            case 2:
                       System.err.println("Domaya");
                       break;
            case 3:
                       System.err.println("Simhaya");
                       break;
            case 4:
                       System.err.println("Sunakaya");
                       break;
            case 5:
                       System.err.println("Vrushabhaya");
                       break;
            case 6:
                       System.err.println("Karavashaya");
                       break;
            case 7:
                       System.err.println("Gajaya");
                       break;
            case 8:
                       System.err.println("Vayasaya");
                       break;
            default:
                       System.err.println("Reminder is not in the range");
        }
    }
}