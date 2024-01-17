package Utility;

import java.time.LocalDate;
import java.util.List;

public class EmployeeUtil {
    
    public static List<Employee> getEmployees(){

        return List.of(
            new Employee("Harish Kumar", 3236, 25000, Position.Software_Engineer, Department.Application_Department_Services, LocalDate.of(2021, 8, 11)),
            new Employee("Bhaskar Reddy", 3234, 20000, Position.Trainee_Software_Engineer, Department.Application_Department_Services, LocalDate.of(2022, 8, 22)),
            new Employee("Nanda Kumar", 3228, 26000, Position.Software_Engineer, Department.Application_Department_Services, LocalDate.of(2023, 6, 15)),
            new Employee("Tejas", 3222, 30000, Position.Trainee_Software_Engineer, Department.QA_Manual, LocalDate.of(2021, 8, 21)),
            new Employee("Vikas", 3224, 32000, Position.Team_Lead, Department.QA_Manual, LocalDate.of(2022, 5, 4)),
            new Employee("Jeevan", 3227, 29000, Position.Software_Engineer, Department.QA_Manual, LocalDate.of(2021, 12, 1)),
            new Employee("Praveen", 3445, 40000, Position.Team_Lead, Department.QA_Automation, LocalDate.of(2023, 3, 10)),
            new Employee("Swathi", 3553, 45000, Position.Software_Engineer, Department.QA_Automation, LocalDate.of(2021, 8, 17)),
            new Employee("David", 3634, 50000, Position.Trainee_Software_Engineer, Department.QA_Automation, LocalDate.of(2023, 7, 8)),
            new Employee("Madhu", 3531, 53000, Position.Team_Lead, Department.Application_Department_Services, LocalDate.of(2022, 2, 6))
        );
    }
}
