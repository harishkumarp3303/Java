package Java8.Problems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Utility.Department;
import Utility.Employee;
import Utility.EmployeeUtil;

public class Problem1 {
     public static void main(String[] args) {
        
        // Given a list of Employee objects, filter out the employees whose salary is greater 
        // than 30000 and then create a new list with their names.

        List<String> listWithNames=EmployeeUtil.getEmployees().stream().filter(x->x.getSalary()>=30000).map(x->x.getName()).toList();

        System.out.println(listWithNames);
      
        Map<Department,List<Employee>> departmentsemployees=EmployeeUtil.getEmployees().stream().filter(x->x.getDepartment().equals(Department.Application_Department_Services)).collect(Collectors.groupingBy(x->x.getDepartment()));
        
        System.out.println(departmentsemployees);

        
     }
}
