

// class Mobile //Instance Variable
// {
//     String os;
//     String name;   
//     int price;

   

//     public Mobile() //Constructor
//     {
//         name = ""; // This empty name should achive by craeting Static constructor as shown above line no 9
//         price = 290000;
//         os = "Android";
//         System.out.println("In Constructor");
//     }

//     static // This is static block and only once we have to create
//     {  
//         name = "Phone";
//         System.out.println("In Static Block");
//     }

//     public void Shows()  // instance Method/Static Variable
//     {
//         System.out.println(os + " : " + name + " : " + price);  
//     }
// }

// public class Staticblock
// {

//     public static void main(String[] args) 
    
//     {

//         class.forName(className: "Mobile");
//         // Mobile obj = new Mobile();

//         // obj.os = "Android Phone";
//         // obj.name = "Samsung";
//         // obj.price = 18000;
       
//         // obj.Shows();

//         // Mobile obj2 = new Mobile();
   
    
//     }
    
// }


class Mobile { // Instance Variable
    String os;
    String name;   
    int price;

    // Static block
    static {
        // Initialize static variables if needed
        System.out.println("In Static Block");
    }

    // Constructor
    public Mobile() {
        name = "Phone"; // Initialize name in the constructor
        price = 290000;
        os = "Android";
        System.out.println("In Constructor");
    }

    public void show() { // Instance Method
        System.out.println(os + " : " + name + " : " + price);  
    }
}

public class Staticblock {
    public static void main(String[] args) {
        try {
            Class.forName("Mobile"); // Correct way to load class by name

            Mobile obj = new Mobile(); // Create an instance of Mobile
            obj.os = "Android Phone"; // Set instance variables
            obj.name = "Samsung";
            obj.price = 18000;
           
            obj.show(); // Call the instance method

            Mobile obj2 = new Mobile(); // Create another instance of Mobile
            obj2.show(); // Call the instance method for the second object

        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Handle potential exceptions
        }
    }
}