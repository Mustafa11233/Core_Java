package in.ashokit.ref;

import java.lang.reflect.Method;

public class Employee {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class<?> forName = Class.forName("in.ashokit.ref.Student");
		Method method = forName.getDeclaredMethod("getAge");
		Object newInstance = forName.newInstance();
		method.invoke(newInstance,null);
		
	}

}
