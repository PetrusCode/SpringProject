package com.privalia.ejercicio1;

import java.time.LocalDate;

public class Student {
	private Integer IdStudent;
	private String name;
	private String surname;
	private Integer age;
	private LocalDate DateOfBirth;

	public Student() {

	}

	public Integer getIdStudent() {
		return IdStudent;
	}

	public void setIdStudent(Integer idStudent) {
		IdStudent = idStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

}
