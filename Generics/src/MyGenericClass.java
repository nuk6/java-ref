
public class MyGenericClass<K,V>{
	K key;
	V value;
	public MyGenericClass(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public void getType() {
		System.out.println(this.key.getClass());
		System.out.println(this.value.getClass());
	}
}
