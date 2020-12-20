package com.EmployeePortal.socgen.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import com.EmployeePortal.socgen.Enums.Gender;
@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@Column(name = "first_name")
	@NotBlank(message = "First Name can not be null")
	private String firstName;

	@Column(name = "last_name")
	@NotBlank(message = "Last Name can not be null")
	private String lastName;

	@Column(name = "gender")
	@NotBlank(message = "Gender can not be null")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Column(name = "department")
	@NotBlank(message = "Department can not be null")
	private String department;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_of_birth")
	@NotBlank(message = "Date of Birth can not be null")
	private Date dateOfBirth;

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
