package CRT2025.Collections.List;

import java.util.*;

class Employee {
    int empId;
    String empName;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "ID: " + empId + ", Name: " + empName;
    }
}

public class EmpList {
    public static void main(String[] args) {

        // Creating the ArrayList of Employees
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(101, "Amit"));
        employeeList.add(new Employee(102, "Ravi"));
        employeeList.add(new Employee(103, "Amit"));
        employeeList.add(new Employee(104, "John"));
        employeeList.add(new Employee(105, "Ravi"));

        // Count how many names are duplicated (unique duplicate names)
        Map<String, Integer> nameCountMap = new HashMap<>();
        for (Employee emp : employeeList) {
            nameCountMap.put(emp.empName, nameCountMap.getOrDefault(emp.empName, 0) + 1);
        }

        int duplicateNameCount = 0;
        for (int count : nameCountMap.values()) {
            if (count > 1) {
                duplicateNameCount++;
            }
        }

        System.out.println("Number of duplicate employee names: " + duplicateNameCount);

        // Optional: Count how many employees have duplicate names
        int employeesWithDuplicateNames = 0;
        for (Employee emp : employeeList) {
            if (nameCountMap.get(emp.empName) > 1) {
                employeesWithDuplicateNames++;
            }
        }

        System.out.println("Total employees having duplicate names: " + employeesWithDuplicateNames);

        // Remove the first employee from the list
        if (!employeeList.isEmpty()) {
            employeeList.remove(0);
        }

        // Print the list after removal
        System.out.println("\nEmployee List after removing the first employee:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
