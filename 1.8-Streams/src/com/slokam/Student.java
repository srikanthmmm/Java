package com.slokam;

import java.util.Objects;

public class Student {

	private Integer id;
	private String name;
	private Integer marks;
	private Integer age;
	private String qual;
	private Double ssal;
	

	
	public Student(Integer id, String name, Integer marks, Integer age, String qual, Double ssal) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
		this.qual = qual;
		this.ssal = ssal;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSsal() {
		return ssal;
	}
	public void setSsal(Double ssal) {
		this.ssal = ssal;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + ", qual=" + qual
				+ ", ssal=" + ssal + "]";
	}
	
	
	
	
}
