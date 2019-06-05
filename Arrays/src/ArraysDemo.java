import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		char arr[] = {'A', 'S', 'Z', 'U', 'W'};
		int index = Arrays.binarySearch(arr, 'Z');
		System.out.println("Index is : "+ index);
		}
}
