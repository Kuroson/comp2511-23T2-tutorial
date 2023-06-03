package employee;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Create an `Employee` class which has private fields for
 * an employee's name and salary and appropriate getters,
 * setters, and constructors. Document the class with JavaDoc.
 */
public class Employee {
    private String name;
    private double salary;

    /**
     * Creates an Employee with the given name and salary
     * @param name The full name of the employee
     * @param salary The employee's yearly salary
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Gets the name of the Employee
     * @return full name of employee
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the Employee
     * @param name new full name
     */
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ", salary=" + salary + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) // Equal to null, we know its false instantly.
            return false;
        if (obj == this) // Equal to itself, we know its true instantly.
            return true;
        if (!obj.getClass().equals(this.getClass())) // Not the same class, we know its false instantly.
            return false;
        // At this point, we know its at least an Employee (meaning, Employee or any subclass of Employee)
        // subclass of employee => when a subclass calls this super.equals method

        Employee other = (Employee) obj;
        // Now we compare all the fields
        return Objects.equals(this.name, other.name) && Objects.equals(this.salary, other.salary);

        // NOTE: Objects.equals is best practice for comparing objects.
        // This is because it handles nulls properly.
        // If we were to use something like:
        // return this.name.equals(other.name) && this.salary == other.salary;
        // We would get a NullPointerException if this.name was null.
    }

    public static void main(String[] args) {
        Employee e = new Employee("John", 100.2);
        System.out.println(e);

        Manager m = new Manager("Smith", 1234.5678, LocalDate.now());
        System.out.println(m);
    }

}
