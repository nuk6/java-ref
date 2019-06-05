package customannotations;

public class AnnotationTest {
	
	@MyAnnotation
	public void myMethod() {
		System.out.println("Testing Annotations");
	}
}
