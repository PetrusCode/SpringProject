package com.privalia.presentation.annotations2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();

		annotationContext.scan("com.privalia.presentation.annotations2");
		annotationContext.refresh();

		HelloWorld helloWorld = annotationContext.getBean(HelloWorld.class);

		System.out.println(helloWorld.getHello());

		HelloWorld helloWorl1 = (HelloWorld) annotationContext
				.getBean("helloWorld");
		System.out.println(helloWorl1.getHello());

		annotationContext.close();
	}

}
