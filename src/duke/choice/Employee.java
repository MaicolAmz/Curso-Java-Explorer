package duke.choice;

public class Employee {
    private int identification;
    private String name;
    private double salary;
    private static int cantidad;

    public Employee(int identification, String name, double salary) {
        this.identification = identification;
        this.name = name;
        this.salary = salary;
        this.cantidad++;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "identification=" + identification +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
