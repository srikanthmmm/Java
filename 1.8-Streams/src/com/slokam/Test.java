package com.slokam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
	
	public static void main5(String[] args) {
		Map<String, Set<Student>> map = 
				getStudents().stream().
				collect(Collectors.groupingBy(Student::getQual , Collectors.toSet()) );
		System.out.print(map);
	}
	
	public static void main8(String[] args) {
		Map<String, Double> map = getStudents().stream().collect(Collectors.groupingBy(Student::getQual , Collectors.averagingDouble(Student::getAge) ));
	
		System.out.println(map);
	}
	public static void main7(String[] args) {
	 Map<String, Integer> map = getStudents().stream()
				.collect(Collectors.groupingBy(Student::getQual,Collectors.summingInt(Student::getAge) ));
	
	System.out.println(map);
	}
	
	//Alfabets coiunt
	public static void main67(String[] args) {
		List<String> list = Arrays.asList("A","B","A","C","C","D","E","A");
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		Map<Student, Long> map = getStudents().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting() ));
		
		System.out.println(map);
	}
	public static void main12(String[] args) {
		Map<String, List<Student>> map =  getStudents().stream().collect(Collectors.groupingBy(Student::getQual));
	
		System.out.println(map);
	
	}
	public static void main3(String[] args) {
		List<String> list = getStudents().stream().filter((s)->{
			if(s.getMarks()>500) return true;
			else return false;
		}).map((s)->{
			return s.getName();
		}).collect(Collectors.toList()); 
	
		
		System.out.println(list);
	}
	
	
	//
	public static void main2(String[] args) {
		
		List<Student> students = getStudents().stream().filter((s)->{
			if(s.getAge()>=25) {
				return true;
			}
			else return false;
		}).collect(Collectors.toList());
			
		
	}
	
     //below 25age students
	public static void main1(String[] args) {
		getStudents().stream().filter((s)->{
			if(s.getSsal()<5000)return true;
			else return false;
		}).forEach((s)->{
			System.out.println(s);
		});
	}
	
		
	public static List<Student> getStudents(){
		Student std1 = new Student(1, "One", 222, 22,"Btech",8990.0);
		Student std2 = new Student(2, "Two", 522, 27,"Btech",9000.0);
		Student std3 = new Student(3, "Three", 822, 29,"Mtech",8888.8);
		Student std4 = new Student(4, "Four", 922, 21,"Mtech",8989.9);
		Student std5 = new Student(5, "Five", 122, 25,"Btech",998.90);
		Student std6 = new Student(5, "Five", 122, 25,"Btech",898.90);
		Student std7 = new Student(5, "Five", 122, 25,"Btech",9809.09);
		List<Student> students = new ArrayList<>();
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(std4);
		students.add(std5);
		students.add(std6);
		students.add(std7);
		return students;
	}
}
