
/**
 * Employee.java
 * [Jelaskan kegunaan class ini]
 * @author [18220015] [Farhandika]
 */

public class Employee {
    private static int employeeCount;

    private String name;
    private double baseSalary;

    /**
     * Konstruktor
     * @param name
     * @param baseSalary
     */
    public Employee(String name, double baseSalary) {
        employeeCount += 1;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    /**
     * Menambahkan gaji pegawai
     * @param amount jumlah peningkatan, asumsi amount >= 0
     */
    public void increaseSalary(double amount) {
        this.baseSalary += amount;
    }

    /**
     * Getter name
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter baseSalary
     * @return baseSalary
     */
    public double getBaseSalary() {
        return this.baseSalary;
    }

    /**
     * @return jumlah karyawan
     */
    public static int getEmployeeCount() {
        return employeeCount;
    }
}