package streams;

import java.util.*;
import java.util.stream.Collectors;

public class FindTheEmployeWithSalaryGreaterThan {
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

    public FindTheEmployeWithSalaryGreaterThan(String name, String department, int Salary){
        super();
        this.name=name;
        this.department=department;
        this.Salary=Salary;
    }

    public static void findSalaryGreaterThan(List<FindTheEmployeWithSalaryGreaterThan> list) {
        List<FindTheEmployeWithSalaryGreaterThan> first = list.stream().sorted(Comparator.comparing(FindTheEmployeWithSalaryGreaterThan::getSalary)
                .thenComparing(FindTheEmployeWithSalaryGreaterThan::getName)).collect(Collectors.toList());

        if (!first.isEmpty()) {
            System.out.println("The first employee with salary greater than 500000 is " + first);
        }

    }
    public static void main(String[] args) {
        List<FindTheEmployeWithSalaryGreaterThan> employees=new ArrayList<>(Arrays.asList(
                new FindTheEmployeWithSalaryGreaterThan("Abhishek", "IT", 50000),
                new FindTheEmployeWithSalaryGreaterThan("Ankit", "IT", 70000),
                new FindTheEmployeWithSalaryGreaterThan("Rahul", "HR", 40000),
                new FindTheEmployeWithSalaryGreaterThan("Tina", "HR", 45000),
                new FindTheEmployeWithSalaryGreaterThan("Esha", "Finance", 60000),
                new FindTheEmployeWithSalaryGreaterThan("Naman", "Finance", 55000),
                new FindTheEmployeWithSalaryGreaterThan("Sachit", "IT", 80000),
                new FindTheEmployeWithSalaryGreaterThan("Pushp", "Marketing", 50000),
                new FindTheEmployeWithSalaryGreaterThan("Sumit", "Marketing", 52000)
        ));
        findSalaryGreaterThan(employees);
    }
}
