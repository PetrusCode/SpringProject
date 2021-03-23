package com.privalia.ejercicio2;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "student")
public class Student {

	@Autowired
	@Value("1")
	private Integer IdStudent;

	@Autowired
	@Value("Marco")
	private String name;

	@Autowired
	@Value("Julio")
	private String surname;

	@Autowired
	@Value("28")
	private Integer age;

	@Autowired
	@Value("#{T(java.time.LocalDate).parse('1991-12-12')}")
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
