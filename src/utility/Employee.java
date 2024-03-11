package utility;

import java.time.LocalDate;

public class Employee {
    private String name;
    private int employeeId;
    private double salary;
    private Position position;
    private Department department;
    private LocalDate hireDate;
    public Employee() {
    }
    public Employee(String name, int employeeId, double salary, Position position, Department department, LocalDate hireDate) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.hireDate = hireDate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public LocalDate getHireDate() {
        return hireDate;
    }
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + ", position=" + position
                + ", department=" + department + ", hireDate=" + hireDate + "]";
    }

    
    
}




