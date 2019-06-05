package reflection;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class ReflectionDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> myClass = Class.forName(MyClass.class.getName());
		System.out.println(myClass.getName());
		System.out.println(Arrays.toString(myClass.getConstructors()));
		System.out.println(Arrays.toString(myClass.getDeclaredFields()));
		System.out.println(Arrays.toString(myClass.getAnnotations()));
		MyAnnotation myAnnotation = (MyAnnotation) myClass.getAnnotations()[0];
		System.out.println(myAnnotation.value1());
		System.out.println(myAnnotation.value2());
	}
}
