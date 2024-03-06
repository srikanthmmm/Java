package com.employe;


public class Employe {
	
	
	private Integer id;
	private String empName;
	private Integer age;
	private Integer salary;
	private Integer dateOfJoining;
	private String desg;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Integer dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", empName=" + empName + ", age=" + age + ", salary=" + salary + ", dateOfJoining="
				+ dateOfJoining + ", desg=" + desg + "]";
	}
	public Employe(Integer id, String empName, Integer age, Integer salary, Integer dateOfJoining, String desg) {
		super();
		this.id = id;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.desg = desg;
	}
	
	
	

}
