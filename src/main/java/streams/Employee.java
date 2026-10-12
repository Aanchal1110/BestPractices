package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
@Override
public String toString(){
    return "Employee name is " +name+ " Employee dep is " +department+
            " Employee salary is "+ getSalary();
}
    private String name;
    private String department;
    private int Salary;

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
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public Employee(String name, String department, int Salary){
        super();
        this.name=name;
        this.department=department;
        this.Salary=Salary;
    }

    public static void findSalaryGreaterThan(List<Employee> list) {
        List<Employee> first = list.stream().sorted(Comparator.comparing(Employee::getSalary)
                .thenComparing(Employee::getName)).collect(Collectors.toList());

        if (!first.isEmpty()) {
            System.out.println("The first employee with salary greater than 500000 is " + first);
        }

    }

    public static void findToptwoEmployeesWithHighestSalary(List<Employee> list){
        List<Employee> result=list.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).limit(2).collect(Collectors.toList());
        System.out.println(result);
    }

    public static void findTopTwoEmployeeWithHighestSalaryUsingCustomLogic(List<Employee> list){
        list.stream().sorted((emp1,emp2)-> {
            if(emp1.getSalary()>emp2.getSalary()){
                return 1;
            } else if (emp1.getSalary()< emp2.getSalary()) {
                return -1;
            }else {
                return emp1.getName().compareTo(emp2.getName());
            }
        }).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>(Arrays.asList(
                new Employee("Abhishek", "IT", 50000),
                new Employee("Ankit", "IT", 70000),
                new Employee("Rahul", "HR", 40000),
                new Employee("Tina", "HR", 45000),
                new Employee("Esha", "Finance", 60000),
                new Employee("Naman", "Finance", 55000),
                new Employee("Sachit", "IT", 80000),
                new Employee("Pushp", "Marketing", 50000),
                new Employee("Sumit", "Marketing", 52000)
        ));
        findSalaryGreaterThan(employees);

        findToptwoEmployeesWithHighestSalary(employees);
        findTopTwoEmployeeWithHighestSalaryUsingCustomLogic(employees);
    }
}
