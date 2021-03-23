package com.privalia.ejercicio2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annotationcontext = new AnnotationConfigApplicationContext();
		annotationcontext.scan("com.privalia.ejercicio2");
		annotationcontext.refresh();

		Student student = (Student) annotationcontext.getBean("student");

		System.out.println(student.getIdStudent());
		System.out.println(student.getName());
		System.out.println(student.getSurname());
		System.out.println(student.getAge());
		System.out.println(student.getDateOfBirth());

		annotationcontext.close();
	}

}
