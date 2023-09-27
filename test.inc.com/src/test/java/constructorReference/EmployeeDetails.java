package constructorReference;

import java.util.function.Function;

public class EmployeeDetails {
    public static void main(String[] args) {
        Function<String, Task1Employee> employeeCreator = (name) -> new Task1Employee(name, "12345", 50000.0);

        Task1Employee employee = employeeCreator.apply("John Doe");

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Account: " + employee.getAccount());
        System.out.println("Employee Salary: " + employee.getSalary());
    }

}
