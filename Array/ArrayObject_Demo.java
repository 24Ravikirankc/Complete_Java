
class Employee
{
     int empid;
     String empname;
     String empblood;
     String empdes;

}


public class ArrayObject_Demo
 {
    public static void main(String[] args)
    
    {
        Employee E1 = new Employee();
        E1.empid = 1;
        E1.empname = "Thejashwini";
        E1.empblood = "O Positive";
        E1.empdes = "Engineer";
    
        Employee E2 = new Employee();
        E2.empid = 2;
        E2.empname = "Kiran";
        E2.empblood = "O Positive";
        E2.empdes = "Lead Engineer";
    
        Employee E3 = new Employee();
        E3.empid = 3;
        E3.empname = "Guru";
        E3.empblood = "B Positive";
        E3.empdes = "Lead Engineer";
    
        Employee Employees[] = new Employee[3];
    
        Employees[0] = E1;
        Employees[1] = E2;
        Employees[2] = E3;
    
        for(int i = 0; i<Employees.length; i++)
        {
            System.out.println(Employees[i].empname + " : " + Employees[i].empid + " : " + Employees[i].empdes);
        }
    

    }
}
