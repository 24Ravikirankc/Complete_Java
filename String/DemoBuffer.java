
class DemoBuffer 
{
    public static void main(String[] args) 
    
    {
        StringBuffer sb = new StringBuffer(); //String mutable
        StringBuffer sb1 = new StringBuffer("Kiran"); // After adding string value capacity() memory maight increase
        System.out.println(sb.capacity()); //capacity() is to know the memory of the StringBuffer this value is 16
        //System.out.println();
        System.out.println(sb1.capacity()); //capacity() value is 21

        System.out.println(sb.length());// the lenght value is zero becuase i have not been assigned any value
        System.out.println(sb1.length());// The lenght value is 5 bcz the assigned value os string having 5 charecter "Kiran"

        sb.append("Theju");
        System.out.println(sb);

        sb1.append("Theju");
        System.out.println(sb1);

        sb1.deleteCharAt(2); // we can delete the specific charecter from string
        System.out.println(sb1);

        // sb1.insert(offset:2, str:"r");//we can insert the charecter at specific space
        // System.out.println(sb1);

        String firstName = "Ravi";
        String lastName = "Kiran";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

   




    }
    
}
