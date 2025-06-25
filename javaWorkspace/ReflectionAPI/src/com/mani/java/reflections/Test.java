package com.mani.java.reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class<?> myClass = Class.forName(Calculator.class.getName());
			System.out.println(myClass.getName());//get class name
			Constructor<?>[] constructors = myClass.getConstructors();
			System.out.println(Arrays.toString(constructors));//get all the constructor name from the class
			System.out.println(Arrays.toString(myClass.getMethods()));//get all the method name from the class
			
			Constructor<?> cons=myClass.getConstructor(null);//define default constructor and call
			System.out.println(cons.newInstance(null));//create object of the class
			
			Constructor<?> cons1=myClass.getConstructor(double.class,double.class);//define a parameterized constructor
			Object myObj = cons1.newInstance(5.0,3.1);//create object and pass value to argument of constructor
			
			Method setnum1=myClass.getMethod("setNum1", double.class);
			setnum1.invoke(myObj, 7.1);
			
			Method setnum2=myClass.getMethod("setNum2", double.class);
			setnum2.invoke(myObj, 2.0);
			
			Field num1Field = myClass.getDeclaredField("num1");
			num1Field.setAccessible(true);
			num1Field.set(myObj, 20);
			
			
			Method method=myClass.getMethod("getNum1", null);
			System.out.println(method.invoke(myObj, null));
			
			Method method1=myClass.getMethod("getNum2", null);
			System.out.println(method1.invoke(myObj, null));
			
			
			
			Method sumn1=myClass.getMethod("sum",int.class,int.class);
			
			System.out.println(sumn1.invoke(myObj,2,5));
			
			
			Annotation[] annotations = myClass.getAnnotations();
			System.out.println(annotations);
			
			Annotation annotation = (MyAnnotataion)annotations[0];
			System.out.println(((MyAnnotataion) annotation).value1());
			System.out.println(((MyAnnotataion) annotation).value2());
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
