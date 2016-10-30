package lab5;

import lab3.*;
import lab2.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author cgonz
 */
public class Startup {
    public static void main(String[] args) {
        /*Create 4 Employee objects, 2 are equal based on overridden 
        equals method in Employee Class*/
        Employee employee1 = new Employee("Rooney","Wayne", "333-33-3333");
        Employee employee2 = new Employee("Suarez","Luis", "444-44-4444");
        Employee employee3 = new Employee("Carrick","Steve", "888-88-8888");
        Employee employee4 = new Employee("Carrick","Steve", "888-88-8888");
        
        /*Creating a List with Employee objects (with generics)*/
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        
        Set<Employee> employeesNoDuplicates = new LinkedHashSet(employees);
        employees = new ArrayList<>(employeesNoDuplicates);
        
        // Display new Employee object list:
        for(Employee e : employees){
            System.out.println(e);
        }
        
        
        
    }


}
