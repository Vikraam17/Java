package programs;

public class StringToArray {
	public static void main(String[] args) {
		String s1="abcd";
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i)+" ");
		}
		System.out.println();
		char[] arr=s1.toCharArray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
