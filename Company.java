package com.example.Demo.Model;

public class Company {
	private Department departments;
	public Department getDepartments() {
		return departments;
	}
	public void setDepartments(Department departments) {
		this.departments = departments;
	}
	public Employee getEmployees() {
		return employees;
	}
	public void setEmployees(Employee employees) {
		this.employees = employees;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	private Employee employees;
	
	 private String companyId;
	    private String companyName;
}
