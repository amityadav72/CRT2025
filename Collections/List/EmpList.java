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


        List<Employee> employeeList = new ArrayList<>(); // < > this is generic

        employeeList.add(new Employee(101, "Amit"));
        employeeList.add(new Employee(102, "Ravi"));
        employeeList.add(new Employee(103, "Amit"));
        employeeList.add(new Employee(104, "John"));
        employeeList.add(new Employee(105, "Ravi"));


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


        int employeesWithDuplicateNames = 0;
        for (Employee emp : employeeList) {
            if (nameCountMap.get(emp.empName) > 1) {
                employeesWithDuplicateNames++;
            }
        }

        System.out.println("Total employees having duplicate names: " + employeesWithDuplicateNames);

        if (!employeeList.isEmpty()) {
            employeeList.remove(0);
        }


        System.out.println("\nEmployee List after removing the first employee:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
