package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee_avg {
    String name;
    String department;
    int salary;

    public Employee_avg(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public static void AverageOfEachDepartment(List<Employee_avg> employees){
        Map<String,Double> result= employees.stream().collect(Collectors.groupingBy(emp->emp.getDepartment(),Collectors.averagingInt(emp->emp.getSalary())));
        result.forEach((dep,avg)-> System.out.println("Department- "+dep+" Average- "+ avg));
    }

    public static void main(String[] args) {
        List<Employee_avg> employees=new ArrayList<>(Arrays.asList(
                new Employee_avg("Aanchal", "IT", 100000),
                new Employee_avg("Abhishek", "IT", 50000),
                new Employee_avg("Ankit", "IT", 70000),
                new Employee_avg("Rahul", "HR", 40000),
                new Employee_avg("Tina", "HR", 45000),
                new Employee_avg("Esha", "Finance", 60000),
                new Employee_avg("Naman", "Finance", 55000),
                new Employee_avg("Sachit", "IT", 80000),
                new Employee_avg("Pushp", "Marketing", 50000),
                new Employee_avg("Sumit", "Marketing", 52000)
        ));
        AverageOfEachDepartment(employees);
    }
}
