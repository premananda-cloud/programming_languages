class Employee {

    String name;
    double salary;
    double hra;
    double da;

    // Constructor when no parameter is passed
    Employee() {
        this.name = "Unknown";
        this.salary = 0.0; // Fixed: should be double, not "NULL"
        this.hra = 0.0;
        this.da = 0.0;
    }

    // Constructor when parameter is passed
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateHRA(); // Calculate HRA automatically
        calculateDA(); // Calculate DA automatically
    }

    // Salary Calculation methods
    double calculateHRA() {
        this.hra = this.salary * 0.20;
        return this.hra;
    }

    double calculateDA() {
        this.da = this.salary * 0.10;
        return this.da;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + salary);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("Total Salary: " + (salary + hra + da));
        System.out.println("---------------------------");
    }
}

public class EmployeeDetail {

    public static void main(String[] args) {
        Employee e1 = new Employee("Rash", 30000);
        Employee e2 = new Employee("Shelly", 8000);
        Employee e3 = new Employee(); // Default constructor

        // Display details
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
