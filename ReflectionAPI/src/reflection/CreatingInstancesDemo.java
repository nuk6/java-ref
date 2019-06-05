package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class CreatingInstancesDemo {
	public static void main(String[] args)  {
		Class<?> myClass;
		try {
			myClass = Class.forName(MyClass.class.getName());
			Constructor<?> defaultCons = myClass.getConstructor(null);
			Constructor<?> param1Int = myClass.getConstructor(int.class);
			Constructor<?> param1String = myClass.getConstructor(String.class);
			Constructor<?> param2IntString = myClass.getConstructor(int.class,String.class);
			MyClass mc0 = (MyClass) defaultCons.newInstance(null);
			MyClass mc1 = (MyClass) param1Int.newInstance(14);
		    MyClass mc2 = (MyClass) param1String.newInstance("Nk");
		    MyClass mc3 = (MyClass) param2IntString.newInstance(15,"Vn");
			System.out.println(mc0);
			System.out.println(mc1);
			System.out.println(mc2);
			System.out.println(mc3);
			Method getterId = myClass.getMethod("getId", null);
			int invoke = (int) getterId.invoke(mc3, null);
			System.out.println(invoke);
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
		}
	}
}
