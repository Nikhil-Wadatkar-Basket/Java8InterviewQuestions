package com.bs.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.bs.beans.Employee;

public class Test {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("nikhil", "neha", "parikshit", "dhananjay", "gaurav");
		List<Integer> numbers = Arrays.asList(12, 34, 56, 45, 7, 3, 43, 463, 46, 9);
		List<Employee> employees = Employee.getEmployees();

//		 sort names
		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames);
//		sort numbers
		System.out.println(numbers.stream().sorted().collect(Collectors.toList()));

//		sort employees
		employees.stream().distinct().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
	}

}
