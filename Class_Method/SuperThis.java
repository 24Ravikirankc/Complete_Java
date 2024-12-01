class A
{

    public A()
    {
        super();
        System.err.println("In A");
    }
    public A(int i)
    {
        this();
        System.err.println("In A Int");
    }


}

class B extends A
{
    public B()
    {
        super();
        System.err.println("In B");
    }
    public B(int n)
    {
        this();
        System.err.println("In B Int");
    }
}

class SuperThis{
public static void main(String[] args)

{
    B obj = new B();
    B obj1 = new B(5);
}


}