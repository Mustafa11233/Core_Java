package in.ashokit;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class name = Class.forName("in.ashokit.Student");
		Field[] fields = name.getDeclaredFields();
		for(Field f:fields) {
			System.out.println(f);
		}
		Method[] methods = name.getDeclaredMethods();
		for(Method m:methods) {
			System.out.println(m);
		}
		Constructor[] constructors = name.getDeclaredConstructors();
		for(Constructor c:constructors) {
			System.out.println(c);
		}
	}

}
