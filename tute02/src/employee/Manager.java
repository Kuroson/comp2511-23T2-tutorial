package employee;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Create a `Manager` class that is a subclass of `Employee`
 * and has a field for the manager's hire date.
 */
public class Manager extends Employee {
    private LocalDate hireDate;

    /**
     * Creates a manager with a given name, salary and hiring date
     * @param name
     * @param salary
     * @param hireDate
     */
    public Manager(String name, double salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    public LocalDate getHireDate() {
        return this.hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + "[hireDate=" + hireDate + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // NOTE: This call to super.equals(obj) checks the following:
        // 1. Checks if its null
        // 2. Checks if its this (itself)
        // 3. Checks if its the same class (as Manager)
        // 4. Checks if all the attributes in the super class are equal
        if (!super.equals(obj))
            return false;

        // Because super.equals(...) already checks if they're the same class
        // We can typecast to Manager without worrying
        // NOTE: Every "dangerous" typecast operation should always be preceded by a check
        // I think its OK if you added a check here anyway
        Manager other = (Manager) obj;

        // Now we only need to compare the attributes that the subclass (Manager) introduces
        return Objects.equals(this.hireDate, other.hireDate);
    }
}
