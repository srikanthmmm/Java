package com.srik;

public class Emp {
	
	
	private int eid;
	private String name;
	private String qul;
	private int salary;
	public int getEid() {
		return eid;
	}
	public String getQul() {
		return qul;
	}
	public void setQul(String qul) {
		this.qul = qul;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", qul=" + qul + ", salary=" + salary + "]";
	}
	public Emp(int eid, String name, String qul, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.qul = qul;
		this.salary = salary;
	}
	
	

}
