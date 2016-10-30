package lab2;

import java.util.ArrayList;
import java.util.List;

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
        
        /*Creating a List with Employee objects (no generics)*/
        List employees = new ArrayList();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        
        //Retrieve object from list and output to console. 
        Employee retrieved = (Employee)employees.get(0);
        System.out.println(retrieved);
        
        /*For loops (old and new) Retrieve Employee objects and output 
        toString()*/
        
        for(int i=0;i < employees.size() ; i++){
            Employee retrievedEmployee = (Employee) employees.get(i);
            
            System.out.println(retrievedEmployee);
        }
        
        System.out.println("\n\n\n");
        
        for(Object e : employees){
            Employee retrievedEmployee = (Employee)e;
            System.out.println(retrievedEmployee);   
        }
        /*Remove Employee*/
        System.out.println("\n\n\n");
        
        System.out.println("After removal of an Employee object");
        employees.remove(1);
        for(Object e : employees){
            Employee retrievedEmployee = (Employee)e;
            System.out.println(retrievedEmployee);   
        }
        System.out.println("Size of employees List: " + employees.size());
        
        System.out.println("\n\n\n");
        
        /*Add Employee*/
        System.out.println("After adding new Employee object");
        Employee addedEmployee = new Employee("Rodriguez","James",
                "222-222-2222");
        employees.add(addedEmployee);
        for(Object e : employees){
            Employee retrievedEmployee = (Employee)e;
            System.out.println(retrievedEmployee);   
        }
        System.out.println("Size of employees List: " + employees.size());
        
        System.out.println("\n\n\n");
        
        /*Replace Employee object with new Employee object*/
        System.out.println("After adding new Employee object");
        Employee addedEmployee2 = new Employee("Chan","Jackie",
                "111-111-1111");
        employees.set(3, addedEmployee2);
        
        for(Object e : employees){
            Employee retrievedEmployee = (Employee)e;
            System.out.println(retrievedEmployee);   
        }
        System.out.println("Size of employees List: " + employees.size());
        
        
        
        
        
        
    }
}
