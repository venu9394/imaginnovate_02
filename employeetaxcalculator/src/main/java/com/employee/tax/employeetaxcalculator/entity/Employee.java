package com.employee.tax.employeetaxcalculator.entity;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull(message = "FirstName cann't be null")
	@NotEmpty(message = "FirstName cann't be Empty!")
	private String firstName;
	@NotNull(message = "LastName cann't be null")
	@NotEmpty(message = "LastName cann't be Empty!")
	private String lastName;
	@Email(message = "Email should be valid")
	private String email;
	@NotNull(message = "PhoneNumber cann't be null")
	@NotEmpty(message = "PhoneNumber cann't be Empty!")
	private List<String> phoneNumber;
	@NotNull(message = "Date of Join  cann't be null")
	private Date doj;
	@NotNull(message = "Salary cann't be null")
	private Double Sal;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Double getSal() {
		return Sal;
	}

	public void setSal(Double sal) {
		Sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", doj=" + doj + ", Sal=" + Sal + "]";
	}
	
}
