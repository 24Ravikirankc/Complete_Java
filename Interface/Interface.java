
interface A 
{
   int item = 3;  // final and Static
   String itemName = "Iphone";

   void list();
   void listdetails();
}

interface C
{
    void listDescription();
}

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface D extends C
{

    
}

class B implements A, D
{
    public void list()
    {
        System.out.println("There are some list");
    }
    public void listdetails()
    {
        System.out.println("list details are out now");
    }
    public void listDescription()
    {
        System.out.println("let us understand the list");
    }
}

public class Interface 
{
    public static void main(String[] args) 
    {
        A obj;
        obj = new B();
        obj.list();
        obj.listdetails();
        
        System.out.println(A.itemName);

        C obj1 = new B();
        obj1.listDescription();

    }   
}