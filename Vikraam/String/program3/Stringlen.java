package program3;

public class Stringlen {

	public static void main(String[] args) {
		String s="vikraam";
		int count=0;
		for(char c:s.toCharArray()) {
			count++;
		}
		System.out.println(count);
	}
}
