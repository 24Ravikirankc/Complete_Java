import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class GreaterThan {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Ravi", 40000),
            new Employee("Kiran", 60000),
            new Employee("Theju", 75000),
            new Employee("Krish", 30000),
            new Employee("Ram", 300000)
        );

        List<Employee> highEarners = employees.stream()
                                              .filter(emp -> emp.salary > 50000)
                                              .collect(Collectors.toList());

        highEarners.forEach(emp -> System.out.println(emp.name + " earns " + emp.salary));
    }
}