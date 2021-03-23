package com.privalia.factorypattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape1 = shapeFactory
				.getShape("com.privalia.factorypattern.Circle");

		shape1.draw();

		Shape shape2 = shapeFactory
				.getShape("com.privalia.factorypattern.Rectangle");

		shape2.draw();

		Shape shape3 = shapeFactory
				.getShape("com.privalia.factorypattern.Square");

		shape3.draw();
	}

}
