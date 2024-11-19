class Human
{
   private String name;
   private int age;

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        this.age = a;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        this.name = n;
    }
}

public class Getter_Setter 
{
    public static void main(String[] args) {
        Human obj = new Human();

        obj.setAge(30);
        obj.setName("Kiran");
        System.out.println(obj.getAge() + ":" + obj.getName());
    }
}
