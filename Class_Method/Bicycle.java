package Class_Object;
public class Bicycle {
    int gear = 5;

    public void braking()
    {
        System.out.println("Working of Braking");
    }

    public static void main(String [] args)
    {

        Bicycle sportsBicycle = new Bicycle();
        //Bycycle touringBicycle = new Bycycle();

        sportsBicycle.braking();
        System.out.println("Gear : " + sportsBicycle.gear);
    }
    
}
