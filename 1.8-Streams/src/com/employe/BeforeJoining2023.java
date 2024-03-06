package com.employe;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BeforeJoining2023 {
	
	public static void main(String[] args) {
		
		List<Employe> employes= new ListOfEmployess().getEmployees();
		
		List<Employe> employess= employes.stream()
								.filter(emp-> emp.getDateOfJoining()<2023)
								.collect(Collectors.toList());
		
		System.out.println("before Joining 2020:"+employess);
	}

}
