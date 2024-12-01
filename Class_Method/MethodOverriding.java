class Calc
{
    public int add(int i, int j)  // This is method
    {
        return i + j;
    }
}

class AdvCalc
{
    public int add(int i, int j)  
    {
        return i + j + 1;
    }
}



public class MethodOverriding 
{
    public static void main(String[] args) 
    {
        AdvCalc obj = new AdvCalc(); // 
        int r = obj.add(3, 6);
        System.out.println(r);
    }
}
