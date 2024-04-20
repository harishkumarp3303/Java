package Sorting;

import java.util.List;

public class Sorting {
	
	
	public static void main(String[] args) {
		
		List<Employee> employees=List.of(new Employee("Akash", 10), 
				new Employee("Harish", 30), new Employee("Karthik", 50), 
				new Employee("Madhan", 60), new Employee("Narendra", 80));
		
		List<Employee> li=employees.stream().sorted((e1,e2)->{
			return e2.name.compareTo(e1.name);
		}).toList();
		
		System.out.println(li);
		
		List<Employee> li2=employees.stream().sorted().toList();
		
		System.out.println(li2);
		
	}

}


class Employee implements Comparable<Employee>{
	String name;
	
	int age;
	
	

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return o.age-this.age;
	}
	
	
}