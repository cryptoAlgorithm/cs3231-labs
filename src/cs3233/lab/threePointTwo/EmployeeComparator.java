package cs3233.lab.threePointTwo;

import java.util.Comparator;

//implement EmployeeComparator here. You are to sort by hireDate (more recent hire first)
public class EmployeeComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        if (e1.hireDate().after(e2.hireDate())) {
            return -1;
        } else if (e1.hireDate().before(e2.hireDate())) {
            return 1;
        } else {
            return 0;
        }
    }
}
