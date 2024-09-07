import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    String name;
    int age;
    String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
}

public class EmployeeManager {
    private Map<Integer, Employee> employees;

    public EmployeeManager() {
        this.employees = new HashMap<>();
    }

    public void addEmployee(int id, String name, int age, String department) {
        Employee newEmployee = new Employee(name, age, department);
        employees.put(id, newEmployee);
    }

    public void retrieveEmployee(int id) {
        if (employees.containsKey(id)) {
            Employee employee = employees.get(id);
            System.out.println("Name: " + employee.name + ", Age: " + employee.age + ", Department: " + employee.department);
        } else {
            System.out.println("Employee not found!");
        }
    }

    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Retrieve Employee");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter department: ");
                    String department = scanner.next();
                    employeeManager.addEmployee(id, name, age, department);
                    break;
                case 2:
                    System.out.print("Enter employee ID to retrieve: ");
                    int idToRetrieve = scanner.nextInt();
                    employeeManager.retrieveEmployee(idToRetrieve);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}


//This program creates an EmployeeManager class that uses a HashMap to store Employee objects with their IDs as keys. It provides methods to add and retrieve employees. The main method creates an EmployeeManager object and uses a Scanner to get user input, allowing users to interact with the program.