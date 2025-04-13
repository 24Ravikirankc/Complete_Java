enum Employee{
	emplId, emplName, empAddress, empBlock;
}

public class Enum {
    public static void main(String[] args) 
    {

    	int i=5;   	
    	Employee[] ee =Employee.values();
    	System.out.println(ee);
    	
    	for(Employee e:ee)
    	{
    		System.out.println(e);
    		System.out.println(e+" : "+e.ordinal());
    	}
        
    }
}
