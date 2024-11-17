
    
    class Mobile   //Instance Variable
{
    String os;
    static String name;    // if add static then all the value will be same
    int price;

    public void Shows()  // instance Method Variable
    {
        System.out.println(os + " : " + name + " : " + price);  
    }
   

    public static void Shows1(Mobile obj)
    {
        System.out.println(obj.os + " : " + obj.name + " : " + obj.price);         //non-static variable price cannot be referenced from a static context so we should call the parameter
    }
}



public class Staticmethod 
{

    public static void main(String[] args) 
    
    {
        Mobile obj = new Mobile();

        obj.os = "Android Phone";
        obj.name = "Samsung";
        obj.price = 18000;
       
        Mobile obj1 = new Mobile();

        obj1.os = "Apple Phone";
        obj1.name = "IPhone";
        obj1.price = 53000;

        Mobile obj2 = new Mobile();

        obj2.os = "Apple Phone";
        obj2.name = "IPhone G7";
        obj2.price = 78000;

        obj.Shows();
        obj1.Shows();
        obj2.Shows();

        Mobile.Shows1(obj); //If you wont add the obj parameter it will get error
    
    }
    
}


