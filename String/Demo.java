

 class Demo 
 {
    public static void main(String[] args)
    {
        String name = "Kiran";

        String name1 = new String("Iyengar");

        System.out.println(name);
        System.out.println("Theju " + name);

        System.out.println("Theju " + name  + name1);

        String s1 = "Kiran";
        String s2 = "Theju";
        String s3 = "Kiran";

        System.out.println(s1 == s2);
        
        System.out.println(s1 == s3);


    }
    
}
