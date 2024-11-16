class Product
{
     int prdid;
     String prdname;
     int prdprice;
     int prddisc;

}


public class ArrayObject_Demo1 {


    public static void main(String[] args)
    
    {
        Product P1 = new Product();
        P1.prdid = 10;
        P1.prdname = "Amla Hair Oil";
        P1.prdprice = 98;
        P1.prddisc = 85;

        Product P2 = new Product();
        P2.prdid = 11;
        P2.prdname = "Sunpure Oil";
        P2.prdprice = 165;
        P2.prddisc = 135;

        Product P3 = new Product();
        P3.prdid = 12;
        P3.prdname = "Freedom Oil";
        P3.prdprice = 168;
        P3.prddisc = 132;

        Product Products[] = new Product[5];

        Products[0] = P1;
        Products[1] = P2;
        Products[2] = P3;

        for(int i = 0; i<Products.length; i++)
        {
            System.out.println(Products[i].prdid + " : " + Products[i].prdname + " : " + Products[i].prdprice);
        }


    }
}
