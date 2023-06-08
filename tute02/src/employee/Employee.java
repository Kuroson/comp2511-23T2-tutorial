package employee;

/**
 * Create an `Employee` class which has private fields for
 * an employee's name and salary and appropriate getters,
 * setters, and constructors. Document the class with JavaDoc.
 */
public class Employee extends Object {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Gets the name of Employee
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of Employee to `newName`
     * @param newName new name of employee as a String
     */
    public void setName(String newName) {
        this.name = newName;
    }

    // @Override
    // public String toString() {
    //     return "Employee: " + this.name + " salary: " + this.salary;
    // }

    public boolean equals(Object obj) {
        return true;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John", 100.2);
        Employee e2 = new Employee("John", 100.2);
        System.out.println(e1);
        System.out.println(e2.toString());
        System.out.println(e1.equals(e2));
        // System.out.println(e);

        // Manager m = new Manager("Smith", 1234.5678, LocalDate.now());
        // System.out.println(m);
    }
}
