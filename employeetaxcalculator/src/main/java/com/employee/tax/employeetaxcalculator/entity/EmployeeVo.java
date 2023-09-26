package com.employee.tax.employeetaxcalculator.entity;

public class EmployeeVo {

	private int employeeCode;
	private String firstName;
	private String lastName;
	private double yearlSalary;
	private double tax;
	private Double cess;

	
	
	public EmployeeVo(int employeeCode, String firstName, String lastName, double yearlSalary, double tax,
			Double cess) {
		super();
		this.employeeCode = employeeCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearlSalary = yearlSalary;
		this.tax = tax;
		this.cess = cess;
	}

	public int getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getYearlSalary() {
		return yearlSalary;
	}

	public void setYearlSalary(double yearlSalary) {
		this.yearlSalary = yearlSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Double getCess() {
		return cess;
	}

	public void setCess(Double cess) {
		this.cess = cess;
	}

}
