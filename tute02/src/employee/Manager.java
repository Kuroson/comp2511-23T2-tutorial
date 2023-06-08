package employee;

import java.time.LocalDate;

/**
 * Create a `Manager` class that is a subclass of `Employee`
 * and has a field for the manager's hire date.
 */
public class Manager extends Employee {
    private LocalDate hireDate;

    public Manager(String name, double salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }
}
