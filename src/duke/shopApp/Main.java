package duke.shopApp;

import duke.choice.Departament;
import duke.choice.Employee;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido Maicol, tú puedes");

        Employee employee1 = new Employee(1,"Mateo",2.0);
        Employee employee2 = new Employee(2,"Juan",3.0);
        Employee employee3 = new Employee(3,"Jose",1.4);
        Employee[] items = new Employee[Employee.getCantidad()];

        Departament departament1 = new Departament("Departamento1", new Employee[Employee.getCantidad()]);

        items[0] = employee1;
        items[1] = employee2;
        items[2] = employee3;

        departament1.addEmployee(items);

        System.out.println(departament1.getName());
        departament1.toString();
        departament1.calcularSalary();

        if(departament1.getEmployee(4) == null) {
            System.out.println("No existe empleado");
        } else {
            System.out.println(departament1.getEmployee(4));
        };
    }
}
