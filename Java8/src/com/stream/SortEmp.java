package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmp {
//	for (Map.Entry<String, List<Employee>> entry : empMap.entrySet()) {
//	    System.out.println(entry.getKey());  // print department name
//
//	    entry.getValue().stream()
//	            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//	            .limit(3)
//	            .forEach(System.out::println);
//	}

	public static void main(String[] args) {
		List<Integer> listInt = new ArrayList<>();
		listInt.add(1);
		listInt.add(2);
		
		List<String> listStr = listInt.stream().map(intList -> intList.toString()).collect(Collectors.toList());
		
		System.out.println(listStr);
		
	}
}
