/*
 * Employee Management System Implement an employee management system in Java using ArrayList and a class. The system should have the
following functionalities: Add an employee to the system 
Remove an employee from the system
Display all employees in the system
To implement this system, you can create an Employee class with attributes such as name, age, salary, etc. Then, you can create an ArrayList to
store all the employees. You can then implement functions to add, remove and display employees
 */
import java.util.ArrayList;


class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeManagementSystem {
    private ArrayList<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    
    public void addEmployee(String name, int age, double salary) {
        Employee employee = new Employee(name, age, salary);
        employees.add(employee);
        System.out.println("Employee added: " + employee);
    }

   
    public void removeEmployee(String name) {
        Employee employeeToRemove = null;
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
            System.out.println("Employee removed: " + employeeToRemove);
        } else {
            System.out.println("Employee not found: " + name);
        }
    }


    public void displayAllEmployees() {
        System.out.println("List of all employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}


class Main13 {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

     
        system.addEmployee("Alice", 30, 70000);
        system.addEmployee("Bob", 25, 50000);
        system.addEmployee("Charlie", 28, 60000);

  
        system.displayAllEmployees();

   
        system.removeEmployee("Bob");

        system.displayAllEmployees();
    }
}
