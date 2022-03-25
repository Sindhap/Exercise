package com.example.Demo.Model;

public class Employee {
	 private String empId;
	    private String empName;
	    private String empSalary;
	   // private String empSkill;
	    private String empDesignation;
	   //private String empDept;
	   private Department departments;
		private Skill skills;
	public Department getDepartments() {
			return departments;
		}
		public void setDepartments(Department departments) {
			this.departments = departments;
		}
		public Skill getSkills() {
			return skills;
		}
		public void setSkills(Skill skills) {
			this.skills = skills;
		}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public Employee(String empId, String empName, String empSalary, String empDesignation, Department departments,
			Skill skills) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
		this.departments = departments;
		this.skills = skills;
	}
	
	
}
