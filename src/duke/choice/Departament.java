package duke.choice;

public class Departament {
    private String name;
    private Employee[] employees;
    private static final int MAX_EMP = 10;

    public Departament(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    public void addEmployee(Employee[] employees) {
        if (this.employees.length < 11) {
            this.employees = employees;
        } else {
            System.out.println("Departamento completo");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public String toString() {
        int cantidadEmpleados = 0;
        for (Employee employee : this.getEmployees()) {
            System.out.println(employee.toString());
            cantidadEmpleados++;
        }
        System.out.println("Cantidad de Empleados : " + cantidadEmpleados);
        System.out.println("Cantidad de Nulos : " + (this.MAX_EMP - cantidadEmpleados));
        return null;
    }

    public void calcularSalary() {
        double total = .0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        System.out.println("El total de Salarios: " + total);
        System.out.println("La media de los Salarios: " + total/employees.length);
    }

    public Employee getEmployee(int indentification) {
        Employee employee1 = null;
        for (Employee employee : employees) {
            if (employee.getIdentification() == indentification) {
                employee1 = employee;
            }
        }
        return employee1;
    }
}
