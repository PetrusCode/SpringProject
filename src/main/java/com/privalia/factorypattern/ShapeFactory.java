package com.privalia.factorypattern;

public class ShapeFactory {

	public Shape getShape(String packageName) {

		if (createObject(packageName) instanceof Shape) {

			Shape shape = (Shape) createObject(packageName);
			return shape;
		}

		return null;
	}

	static Object createObject(String className) {
		Object object = null;
		try {
			Class<?> classDefinition = Class.forName(className);
			object = classDefinition.newInstance();

		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return object;
	}

}
