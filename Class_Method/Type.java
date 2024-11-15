class Device {

    public void typeSomething(){
        System.out.println("Typing");
    }

    public void PrintSomething(){
        System.out.println("Hello World");
    }
    
}

public class Type
{
public static void main(String a[]) 
{
   Device obj = new Device();
   obj.typeSomething();
    Device obj1 = new Device();
    obj.PrintSomething();

}
}