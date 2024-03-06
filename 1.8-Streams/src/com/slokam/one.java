package com.slokam;

import java.util.ArrayList;
import java.util.List;

public class one {

		public static void main(String[] args) {
			getStudents().stream().filter((s)->{
				if(s.getSsal()<5000)return true;
				else return false;
			}).forEach((s)->{
				System.out.println(s);
			});
			
		}
	
		public static List<Student> getStudents(){
			Student std1 = new Student(1, "One", 222, 22,"Btech",8990.0);
			Student std2 = new Student(2, "Two", 522, 27,"Btech",800.0);
			Student std3 = new Student(3, "Three", 822, 29,"Mtech",8888.8);

			List<Student> students = new ArrayList<>();
			students.add(std1);
			students.add(std2);
			students.add(std3);
			return students;
		
		}
	}

