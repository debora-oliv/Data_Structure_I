package list.exercicio_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Employee> employees = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("Name: ");
            sc.nextLine();//clear the sc buffer
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employees.add(new Employee(name, salary));
        }
        printEmployees(employees);

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        int resultID = searchByID(employees, id);
        if (resultID >= 0) {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employees.get(resultID).increaseSalary(percentage);
        }else
            throw new RuntimeException("This id does not exist!");

        printEmployees(employees);

        sc.close();
    }

    public static void printEmployees(List<Employee> employees) {
        System.out.println("List of employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int searchByID(List<Employee> employees, int id) {
        for (var employee : employees) {
            if (employee.getId() == id) return id  - 1;
        }
        return -1;
    }
}