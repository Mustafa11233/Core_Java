package in.ashokit.ref;

import java.lang.reflect.Field;

public class Demo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		//loading class into jvm
		Class clz = Class.forName("in.ashokit.Student");
		
		//creating the object for loaded class
		Object object = clz.newInstance();
		
		//getting the field whose name is age
		Field field = clz.getDeclaredField("age");
		
		
		
		//making variable accessible outside of the class
		field.setAccessible(true);
		
		//set value to field
		field.set(object, 35);
		
		Student s=(Student)object;
		s.getAge();
	}

}
