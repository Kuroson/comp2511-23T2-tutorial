package employee;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

/**
 * See equals definition here:
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object)
 */
public class EmployeeTests {
    // @Test
    // public void InequalityTest() {
    //     Employee a = new Employee("Employee1", 1000);
    //     Employee b = new Employee("Employee2", 1000);
    //     assertFalse(a.equals(b));
    //     Employee c = new Employee("Employee1", 5);
    //     assertFalse(a.equals(c));
    // }

    // @Test
    // public void ReflectiveTests() {
    //     // Should equal itself
    //     Employee a = new Employee("Employee1", 1000.0);
    //     assertTrue(a.equals(a));

    //     Manager b = new Manager("Manager1", 1000.0, LocalDate.now());
    //     assertTrue(b.equals(b));
    // }

    // @Test
    // public void SymmetricTests() {
    //     // Should equal each other
    //     Employee a = new Employee("Employee1", 1000.0);
    //     Employee b = new Employee("Employee1", 1000.0);
    //     assertTrue(a.equals(b)); // a == b
    //     assertTrue(b.equals(a)); // b == a

    //     Manager c = new Manager("Employee1", 1000.0, LocalDate.now());
    //     Manager d = new Manager("Employee1", 1000.0, LocalDate.now());
    //     assertTrue(c.equals(d)); // c == d
    //     assertTrue(d.equals(c)); // d == c

    //     // Manager should not equal Employee
    //     assertFalse(a.equals(c)); // a != c
    //     assertFalse(c.equals(a)); // c != a
    // }

    // @Test
    // public void TransitiveTests() {
    //     // If a == b and b == c, then a == c
    //     Employee a = new Employee("Employee1", 1000.0);
    //     Employee b = new Employee("Employee1", 1000.0);
    //     Employee c = new Employee("Employee1", 1000.0);
    //     assertTrue(a.equals(b)); // a == b
    //     assertTrue(b.equals(c)); // b == c
    //     assertTrue(a.equals(c)); // a == c

    //     Manager d = new Manager("Employee1", 1000.0, LocalDate.now());
    //     Manager e = new Manager("Employee1", 1000.0, LocalDate.now());
    //     Manager f = new Manager("Employee1", 1000.0, LocalDate.now());
    //     assertTrue(d.equals(e)); // d == e
    //     assertTrue(e.equals(f)); // e == f
    //     assertTrue(d.equals(f)); // d == f
    // }

    // @Test
    // public void NullTests() {
    //     Employee a = new Employee("Employee1", 1000);
    //     assertFalse(a.equals(null));
    //     Manager b = new Manager("Manager1", 0, LocalDate.now());
    //     assertFalse(b.equals(null));

    //     // Now testing when attributes are null
    //     // Java is not null safe, so any variable can be null
    //     Manager c = new Manager(null, 0, null);
    //     Manager d = new Manager(null, 0, null);
    //     assertTrue(c.equals(d)); // Attributes are all the same, so they should be equal
    //     assertFalse(c.equals(a));
    // }
}
