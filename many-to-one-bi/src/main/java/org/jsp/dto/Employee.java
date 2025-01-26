package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + ", salary=" + salary + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	private String name,desg;
	 private double salary;
	 
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn
	 private Department dept;

}
