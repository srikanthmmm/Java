package com.employe;

import java.util.ArrayList;
import java.util.List;

public class ListOfEmployess {
	
	
	public static List<Employe> getEmployees(){
		
		List<Employe> emp= new ArrayList<>();
		emp.add(new Employe(1, "Srikanth", 25,25000,2022,"Developer" ));
		emp.add(new Employe(2, "Shruthi", 23, 20000, 2023, "teater"));
		emp.add(new Employe(3, "Nimmi", 22, 30000, 2021, "Python"));
		emp.add(new Employe(4, "Chandana", 21, 40000,2021, "Enjineer"));
		emp.add(new Employe(5, "Mahi", 20, 50000, 2020, "SAP"));
		return emp;
		
	}

}
