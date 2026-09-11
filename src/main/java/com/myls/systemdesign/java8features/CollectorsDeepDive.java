package com.myls.systemdesign.java8features;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDeepDive {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Durga", "IT", 20);
		Employee emp2 = new Employee("Sameer", "IT", 30);
		Employee emp3 = new Employee("Thanush", "DC", 25);
		Employee emp4 = new Employee("Abhishek", "DC", 40);
		Employee emp5 = new Employee("James", "IT", 10);

		List<Employee> employees = List.of(emp1, emp2, emp3, emp4, emp5);
		List<String> names = employees.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println(names);
		Map<String, Employee> byName = employees.stream()
				.collect(Collectors.toMap(Employee::getName, e -> e, (existing, duplicate) -> existing));
		System.out.println(byName);

		Map<String, List<Employee>> grop = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

		System.out.println(grop);

		Map<String, Double> avgSalaryByDept = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println(avgSalaryByDept);
		Map<String, Long> countByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(countByDept);

		Map<Boolean, List<Employee>> highEarners = employees.stream()
				.collect(Collectors.partitioningBy(e -> e.getSalary() > 20));
		System.out.println(highEarners);

		String cvs = employees.stream().map(Employee::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(cvs);
	}
}
