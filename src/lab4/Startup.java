package lab4;


import lab2.*;
import lab3.*;
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
        /*NOW USING SETS*/
        
        /*Create 4 Employee objects, 2 are equal based on overridden 
        equals method in Employee Class*/
        Employee employee1 = new Employee("Rooney","Wayne", "333-33-3333");
        Employee employee2 = new Employee("Suarez","Luis", "444-44-4444");
        Employee employee3 = new Employee("Carrick","Steve", "888-88-8888");
        Employee employee4 = new Employee("Carrick","Steve", "888-88-8888");
        
        /*Creating a Set with Employee objects (with generics)*/
        Set<Employee> employees = new LinkedHashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        
        
        
        /*Output of Employee objects in Set (Notice it removed one of the 
        objects)*/
        System.out.println("Created Set:");
        for(Employee e : employees){
            System.out.println(e);
        }
        
        //****CANNOT retrieve Employee object with a get() method
        
        System.out.println("\n\n\n");
        
        /*Remove Employee*/
        System.out.println("After removal of an Employee object");
        employees.remove(employee2);
        for(Employee e : employees){
            System.out.println(e);
        }
        System.out.println("Size of employees List: " + employees.size());
        
        System.out.println("\n\n\n");
        
        /*Add Employee*/
        System.out.println("After adding new Employee object");
        Employee addedEmployee = new Employee("Rodriguez","James",
                "222-222-2222");
        employees.add(addedEmployee);
        for(Employee e : employees){
            System.out.println(e);   
        }
        System.out.println("Size of employees List: " + employees.size());
        
        System.out.println("\n\n\n");
        
        /*CANNOT Replace Employee object with new Employee object*/
        
    }
}
