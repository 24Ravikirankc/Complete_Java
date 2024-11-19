
class Human 
{
    private int age;
    private String name;

    public Human()
    {
         age = 12;
         name = "Kiran";
        System.out.println("In Constructor : " + age + " : " + name);
    }
}


public class Constructor {
    public static void main(String[] args) 
    {
        Human obj = new Human();

        System.out.println("Hello");
    }
}
