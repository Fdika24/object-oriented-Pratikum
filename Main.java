import java.lang.System;
import java.util.Scanner;

/**
 * Main.java
 * [Jelaskan kegunaan class ini]
 * @author [18220015] [Farhandika]
 */

public class Main {
    static private Employee employee;
    static private EmployeePerformance performance;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        double basicSalary = scanner.nextDouble();
        double currentPoints = scanner.nextDouble();
        double targetPoints = scanner.nextDouble();
        employee = new Employee(
                name,
                basicSalary
        );
        performance = new EmployeePerformance(
                employee,
                currentPoints,
                targetPoints
        );
        if (performance.isPromotable()) {
            System.out.printf("YES\n");
            System.out.printf("%.2f\n", performance.getCurrentSalary());
        } else {
            System.out.printf("NO\n");
            System.out.printf("%.2f\n", 2 * targetPoints - currentPoints);
        }
        scanner.close();
    }
}
