package string.buffer;

public class SBDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append("All the power is within you");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.hashCode());
		sb.append("You can do anything!");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		sb.append("jsdjjsdkkjksk");
		System.out.println(sb.hashCode());
	}
}
